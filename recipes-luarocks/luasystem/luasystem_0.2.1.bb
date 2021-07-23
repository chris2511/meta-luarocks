DESCRIPTION = "Platform independent system calls for Lua."
HOMEPAGE = "http://olivinelabs.com/luasystem/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef16f861a016f1f85d36c973a78eb1c0"

SRC_URI = "https://github.com/o-lim/luasystem/archive/v0.2.1.tar.gz"
SRC_URI[sha256sum] = "0b83f68e9edbba92bef11ec0ccf1e5bb779a7337653f7bb77e0240c8e85c0b94"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/luasystem-0.2.1"

inherit luarocks
