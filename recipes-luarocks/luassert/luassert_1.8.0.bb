SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without compromising builtin assertion functionality."
HOMEPAGE = "http://olivinelabs.com/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=005de8f8f73245c988a708cf1cace960"

SRC_URI = "https://github.com/Olivine-Labs/luassert/archive/v1.8.0.tar.gz"
SRC_URI[sha256sum] = "5955234a63fdc208674314b2e97982bb551459b85b8ff11611a50421c6a29c76"

DEPENDS += "lua-say"
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/luassert-1.8.0"

inherit luarocks
