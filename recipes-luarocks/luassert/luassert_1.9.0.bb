SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without compromising builtin assertion functionality."
HOMEPAGE = "http://olivinelabs.com/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=005de8f8f73245c988a708cf1cace960"

SRC_URI = "git://github.com/Olivine-Labs/luassert.git;branch=master;protocol=https"
SRCREV = "8d8dc8a54cc468048a128a867f6449a6c3fdd11a"

DEPENDS += "lua-say"
RDEPENDS:${PN} += "lua-say"

S = "${WORKDIR}/git"

inherit luarocks
