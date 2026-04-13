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

SRC_URI = "git://github.com/luarocks/luarocks;protocol=https;branch=main \
           "
SRCREV = "fc402072fca856f05e8ae09799cd6c2a2352dd17"

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
