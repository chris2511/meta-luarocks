# Copyright (C) 2024 Christian Hohnstaedt <christian@hohnstaedt.de>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "OpenSSL binding for Lua"
DESCRIPTION = ""
HOMEPAGE = "https://github.com/zhaozg/lua-openssl"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4512cf21bb3eb9fce19515967a820f42 \
                    file://deps/auxiliar/readme.md;beginline=45;endline=64;md5=406fdecc5f052a2b73173b1084afdcd7 \
                    file://deps/lua-compat/LICENSE;md5=b863a95a5f6ff64e40a0bb54501225d0 \
"

SRC_URI = "gitsm://github.com/zhaozg/lua-openssl.git;branch=master;protocol=https"
SRCREV = "9642d3bff600d0d12e4c24b4059dd331655042bd"

PV = "0.11.1"
PR = "1"

DEPENDS += "openssl"

LUAROCKS_EXTRA_CFLAGS = "-Ideps/auxiliar"

inherit luarocks
