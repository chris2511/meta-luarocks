SUMMARY = "LuaRocks is the package manager for the Lua programming language"
HOMEPAGE = "https://github.com/luarocks/luarocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a26c606953a58c545aa194713fcdfc8"

DEPENDS += "\
            curl-native \
            lua-native \
            openssl-native \
            unzip-native \
            lua \
            "

SRC_URI = "git://github.com/luarocks/luarocks;protocol=https;branch=master \
           file://0001-luarocks-native-avoid-using-host-libs-and-includes.patch \
           "
SRCREV = "0e3f817f57ef6280d8e35a9954befaf05bdab61b"

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
