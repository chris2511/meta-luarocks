
BBCLASSEXTEND = "native nativesdk"

LUA_VERSION="5.4"

DEPENDS += "luarocks-native lua"
RDEPENDS:${PN} += "lua"
RDEPENDS:${PN}-dev += "lua"

FILES:${PN} += "${libdir} ${datadir}"
FILES:${PN}-dev = "${libdir}/luarocks"

do_configure() {
  cat > ${WORKDIR}/luarocks.config << EOF
rocks_trees = { "${STAGING_EXECPREFIXDIR}",
		"${WORKDIR}/rockinst/usr" }
rocks_servers = { }
arch = "${TARGET_OS}-${TARGET_ARCH}"
target_cpu = "${TARGET_ARCH}"
lib_modules_path = "/lib/lua/${LUA_VERSION}"
gcc_rpath = false
wrap_bin_scripts = false
variables = {
  CC = "${CC} -fPIC ${LUAROCKS_EXTRA_CC}",
  LD = "${CC} ${LDFLAGS} ${LUAROCKS_EXTRA_LD}",
  CFLAGS = "${CFLAGS} ${LUAROCKS_EXTRA_CFLAGS}",
  LUA_LIBDIR = "${STAGING_LIBDIR}/lua/${LUA_VERSION}",
  LUA_INCDIR = "${STAGING_INCDIR}",
  LUA_DIR = "${STAGING_DIR_NATIVE}${prefix_native}",
  DEPS_DIR = "${STAGING_EXECPREFIXDIR}"
 }

EOF
}

do_compile() {
  export LUA_VERSION="${LUA_VERSION}"
  export LUAROCKS_CONFIG=${WORKDIR}/luarocks.config
  export LUA_PATH=${STAGING_DATADIR_NATIVE}/lua/${LUA_VERSION}/luarocks
  ${STAGING_BINDIR_NATIVE}/lua ${STAGING_BINDIR_NATIVE}/luarocks --only-sources= make --deps-mode=none --no-manifest --verify ${LUAROCKS_ROCKSPEC}
}

do_install() {
  mkdir -p "${D}${root_prefix}"
  cp -a "${WORKDIR}/rockinst/usr" "${D}${root_prefix}"
  chown -R root:root "${D}${root_prefix}"
}
