SUMMARY = "Lua bindings for POSIX"
DESCRIPTION = "A library binding various POSIX APIs. POSIX is the IEEE Portable Operating System Interface standard. luaposix is based on lposix."
HOMEPAGE = "http://github.com/luaposix/luaposix/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f81069e00c0cad249f20efe958276db1"
DEPENDS += "virtual/crypt"

SRC_URI = "git://github.com/luaposix/luaposix.git;branch=release-v${PV}"
SRCREV = "14043c5086ae738823a5dfbc9170d9e14193fbef"

S = "${WORKDIR}/git"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
