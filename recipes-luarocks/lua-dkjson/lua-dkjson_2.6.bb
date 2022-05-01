SUMMARY = "David Kolf's JSON module for Lua"
DESCRIPTION = "dkjson is a module for encoding and decoding JSON data. It supports UTF-8. JSON (JavaScript Object Notation) is a format for serializing data based on the syntax for JavaScript data structures."
HOMEPAGE = "http://dkolf.de/src/dkjson-lua.fsl/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://readme.txt;beginline=184;md5=df5575ea42f45568313c8250c7cb12dc"

PR = "r1"

SRC_URI = "http://dkolf.de/src/dkjson-lua.fsl/tarball/dkjson-${PV}.tar.gz"
SRC_URI[sha256sum] = "bd07ee4eb398aed6cf36f92423845399a5b46c15090990cc90e56d07c46f9773"

S = "${WORKDIR}/dkjson-${PV}"

inherit luarocks
