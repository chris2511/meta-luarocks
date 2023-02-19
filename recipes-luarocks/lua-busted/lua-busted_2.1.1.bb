SUMMARY = "Elegant Lua unit testing."
DESCRIPTION = "An elegant, extensible, testing framework. Ships with a large amount of useful asserts, plus the ability to write your own. Output in pretty or plain terminal format, JSON, or TAP for CI integration. Great for TDD and unit, integration, and functional tests."
HOMEPAGE = "http://olivinelabs.com/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6146f2ab10bbd3ca9c302d8176b8c098"

SRC_URI = "git://github.com/Olivine-Labs/busted.git;branch=master;protocol=https"
SRCREV = "e3ed48759b625f2e37bf02ccc057b2b98108f108"

DEPENDS += "lua-cliargs luafilesystem luasystem lua-dkjson lua-say luassert lua-term lua-penlight lua-mediator-lua"
RDEPENDS:${PN} = "lua-cliargs luafilesystem luasystem lua-dkjson lua-say luassert lua-term lua-penlight lua-mediator-lua"

S = "${WORKDIR}/git"

inherit luarocks
