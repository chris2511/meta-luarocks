SUMMARY = "XML Expat parsing"
DESCRIPTION = "LuaExpat is a SAX (Simple API for XML) XML parser based on the Expat library."
HOMEPAGE = "http://www.keplerproject.org/luaexpat/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08f74f30546f86d3810c14c6fd869efe"

SRC_URI = "https://github.com/tomasguisasola/luaexpat/archive/v${PV}.tar.gz"
SRC_URI[sha256sum] = "a17a0e6ffa6977406b072d67a13ca0e125fad63e1229cec4efcd8d83f1c3eed9"

DEPENDS += "expat"

inherit luarocks
