SUMMARY = "Markdown text-to-html markup system."
DESCRIPTION = "A pure-lua implementation of the Markdown text-to-html markup system."
HOMEPAGE = "https://github.com/mpeterv/markdown"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ba696eb6f35a89e58608c6cc3504931"

SRC_URI = "git://github.com/mpeterv/markdown"
SRCREV = "8c09109924b218aaecbfd4d4b1de538269c4d765"

S = "${WORKDIR}/git"

inherit luarocks
