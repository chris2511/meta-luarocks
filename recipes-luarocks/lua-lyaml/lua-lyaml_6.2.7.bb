SUMMARY = "libYAML binding for Lua"
DESCRIPTION = "Read and write YAML format files with Lua."
HOMEPAGE = "http://github.com/gvvaughan/lyaml"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc02c78fbad9c9c6652bdabc6a345b94"

SRC_URI = "git://github.com/gvvaughan/lyaml.git;branch=master;protocol=https"
SRCREV = "1f6a744aa99c5263f113a6f48018b3544ce10df9"

DEPENDS += "libyaml"

S = "${WORKDIR}/git"

inherit luarocks
