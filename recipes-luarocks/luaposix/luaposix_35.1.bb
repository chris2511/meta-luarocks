SUMMARY = "Lua bindings for POSIX"
DESCRIPTION = "A library binding various POSIX APIs. POSIX is the IEEE Portable Operating System Interface standard. luaposix is based on lposix."
HOMEPAGE = "http://github.com/luaposix/luaposix/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f81069e00c0cad249f20efe958276db1"
DEPENDS += "virtual/crypt"

SRC_URI = "http://github.com/luaposix/luaposix/archive/v${PV}.zip"
SRC_URI[sha256sum] = "f123110c7b0288b63a07130fe6f2c20e2424a8532b68081a0f5764fe276403b0"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
