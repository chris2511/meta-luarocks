SUMMARY = "A Lua Documentation Tool"
DESCRIPTION = " LDoc is a LuaDoc-compatible documentation generator which can also process C extension source. Markdown may be optionally used to render comments, as well as integrated readme documentation and pretty-printed example files"
HOMEPAGE = "http://stevedonovan.github.com/ldoc"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=4183d221633f1fc26c238fbb9e020e1f"

SRC_URI = "git://github.com/lunarmodules/LDoc.git;branch=master;protocol=https"
SRC_URI[sha256sum] = "01d648f4ad50c3d14f2acadee6acb26beda56990"

DEPENDS += "lua-penlight lua-markdown"
RDEPENDS:${PN} = "lua-penlight lua-markdown"

SRCREV = "${AUTOREV}"
PV = "1.4.6+git${SRCPV}"

S = "${WORKDIR}/git"

inherit luarocks
