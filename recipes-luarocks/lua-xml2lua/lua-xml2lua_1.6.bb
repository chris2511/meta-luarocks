SUMMARY = "An XML Parser written entirely in Lua that works for Lua 5.1+"
DESCRIPTION = " Enables parsing a XML string into a Lua Table and converting a Lua Table to an XML string. "
HOMEPAGE = "http://manoelcampos.github.io/xml2lua/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ffef13ddaaf59a060cc6d8c355138aad"

SRC_URI = "git://github.com/manoelcampos/xml2lua;branch=master;protocol=https"
SRCREV = "054dea34d77bc53762331d1cc5026c66d87de768"
S = "${WORKDIR}/git"

inherit luarocks
