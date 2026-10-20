SUMMARY = "libYAML binding for Lua"
DESCRIPTION = "Read and write YAML format files with Lua."
HOMEPAGE = "http://github.com/gvvaughan/lyaml"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=43171da31b3f23f092fd54e7a8021b9e"

SRC_URI = "git://github.com/gvvaughan/lyaml.git;branch=release-v${PV};protocol=https"
SRCREV = "cdc8a08e752940b65749272bef8a25e3949a042b"

DEPENDS += "libyaml"

inherit luarocks
