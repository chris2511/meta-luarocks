SUMMARY = "Lua bindings for Linux timerfd"
DESCRIPTION = "A binding for Linux timerfd in Lua."
HOMEPAGE = "https://github.com/chensoft/lua-timerfd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9bfb3ba788965c83177398587c3e269b"

SRC_URI = "git://github.com/chensoft/lua-timerfd"
SRCREV = "v1.0.1"
S = "${WORKDIR}/git"

# If the QA error about gnu-hash shows up, try uncommenting the following line
# LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks cmake pkgconfig
FILES:${PN}="/usr/lib/lua/${LUA_VERSION}/"