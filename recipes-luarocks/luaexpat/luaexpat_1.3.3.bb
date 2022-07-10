SUMMARY = "XML Expat parsing"
DESCRIPTION = "LuaExpat is a SAX (Simple API for XML) XML parser based on the Expat library."
HOMEPAGE = "http://www.keplerproject.org/luaexpat/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08f74f30546f86d3810c14c6fd869efe"

SRC_URI = "git://github.com/tomasguisasola/luaexpat.git;branch=master;protocol=https"
SRCREV = "78adc136554a2be8ce16fd1a9c2860fd1ca272ca"

S = "${WORKDIR}/git"

DEPENDS += "expat"

inherit luarocks
