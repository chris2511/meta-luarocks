SUMMARY = "David Kolf's JSON module for Lua"
DESCRIPTION = "dkjson is a module for encoding and decoding JSON data. It supports UTF-8. JSON (JavaScript Object Notation) is a format for serializing data based on the syntax for JavaScript data structures."
HOMEPAGE = "http://dkolf.de/src/dkjson-lua.fsl/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://dkjson-2.8.lua;beginline=7;endline=41;md5=5f00f8d3ba6f3985c156be5a750ab977"

SRC_URI = "http://dkolf.de/dkjson-lua/dkjson-2.8.lua"
SRC_URI[sha256sum] = "eb3bf160688fb395a2db6bc52eeff4f7855a6321d2b41bdc754554d13f4e7d44"

UPSTREAM_CHECK_REGEX = "/modules/dhkolf/dkjson/(?P<pver>\d+\.(\d+))"
UPSTREAM_CHECK_URI = "https://luarocks.org/modules/dhkolf/dkjson"

S = "${WORKDIR}"
FILES:${PN} += "${datadir}/lua/${LUA_VERSION}"

inherit luaversion

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
   install -d -m 0755 ${D}${datadir}/lua/${LUA_VERSION}
   install -m 0644 ${S}/dkjson-2.8.lua ${D}${datadir}/lua/${LUA_VERSION}/dkjson.lua
}
