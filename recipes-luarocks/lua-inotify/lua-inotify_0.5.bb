DESCRIPTION = "Inotify bindings for Lua"
HOMEPAGE = "http://hoelz.ro/projects/linotify"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=73fd2685b9b3edead31e073650b11022"

SRC_URI = "https://github.com/hoelzro/linotify/archive/${PV}.tar.gz"
SRC_URI[sha256sum] = "21d005f16043397a85913a7d14a267716d6384f0228718d5de464bfc0274e338"

DEPENDS += "inotify-tools"

S = "${WORKDIR}/linotify-${PV}"

inherit luarocks
