DESCRIPTION = "Netlink event library"
HOMEPAGE = "https://github.com/chris2511/lua-netlink"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7c89962b6cc0897cc0b2e290f50de782"

SRC_URI = "git://github.com/chris2511/lua-netlink"
SRCREV = "v0.0.1"

DEPENDS += "libmnl"
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"

inherit luarocks
