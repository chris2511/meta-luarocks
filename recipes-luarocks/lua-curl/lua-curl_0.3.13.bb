SUMMARY = "Lua binding to libcurl"
DESCRIPTION = " "
HOMEPAGE = "https://github.com/Lua-cURL"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3a97a71d1515848a230ebb101ebedc90"
DEPENDS = "curl"

SRC_URI = "git://github.com/Lua-cURL/Lua-cURLv3.git;branch=master;protocol=https"
SRCREV = "833e87c830bed05fe3910a33f573c202a48ba6d4"

inherit luarocks
