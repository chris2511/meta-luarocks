DESCRIPTION = "Network support for the Lua language"
HOMEPAGE = "http://luaforge.net/projects/luasocket/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab6706baf6d39a6b0fa2613a3b0831e7"

SRC_URI = "git://github.com/diegonehab/luasocket.git;protocol=https"
SRCREV = "5b18e475f38fcf28429b1cc4b17baee3b9793a62"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"
LUAROCKS_ROCKSPEC = "rockspec/luasocket-scm-2.rockspec"

inherit luarocks
