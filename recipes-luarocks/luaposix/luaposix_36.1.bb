SUMMARY = "Lua bindings for POSIX"
DESCRIPTION = "A library binding various POSIX APIs. POSIX is the IEEE Portable Operating System Interface standard. luaposix is based on lposix."
HOMEPAGE = "http://github.com/luaposix/luaposix/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f30d022f6ef53952fa87cc0b6fffb153"
DEPENDS += "virtual/crypt"

SRC_URI = "git://github.com/luaposix/luaposix.git;branch=release-v${PV};protocol=https"
SRCREV = "9f566db8c2c762afaefb9571d3c30a90f8ddfd6e"

S = "${WORKDIR}/git"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
