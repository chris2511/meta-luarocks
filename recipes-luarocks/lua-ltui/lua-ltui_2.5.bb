SUMMARY = "A cross-platform terminal ui library based on Lua"
DESCRIPTION = "This framework originated from the requirements of graphical menu configuration in [xmake](https://github.com/tboox/xmake). Similar to the kernel kernel's menuconf to configure the compilation parameters, so using curses and lua to implement a cross-platform character terminal ui library."
HOMEPAGE = "https://github.com/tboox/ltui"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=836a768956590795ebc62891e377d0a5"

SRC_URI = "git://github.com/tboox/ltui;nobranch=1"
SRCREV = "v2.5"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"

inherit luarocks
