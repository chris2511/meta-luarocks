SUMMARY = "Elegant Lua unit testing."
DESCRIPTION = "An elegant, extensible, testing framework. Ships with a large amount of useful asserts, plus the ability to write your own. Output in pretty or plain terminal format, JSON, or TAP for CI integration. Great for TDD and unit, integration, and functional tests."
HOMEPAGE = "https://lunarmodules.github.io/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6146f2ab10bbd3ca9c302d8176b8c098"

SRC_URI = "git://github.com/lunarmodules/busted.git;branch=master;protocol=https"
SRCREV = "56e6d68204d1456afa77f1346bf4e050df65b629"

DEPENDS += "lua-cliargs luafilesystem luasystem lua-dkjson lua-say luassert lua-term lua-penlight lua-mediator-lua"
RDEPENDS:${PN} = "lua-cliargs luafilesystem luasystem lua-dkjson lua-say luassert lua-term lua-penlight lua-mediator-lua"

inherit luarocks
