SUMMARY = "Lua bindings to libmosquitto"
DESCRIPTION = "Lua bindings to the libmosquitto client library. The parameters to all functions are as per libmosquitto's api only with sensible defaults for optional values, and return values directly rather than via pointers."
HOMEPAGE = "https://github.com/flukso/lua-mosquitto"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e6c5f515f483d6b7dce640dcbee7e65"

SRC_URI = "git://github.com/flukso/lua-mosquitto"
SRCREV = "v${PV}"

DEPENDS += "mosquitto"

LUAROCKS_ROCKSPEC = "luarocks/${BP}-1.rockspec \
	LIBMOSQUITTO_DIR=${RECIPE_SYSROOT}/usr"

S = "${WORKDIR}/git"

inherit luarocks
