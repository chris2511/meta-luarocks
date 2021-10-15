SUMMARY = "Event handling through channels"
DESCRIPTION = "mediator_lua allows you to subscribe and publish to a central object so you can decouple function calls in your application. It's as simple as mediator:subscribe("channel", function). Supports namespacing, predicates, and more."
HOMEPAGE = "http://olivinelabs.com/mediator_lua/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mediator_lua-1.1.2-0.rockspec;md5=2ef677dfdd34e53985dd5738819007f7"

SRC_URI = "https://github.com/Olivine-Labs/mediator_lua/archive/v${PV}-0.tar.gz"
SRC_URI[sha256sum] = "faf5859fd2081be4e9e4fb8873a2dc65f7eff3fd93d6dd14da65f8e123fcff9b"

S = "${WORKDIR}/mediator_lua-${PV}-0"

inherit luarocks
