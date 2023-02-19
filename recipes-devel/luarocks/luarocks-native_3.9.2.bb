SUMMARY = "LuaRocks is the package manager for the Lua programming language"
HOMEPAGE = "https://github.com/luarocks/luarocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=c5f3b16961f66b83cf7ce9b7ffdd1d88"

DEPENDS += "\
            curl-native \
            lua-native \
            openssl-native \
            unzip-native \
            lua \
            "

SRC_URI = "git://github.com/luarocks/luarocks;protocol=https;branch=master \
           file://0001-luarocks-native-avoid-using-host-libs-and-includes.patch \
           file://0002-luarocks-avoid-LUA_BINDIR-which-may-become-huge.patch \
           "
SRCREV = "0f4c793427a1cf2b7879ee668c1479058412629c"

S = "${WORKDIR}/git"

inherit luaversion

do_configure() {
    ./configure --prefix="${prefix_native}" --lua-version="${LUA_VERSION}" \
                --with-lua="${RECIPE_SYSROOT_NATIVE}/${prefix_native}"
}

do_compile() {
    oe_runmake LUA_INCDIR="${includedir}"
}

do_install() {
    oe_runmake install DESTDIR="${D}/${base_prefix}"
}

FILES:${PN} += "${sysconfdir} ${bindir} ${datadir} ${libdir}"

inherit native
