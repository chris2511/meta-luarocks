DESCRIPTION = "Elegant Lua unit testing."
HOMEPAGE = "http://olivinelabs.com/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cabb1471206ff05b6b3e0e0af73dbd33"

SRC_URI = "https://github.com/Olivine-Labs/busted/archive/v2.0.0.tar.gz"
SRC_URI[sha256sum] = "fda34db8cd10142d2a88d6df638a7d0874c295fd2bd6338c745cc546dc5847df"

DEPENDS += "lua-cliargs luafilesystem luasystem lua-dkjson lua-say luassert lua-term lua-penlight lua-mediator-lua"
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/busted-2.0.0"

inherit luarocks
