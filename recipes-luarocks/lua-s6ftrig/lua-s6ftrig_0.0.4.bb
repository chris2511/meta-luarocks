SUMMARY = " LUA s6ftrig - Handle S6 Service Events"
DESCRIPTION = "This library allows to register to one or more S6 service fifodirs. The current status can be retrieved and for state changes can be poll()ed."
HOMEPAGE = "https://github.com/chris2511/lua-s6ftrig"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7c89962b6cc0897cc0b2e290f50de782"

SRC_URI = "git://github.com/chris2511/lua-s6ftrig"
SRCREV = "b09ca2bc1fd6dbdf4b22f2db25a5029214be5b89"

DEPENDS += "s6 skalibs"

S = "${WORKDIR}/git"

inherit luarocks
