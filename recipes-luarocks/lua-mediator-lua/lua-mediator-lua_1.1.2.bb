SUMMARY = "Event handling through channels"
DESCRIPTION = "mediator_lua allows you to subscribe and publish to a central object so you can decouple function calls in your application. It's as simple as mediator:subscribe("channel", function). Supports namespacing, predicates, and more."
HOMEPAGE = "http://olivinelabs.com/mediator_lua/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mediator_lua-1.1.2-0.rockspec;md5=2ef677dfdd34e53985dd5738819007f7"

SRC_URI = "git://github.com/Olivine-Labs/mediator_lua.git"
SRCREV = "31cb1367084086579079e384ccfa6a40bf63cea7"

S = "${WORKDIR}/git"

inherit luarocks
