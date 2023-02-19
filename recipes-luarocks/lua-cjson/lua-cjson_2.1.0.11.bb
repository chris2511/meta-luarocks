SUMMARY = "A fast JSON encoding/parsing module"
DESCRIPTION = "The Lua CJSON module provides JSON support for Lua. It features: - Fast, standards compliant encoding/parsing routines - Full support for JSON with UTF-8, including decoding surrogate pairs - Optional run-time support for common exceptions to the JSON specification (infinity, NaN,..) - No dependencies on other libraries"
HOMEPAGE = "http://www.kyne.com.au/~mark/software/lua-cjson.php"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1fee3afe4f4a4b26c13016123b2d08a"

SRC_URI = "git://github.com/openresty/lua-cjson.git;branch=master;protocol=https"
SRCREV = "91c3363e7dc86263a379719e5508fc0979df84d3"

S = "${WORKDIR}/git"

inherit luarocks
