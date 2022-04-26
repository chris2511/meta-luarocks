SUMMARY = "Platform independent system calls for Lua."
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
HOMEPAGE = "http://olivinelabs.com/luasystem/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef16f861a016f1f85d36c973a78eb1c0"

SRC_URI = "git://github.com/o-lim/luasystem.git"
SRCREV = "16a5314335cfefb803478239b52bde6fe42e13af"

S = "${WORKDIR}/git"

inherit luarocks
