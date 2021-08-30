DESCRIPTION = "Lua library for using Linux evdev & uinput interfaces"
HOMEPAGE = "http://github.com/Tangent128/lua-evdev"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENCE;md5=09b2d059ab048def211a06d0018f9cbc"

SRC_URI = "git://github.com/Tangent128/lua-evdev\
           file://0001-Rename-rockspec-file-and-add-support-for-linux-4.16.patch \
"
SRCREV = "evdev-2.2.1"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

PR = "r1"

S = "${WORKDIR}/git"

inherit luarocks
