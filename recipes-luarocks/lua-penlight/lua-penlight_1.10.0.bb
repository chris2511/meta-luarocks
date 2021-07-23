DESCRIPTION = "Lua utility libraries loosely based on the Python standard libraries"
HOMEPAGE = "https://lunarmodules.github.io/penlight"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0a2993b604147dcce1ea113b72b618cd"

SRC_URI = "git://github.com/lunarmodules/penlight.git"
SRCREV = "1.10.0"

DEPENDS += "luafilesystem"
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"

inherit luarocks
