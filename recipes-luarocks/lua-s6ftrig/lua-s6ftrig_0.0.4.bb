DESCRIPTION = "S6 fifodir library"
HOMEPAGE = "https://github.com/chris2511/lua-s6ftrig"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7c89962b6cc0897cc0b2e290f50de782"

SRC_URI = "git://github.com/chris2511/lua-s6ftrig"
SRCREV = "v${PV}"

DEPENDS += "s6 skalibs"
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"

inherit luarocks
