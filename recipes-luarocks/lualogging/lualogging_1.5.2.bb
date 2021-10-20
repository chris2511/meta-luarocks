SUMMARY = "A simple API to use logging features"
DESCRIPTION = "LuaLogging provides a simple API to use logging features in Lua. Its design was based on log4j. LuaLogging currently supports, through the use of appenders, console, file, rolling file, email, socket and SQL outputs."
HOMEPAGE = "https://github.com/lunarmodules/lualogging"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=0b3c61aa9de3625880d8ae5826177c98"

SRC_URI = "git://github.com/lunarmodules/lualogging.git"
SRCREV = "8b4d8dd5a311245a197890405ba9324b9f5f5ab1"

DEPENDS += "luasocket"
RDEPENDS_${PN} = "luasocket"

S = "${WORKDIR}/git"

inherit luarocks
