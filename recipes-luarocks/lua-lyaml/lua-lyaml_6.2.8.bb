SUMMARY = "libYAML binding for Lua"
DESCRIPTION = "Read and write YAML format files with Lua."
HOMEPAGE = "http://github.com/gvvaughan/lyaml"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=43171da31b3f23f092fd54e7a8021b9e"

SRC_URI = "git://github.com/gvvaughan/lyaml.git;branch=release-v6.2.8;protocol=https"
SRCREV = "1afb1f870ae486097f79586502f4254d6074afcb"

DEPENDS += "libyaml"

S = "${WORKDIR}/git"

inherit luarocks
