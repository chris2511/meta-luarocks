SUMMARY = "Lua utility libraries loosely based on the Python standard libraries"
DESCRIPTION = "Penlight is a set of pure Lua libraries focusing on input data handling (such as reading configuration files), functional programming (such as map, reduce, placeholder expressions,etc), and OS path management. Much of the functionality is inspired by the Python standard libraries."
HOMEPAGE = "https://lunarmodules.github.io/penlight"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0a2993b604147dcce1ea113b72b618cd"

SRC_URI = "git://github.com/lunarmodules/penlight.git"
SRCREV = "${PV}"

DEPENDS += "luafilesystem"
RDEPENDS_${PN} = "luafilesystem"

S = "${WORKDIR}/git"

inherit luarocks
