SUMMARY = "A command-line argument parser."
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple notations and argument types. cliargs allows you to define required, optional, and flag arguments."
HOMEPAGE = "https://github.com/amireh/lua_cliargs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e258701153972a6cb73ba10eb984c8b6"

SRC_URI = "git://github.com/amireh/lua_cliargs.git"
SRCREV = "d79076d7160293e1ec45f92e15757ed00f7d6fb9"

S = "${WORKDIR}/git"

inherit luarocks
