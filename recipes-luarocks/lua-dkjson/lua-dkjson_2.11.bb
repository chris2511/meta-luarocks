SUMMARY = "David Kolf's JSON module for Lua"
DESCRIPTION = "dkjson is a module for encoding and decoding JSON data. It supports UTF-8. JSON (JavaScript Object Notation) is a format for serializing data based on the syntax for JavaScript data structures."
HOMEPAGE = "http://dkolf.de/src/dkjson-lua.fsl/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://dkjson-${PV}.lua;beginline=7;endline=41;md5=900ea92d8d811ca02dfc44e6a8d230b0"

SRC_URI = "http://dkolf.de/dkjson-lua/dkjson-${PV}.lua"
SRC_URI[sha256sum] = "197cb50834c642f84b4cf99fe724932c50e6d9c92faec7ad89aa25e91df4d481"

UPSTREAM_CHECK_REGEX = "/modules/dhkolf/dkjson/(?P<pver>\d+\.(\d+))"
UPSTREAM_CHECK_URI = "https://luarocks.org/modules/dhkolf/dkjson"

S = "${UNPACKDIR}"
FILES:${PN} += "${datadir}/lua/${LUA_VERSION}"

inherit luaversion

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
   install -d -m 0755 ${D}${datadir}/lua/${LUA_VERSION}
   install -m 0644 ${S}/dkjson-${PV}.lua ${D}${datadir}/lua/${LUA_VERSION}/dkjson.lua
}
