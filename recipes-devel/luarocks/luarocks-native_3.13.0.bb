SUMMARY = "LuaRocks is the package manager for the Lua programming language"
HOMEPAGE = "https://github.com/luarocks/luarocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=c5f3b16961f66b83cf7ce9b7ffdd1d88"

DEPENDS = "lua-native unzip-native"

PR = "r1"

SRC_URI = "https://luarocks.github.io/luarocks/releases/luarocks-${PV}.tar.gz \
           file://0001-luarocks-native-avoid-using-host-libs-and-includes.patch \
           file://0002-fix-correctly-handling-wrap_bin_scripts-flag.patch \
           file://0003-luarocks-avoid-LUA_BINDIR-which-may-become-huge.patch \
           file://0004-Adapt-luarocks-executable-to-use-yocto-package-paths.patch \
"

SRC_URI[sha256sum] = "245bf6ec560c042cb8948e3d661189292587c5949104677f1eecddc54dbe7e37"

inherit luaversion

do_configure() {
    ${S}/configure --prefix="${prefix_native}" --lua-version="${LUA_VERSION}" \
                --with-lua="${prefix}"
}

do_compile() {
    oe_runmake LUA_INCDIR="${includedir}"
}

do_install() {
    oe_runmake install DESTDIR="${D}/${base_prefix}"
}

inherit native
