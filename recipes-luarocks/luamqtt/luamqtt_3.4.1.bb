SUMMARY = "luamqtt - Pure-lua MQTT v3.1.1 and v5.0 client"
DESCRIPTION = "luamqtt - MQTT v3.1.1 and v5.0 client library written in pure-lua. The only dependency is luasocket to establish network connection to MQTT broker. No C-dependencies."
HOMEPAGE = "https://github.com/xHasKx/luamqtt"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8497ff0803ca32bb344bb942e74c100b"

SRC_URI = "git://github.com/xHasKx/luamqtt"
SRCREV = "bf9994a588ef18542a164427566fd29e893507b1"

RDEPENDS:${PN} = "luasocket"

S = "${WORKDIR}/git"

inherit luarocks
