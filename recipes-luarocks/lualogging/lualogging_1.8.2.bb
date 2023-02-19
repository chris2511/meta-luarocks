SUMMARY = "A simple API to use logging features"
DESCRIPTION = "LuaLogging provides a simple API to use logging features in Lua. Its design was based on log4j. LuaLogging currently supports, through the use of appenders, console, file, rolling file, email, socket and SQL outputs."
HOMEPAGE = "https://github.com/lunarmodules/lualogging"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=2df2c2ac8cc4f5d0e623849e57518b1c"

SRC_URI = "git://github.com/lunarmodules/lualogging.git;protocol=https;branch=master"
SRCREV = "465c994788f1bc18fca950934fa5ec9a909f496c"

DEPENDS += "luasocket"
RDEPENDS:${PN} = "luasocket"

S = "${WORKDIR}/git"

inherit luarocks
