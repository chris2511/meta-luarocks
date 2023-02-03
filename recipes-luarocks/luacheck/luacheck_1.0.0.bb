SUMMARY = "A static analyzer and a linter for Lua"
DESCRIPTION = "Luacheck is a command-line tool for linting and static analysis of Lua code. It is able to spot usage of undefined global variables, unused local variables and a few other typical problems within Lua programs. "
HOMEPAGE = "https://github.com/lunarmodules/luacheck"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c1d9d1063a2e3c98965716ac8494f0"

SRC_URI = "git://github.com/lunarmodules/luacheck.git;branch=master;protocol=https"
SRCREV = "4d2979930245415e556a7c9f47b63ea038afcfee"

RDEPENDS:${PN} += "lua-argparse luafilesystem"

S = "${WORKDIR}/git"

inherit luarocks
