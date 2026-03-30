SUMMARY = "Platform independent system calls for Lua."
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
HOMEPAGE = "https://lunarmodules.github.io/luasystem/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a4eaf40d8f862eaea513e6b9fa7efefc"

SRC_URI = "git://github.com/lunarmodules/luasystem.git;branch=master;protocol=https"
SRCREV = "6272094bc7265262cbca8363b425531ad0170caa"

inherit luarocks
