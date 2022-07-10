SUMMARY = "Network support for the Lua language"
DESCRIPTION = " LuaSocket is a Lua extension library that is composed by two parts: a C core that provides support for the TCP and UDP transport layers, and a set of Lua modules that add support for functionality commonly needed by applications that deal with the Internet."
HOMEPAGE = "http://luaforge.net/projects/luasocket/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5850c0e7e7928460cd638a38f062263"

SRC_URI = "git://github.com/diegonehab/luasocket.git;protocol=https;branch=master"
SRCREV = "88c8a85cb6528232288ec590910b7a966aace52b"

S = "${WORKDIR}/git"
LUAROCKS_ROCKSPEC = "rockspecs/luasocket-3.0.0-1.rockspec"

inherit luarocks
