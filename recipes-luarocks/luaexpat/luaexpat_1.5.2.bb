SUMMARY = "XML Expat parsing"
DESCRIPTION = "LuaExpat is a SAX (Simple API for XML) XML parser based on the Expat library."
HOMEPAGE = "https://lunarmodules.github.io/luaexpat/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3c520784685719e70a2b861d6959a61b"

SRC_URI = "git://github.com/lunarmodules/luaexpat.git;branch=master;protocol=https"
SRCREV = "947d2e9596ac1ff9a7c61b27e964db2db0722c88"

DEPENDS += "expat"

inherit luarocks
