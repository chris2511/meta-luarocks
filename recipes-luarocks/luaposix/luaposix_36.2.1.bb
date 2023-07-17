SUMMARY = "Lua bindings for POSIX"
DESCRIPTION = "A library binding various POSIX APIs. POSIX is the IEEE Portable Operating System Interface standard. luaposix is based on lposix."
HOMEPAGE = "http://github.com/luaposix/luaposix/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f30d022f6ef53952fa87cc0b6fffb153"
DEPENDS += "virtual/crypt"

SRC_URI = "git://github.com/luaposix/luaposix.git;branch=release-v36.2;protocol=https"
SRCREV = "5a8d8c768fc3c51f42cb591e9523a60399efc6a1"

S = "${WORKDIR}/git"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
