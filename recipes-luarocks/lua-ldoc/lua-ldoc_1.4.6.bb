DESCRIPTION = "A Lua Documentation Tool"
HOMEPAGE = "http://stevedonovan.github.com/ldoc"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://ldoc-scm-2.rockspec;md5=62e449e4f27045f39f44a85152902c77"

SRC_URI = "http://stevedonovan.github.io/files/ldoc-1.4.6.zip"
SRC_URI[sha256sum] = "8a06fd47ee7518e78ca503adb64f907009246131c5b31ffff526a5c965ad7abb"

DEPENDS += "lua-penlight lua-markdown"
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/ldoc"

inherit luarocks
