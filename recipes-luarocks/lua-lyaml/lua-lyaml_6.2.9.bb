SUMMARY = "libYAML binding for Lua"
DESCRIPTION = "Read and write YAML format files with Lua."
HOMEPAGE = "http://github.com/gvvaughan/lyaml"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3cff2030fe810f0e956355664397b28d"

SRC_URI = "git://github.com/gvvaughan/lyaml.git;branch=release-v${PV};protocol=https"
SRCREV = "cdc8a08e752940b65749272bef8a25e3949a042b"

DEPENDS += "libyaml"

inherit luarocks
