SUMMARY = "Netlink event library"
DESCRIPTION = " The netlink library subscribes to netlink events (link, ifaddr, route, neigh) and runs a lua callback function with a table as argument for each event"
HOMEPAGE = "https://github.com/chris2511/lua-netlink"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7c89962b6cc0897cc0b2e290f50de782"

SRC_URI = "git://github.com/chris2511/lua-netlink;branch=main;protocol=https"
SRCREV = "7e383563969690de621d953baab24ef3c8545a8e"

DEPENDS += "libmnl"

S = "${WORKDIR}/git"

inherit luarocks
