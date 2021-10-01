SUMMARY = "A command-line argument parser."
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple notations and argument types. cliargs allows you to define required, optional, and flag arguments."
HOMEPAGE = "https://github.com/amireh/lua_cliargs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e258701153972a6cb73ba10eb984c8b6"

SRC_URI = "https://github.com/amireh/lua_cliargs/archive/v3.0-2.tar.gz"
SRC_URI[sha256sum] = "971d6f1440a55bdf9db581d4b2bcbf472a301d76f696a0d0ed9423957c7d176e"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/lua_cliargs-3.0-2"

inherit luarocks
