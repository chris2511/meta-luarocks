# Copyright (C) 2024 Christian Hohnstaedt <christian@hohnstaedt.de>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "OpenSSL binding for Lua"
DESCRIPTION = ""
HOMEPAGE = "https://github.com/zhaozg/lua-openssl"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3cf22612ad608bd3bece7c4d0aa77078 \
                    file://deps/auxiliar/readme.md;beginline=45;endline=64;md5=406fdecc5f052a2b73173b1084afdcd7 \
                    file://deps/lua-compat/LICENSE;md5=b863a95a5f6ff64e40a0bb54501225d0 \
"

SRC_URI = "gitsm://github.com/zhaozg/lua-openssl.git;branch=master;protocol=https"
SRCREV = "5bc07789cbe473bc86dda1957a168fb209077c38"

PV = "0.9.0"
PR = "0"

DEPENDS += "openssl"

S = "${WORKDIR}/git"

LUAROCKS_EXTRA_CFLAGS = "-Ideps/auxiliar"

inherit luarocks
