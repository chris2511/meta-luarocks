DESCRIPTION = "Network support for the Lua language"
HOMEPAGE = "http://luaforge.net/projects/luasocket/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab6706baf6d39a6b0fa2613a3b0831e7"

SRC_URI = "https://github.com/diegonehab/luasocket/archive/v3.0-rc1.zip"
SRC_URI[sha256sum] = "1ed0bc56d2dccd92644e8df79c4e52af60a57efdc7c57fe75b1e81c70e780e74"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/luasocket-3.0-rc1"

inherit luarocks
