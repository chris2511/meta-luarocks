
BBCLASSEXTEND = "native"

LUA_VERSION="5.3"

DEPENDS += "luarocks-native"
RDEPENDS_${PN} = "lua"

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
variables = variables or { }
variables["CC"] = "${CC} -fPIC"
variables["LD"] = "${LD}"
variables["CFLAGS"] = "${CFLAGS} ${LDFLAGS}"
EOF
}

do_compile() {
  export LUA_VERSION="${LUA_VERSION}"
  export LUAROCKS_CONFIG=${WORKDIR}/luarocks.config
  export LUA_PATH=${RECIPE_SYSROOT_NATIVE}/usr/share/lua/${LUA_VERSION}/luarocks
  test "${LUA_EXTRA_EXPORTS}" && export ${LUA_EXTRA_EXPORTS}
  ${RECIPE_SYSROOT_NATIVE}/usr/bin/lua ${RECIPE_SYSROOT_NATIVE}/usr/bin/luarocks --only-sources= make --deps-mode=none --no-manifest
}

do_install() {
  cp -a "${WORKDIR}/rockinst/usr" "${D}"
  chown -R root:root "${D}"
}
