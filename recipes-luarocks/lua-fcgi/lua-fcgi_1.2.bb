DESCRIPTION = "A Lua module for writing FastCGI applications"
HOMEPAGE = "http://github.com/mikejsavage/lua-fcgi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/main.c;beginline=5;endline=16;md5=df18eb1c8e407abb227d1ae37981b3a7"

SRC_URI = "git://github.com/mikejsavage/lua-fcgi.git;protocol=https;branch=master"
SRCREV = "73d7f013f2d40e1bddcf0fbec080513606b19def"

DEPENDS += "fcgi"

S = "${WORKDIR}/git"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
