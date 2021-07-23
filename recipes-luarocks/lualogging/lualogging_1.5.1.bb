DESCRIPTION = "A simple API to use logging features"
HOMEPAGE = "https://github.com/lunarmodules/lualogging"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=0b3c61aa9de3625880d8ae5826177c98"

SRC_URI = "git://github.com/lunarmodules/lualogging.git"
SRCREV = "v1.5.1"

DEPENDS += "luasocket"
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"

inherit luarocks
