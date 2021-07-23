DESCRIPTION = "Lua CJSON is a fast JSON encoding/parsing module for Lua"
LICENSE = "MIT"
HOMEPAGE = "https://github.com/mpx/lua-cjson/"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1fee3afe4f4a4b26c13016123b2d08a"

SRC_URI = "git://github.com/mpx/lua-cjson.git;branch=master"
SRCREV = "e8972ac754788d3ef10a57a36016d6c3e85ba20d"

FILES_${PN}-ptest = "${bindir} ${prefix}/share"

inherit ptest luarocks

S="${WORKDIR}/git"
