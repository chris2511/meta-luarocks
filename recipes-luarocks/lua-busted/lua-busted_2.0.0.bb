SUMMARY = "Elegant Lua unit testing."
DESCRIPTION = "An elegant, extensible, testing framework. Ships with a large amount of useful asserts, plus the ability to write your own. Output in pretty or plain terminal format, JSON, or TAP for CI integration. Great for TDD and unit, integration, and functional tests."
HOMEPAGE = "http://olivinelabs.com/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cabb1471206ff05b6b3e0e0af73dbd33"

SRC_URI = "git://github.com/Olivine-Labs/busted.git"
SRCREV = "1f1934735258bf3ee8a3bc2b2eb003bce916f0ab"

DEPENDS += "lua-cliargs luafilesystem luasystem lua-dkjson lua-say luassert lua-term lua-penlight lua-mediator-lua"
RDEPENDS:${PN} = "lua-cliargs luafilesystem luasystem lua-dkjson lua-say luassert lua-term lua-penlight lua-mediator-lua"

S = "${WORKDIR}/git"

inherit luarocks
