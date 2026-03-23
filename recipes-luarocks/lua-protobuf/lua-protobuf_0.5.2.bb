SUMMARY = "protobuf data support for Lua"
DESCRIPTION = "This project offers a simple C library for basic protobuf wire format encode/decode."
HOMEPAGE = "https://github.com/starwing/lua-protobuf"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=759700dd96fbc5c3b37ea958b7eae988"

SRC_URI = "git://github.com/starwing/lua-protobuf;branch=master;protocol=https"
SRCREV = "3f9ffd485262edbcde618296c07b862ba5a74b38"

LUAROCKS_ROCKSPEC = "rockspecs/${BPN}-0.4.0-1.rockspec"

inherit luarocks
