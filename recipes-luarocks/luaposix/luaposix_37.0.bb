SUMMARY = "Lua bindings for POSIX"
DESCRIPTION = "A library binding various POSIX APIs. POSIX is the IEEE Portable Operating System Interface standard. luaposix is based on lposix."
HOMEPAGE = "http://github.com/luaposix/luaposix/"
LICENSE = "MIT AND X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a2c76dbe2ca56cf57296af9c9995c27"
DEPENDS += "virtual/crypt"

SRC_URI = "git://github.com/luaposix/luaposix.git;nobranch=1;protocol=https"
SRCREV = "1c1462a57de3319524148d1586660fff5ab9ee3b"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
