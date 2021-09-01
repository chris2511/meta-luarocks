DESCRIPTION = "Network support for the Lua language"
HOMEPAGE = "http://luaforge.net/projects/luasocket/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab6706baf6d39a6b0fa2613a3b0831e7"

SRC_URI = "git://github.com/diegonehab/luasocket.git;protocol=https"
SRCREV = "master"
#SRC_URI[sha256sum] = "45a656e1c90801d04551fdcdaf859dcec24f76a535c47a924d0e3b626c706b88"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"
LUAROCKS_ROCKSPEC = "rockspec/luasocket-scm-2.rockspec"

inherit luarocks
