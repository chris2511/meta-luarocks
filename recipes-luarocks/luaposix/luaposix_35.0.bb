DESCRIPTION = "Lua bindings for POSIX"
HOMEPAGE = "http://github.com/luaposix/luaposix/"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=71690c320e7bd75799e67e43234bbf4f"

SRC_URI = "http://github.com/luaposix/luaposix/archive/v35.0.zip"
SRC_URI[sha256sum] = "f8502c0234e3783abe8a4232cdb005b3380a01fab78e23c31d6c90c683956bff"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/luaposix-35.0"

LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
