SUMMARY = "libYAML binding for Lua"
DESCRIPTION = "Read and write YAML format files with Lua."
HOMEPAGE = "http://github.com/gvvaughan/lyaml"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc02c78fbad9c9c6652bdabc6a345b94"

SRC_URI = "http://github.com/gvvaughan/lyaml/archive/v${PV}.zip"
SRC_URI[sha256sum] = "0cacc6265058e1db3c14f38b8e166fcbd12b24f8a92b22c101e82197e7c8b598"

DEPENDS += "libyaml"

S = "${WORKDIR}/lyaml-${PV}"

inherit luarocks
