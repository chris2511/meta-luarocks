SUMMARY = "Network support for the Lua language"
DESCRIPTION = " LuaSocket is a Lua extension library that is composed by two parts: a C core that provides support for the TCP and UDP transport layers, and a set of Lua modules that add support for functionality commonly needed by applications that deal with the Internet."
HOMEPAGE = "http://luaforge.net/projects/luasocket/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab6706baf6d39a6b0fa2613a3b0831e7"

SRC_URI = "git://github.com/diegonehab/luasocket.git;protocol=https"
SRCREV = "5b18e475f38fcf28429b1cc4b17baee3b9793a62"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"
LUAROCKS_ROCKSPEC = "rockspec/luasocket-scm-2.rockspec"

inherit luarocks
