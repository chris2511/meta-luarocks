SUMMARY = "Lua bindings for POSIX"
DESCRIPTION = "A library binding various POSIX APIs. POSIX is the IEEE Portable Operating System Interface standard. luaposix is based on lposix."
HOMEPAGE = "http://github.com/luaposix/luaposix/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=71690c320e7bd75799e67e43234bbf4f"

SRC_URI = "http://github.com/luaposix/luaposix/archive/v${PV}.zip"
SRC_URI[sha256sum] = "f8502c0234e3783abe8a4232cdb005b3380a01fab78e23c31d6c90c683956bff"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
