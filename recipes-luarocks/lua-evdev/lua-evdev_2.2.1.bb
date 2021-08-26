DESCRIPTION = "Lua library for using Linux evdev & uinput interfaces"
HOMEPAGE = "http://github.com/Tangent128/lua-evdev"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENCE;md5=09b2d059ab048def211a06d0018f9cbc"

SRC_URI = "git://github.com/Tangent128/lua-evdev"
SRCREV = "evdev-2.2.1"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"

inherit luarocks

do_compile_prepend() {
  test -f "${S}/evdev-scm.rockspec" &&
    mv ${S}/evdev-scm.rockspec ${S}/evdev-scm-1.rockspec
}
