SUMMARY = "Lua bindings to libpwquality"
DESCRIPTION = "Lua bindings to libpwquality"
HOMEPAGE = "https://github.com/lkpot/lua-pwquality"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6dbda9db2bc7976692977db308e8a57"

SRC_URI = "git://github.com/lkpot/lua-pwquality;branch=main;protocol=https"
SRCREV = "0349f21d817f03002f57f2c6cc7b3feebd63f11a"

DEPENDS = "libpwquality"

S = "${WORKDIR}/git"

inherit luarocks
