SUMMARY = "Lua table visualizer, ideal for debugging"
DESCRIPTION = "inspect will print out your lua tables nicely so you can debug your programs quickly. It sorts keys by type and name and handles recursive tables properly."
HOMEPAGE = "https://github.com/kikito/inspect.lua"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://inspect.lua;start=6;end=27;md5=ed472f262de57982d758ac61341b9936"

SRC_URI = "https://github.com/kikito/inspect.lua/archive/v3.1.1.tar.gz"
SRC_URI[sha256sum] = "0292f4960ef0ccb2c7334911981b280f9016c57a29c90c5ff5d3823621f6e0db"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/inspect.lua-${PV}"

inherit luarocks
