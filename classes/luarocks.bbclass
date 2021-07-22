
BBCLASSEXTEND = "native"

LUA_VERSION="5.3"

DEPENDS += "luarocks-native lua"
RDEPENDS_${PN} = "lua"
RDEPENDS_${PN}-dev = "lua"

FILES_${PN} += "${libdir} ${datadir}"
FILES_${PN}-dev = "${libdir}/luarocks"

do_configure() {
  cat > ${WORKDIR}/luarocks.config << EOF
rocks_trees = { "${RECIPE_SYSROOT}/usr",
		"${WORKDIR}/rockinst/usr" }
rocks_servers = { }
arch = "${TARGET_OS}-${TARGET_ARCH}"
target_cpu = "${TARGET_ARCH}"
lib_modules_path = "/lib/lua/${LUA_VERSION}"
variables = {
  CC = "${CC} -fPIC ${LUAROCKS_EXTRA_CC}",
  LD = "${CC} ${LDFLAGS} ${LUAROCKS_EXTRA_LD}",
  CFLAGS = "${CFLAGS} ${LUAROCKS_EXTRA_CFLAGS}",
  LUA_LIBDIR = "${RECIPE_SYSROOT}/usr/lib/lua/${LUA_VERSION}",
  LUA_INCDIR = "${RECIPE_SYSROOT}/usr/include",
  LUA_DIR = "${RECIPE_SYSROOT_NATIVE}/usr"
 }

EOF
}

do_compile() {
  export LUA_VERSION="${LUA_VERSION}"
  export LUAROCKS_CONFIG=${WORKDIR}/luarocks.config
  export LUA_PATH=${RECIPE_SYSROOT_NATIVE}/usr/share/lua/${LUA_VERSION}/luarocks
  ${RECIPE_SYSROOT_NATIVE}/usr/bin/lua ${RECIPE_SYSROOT_NATIVE}/usr/bin/luarocks --only-sources= make --deps-mode=none --no-manifest --verify
}

do_install() {
  cp -a "${WORKDIR}/rockinst/usr" "${D}"
  chown -R root:root "${D}"
}
