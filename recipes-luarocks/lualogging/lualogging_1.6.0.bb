SUMMARY = "A simple API to use logging features"
DESCRIPTION = "LuaLogging provides a simple API to use logging features in Lua. Its design was based on log4j. LuaLogging currently supports, through the use of appenders, console, file, rolling file, email, socket and SQL outputs."
HOMEPAGE = "https://github.com/lunarmodules/lualogging"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=0b3c61aa9de3625880d8ae5826177c98"

SRC_URI = "git://github.com/lunarmodules/lualogging.git"
SRCREV = "0bc4415de03ff1a99c92c02a5bed14a45b078079"

DEPENDS += "luasocket"
RDEPENDS:${PN} = "luasocket"

S = "${WORKDIR}/git"

inherit luarocks
