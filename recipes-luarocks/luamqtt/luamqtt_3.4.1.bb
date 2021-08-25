DESCRIPTION = "luamqtt - Pure-lua MQTT v3.1.1 and v5.0 client"
HOMEPAGE = "https://github.com/xHasKx/luamqtt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8497ff0803ca32bb344bb942e74c100b"

SRC_URI = "git://github.com/xHasKx/luamqtt"
SRCREV = "v3.4.1"

DEPENDS += "luasocket"
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"

inherit luarocks
