SUMMARY = "David Kolf's JSON module for Lua"
DESCRIPTION = "dkjson is a module for encoding and decoding JSON data. It supports UTF-8. JSON (JavaScript Object Notation) is a format for serializing data based on the syntax for JavaScript data structures."
HOMEPAGE = "http://dkolf.de/src/dkjson-lua.fsl/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://dkjson-2.5-2.rockspec;md5=e8b0f6529f14a4c3b9ff4ba0487b9468"

SRC_URI = "http://dkolf.de/src/dkjson-lua.fsl/tarball/dkjson-${PV}.tar.gz"
SRC_URI[sha256sum] = "b469e80daa9f2355c675d9293e831f3f69153e49856c59634db97899121a720d"

S = "${WORKDIR}/dkjson-${PV}"

inherit luarocks
