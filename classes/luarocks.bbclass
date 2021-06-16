
LUA_VERSION="5.3"

DEPENDS = "luarocks-native"
RDEPENDS_${PN} = "lua"
PACKAGES =+ "${PN}-luarocks"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-luarocks = "${libdir}/luarocks"

do_configure() {
  cat > ${WORKDIR}/luarocks.config << EOF
rocks_trees = { "${WORKDIR}/rockinst/usr" }
rocks_servers = { }
arch = "${TARGET_OS}-${TARGET_ARCH}"
target_cpu = "${TARGET_ARCH}"
lib_modules_path = "/lib/lua/${LUA_VERSION}"
variables["CC"] = "${CC} -fPIC"
variables["LD"] = "${LD}"
variables["CFLAGS"] = "${CFLAGS} -Wblahhhhh"
dump_env()
EOF
}

do_compile() {
  export LUA_VERSION="${LUA_VERSION}"
  export LUAROCKS_CONFIG=${WORKDIR}/luarocks.config
  luarocks make
}

do_install() {
  cp -a "${WORKDIR}/rockinst/usr" "${D}"
  chown -R root:root "${D}"
}
