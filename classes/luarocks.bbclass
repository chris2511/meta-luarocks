
BBCLASSEXTEND = "native nativesdk"

inherit luaversion

DEPENDS += "luarocks-native lua"
RDEPENDS:${PN} += "lua"
RDEPENDS:${PN}-dev += "lua"

FILES:${PN} += "${libdir} ${datadir}"
FILES:${PN}-dev = "${libdir}/luarocks"

ROCKINSTALL = "${WORKDIR}/rockinst/usr"
do_configure() {
  cat > ${WORKDIR}/luarocks.config << EOF
rocks_trees = { "${STAGING_EXECPREFIXDIR}", "${ROCKINSTALL}" }
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
  export LUA_PATH=${STAGING_DATADIR_NATIVE}/lua/${LUA_VERSION}/?.lua
  ${STAGING_BINDIR_NATIVE}/lua ${STAGING_BINDIR_NATIVE}/luarocks --only-sources= make --deps-mode=none --no-manifest --verify ${LUAROCKS_ROCKSPEC}
}

do_install() {
  if test $(ls ${ROCKINSTALL} --hide=lib --hide=share --hide=bin); then
    echo "${ROCKINSTALL}/ contains unexpected files, other than bin/ lib/ and share/"
    exit 1
  fi
  if test -d ${ROCKINSTALL}/lib; then
    install -d -m 0755 ${D}${libdir}
    cp -dR ${ROCKINSTALL}/lib/* ${D}${libdir}
  fi
  if test -d ${ROCKINSTALL}/share; then
    install -d -m 0755 ${D}${datadir}
    cp -dR ${ROCKINSTALL}/share/* ${D}${datadir}
  fi
  if test -d ${ROCKINSTALL}/bin; then
    install -d -m 0755 ${D}${bindir}
    cp -dR ${ROCKINSTALL}/bin/* ${D}${bindir}
  fi
}
