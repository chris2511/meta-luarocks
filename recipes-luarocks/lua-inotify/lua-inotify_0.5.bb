DESCRIPTION = "Inotify bindings for Lua"
HOMEPAGE = "http://hoelz.ro/projects/linotify"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=73fd2685b9b3edead31e073650b11022"

SRC_URI = "git://github.com/hoelzro/linotify.git;branch=master;protocol=https"
SRCREV = "a56913e9c0922befb65227a00cf69c2e8052de1a"

DEPENDS += "inotify-tools"

S = "${WORKDIR}/git"

inherit luarocks
