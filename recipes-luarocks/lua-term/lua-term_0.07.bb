DESCRIPTION = "Terminal functions for Lua"
HOMEPAGE = "https://github.com/hoelzro/lua-term"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://lua-term-0.7-1.rockspec;md5=cb8fc82b729ededb9727449e2562482a"

SRC_URI = "git://github.com/hoelzro/lua-term.git;branch=master;protocol=https"
SRCREV = "9b3dfe60018ab910ba09c400789cfab50b79a3d7"

S = "${WORKDIR}/git"

inherit luarocks
