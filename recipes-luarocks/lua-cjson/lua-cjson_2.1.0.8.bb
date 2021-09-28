DESCRIPTION = "A fast JSON encoding/parsing module"
HOMEPAGE = "http://www.kyne.com.au/~mark/software/lua-cjson.php"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1fee3afe4f4a4b26c13016123b2d08a"

SRC_URI = "git://github.com/openresty/lua-cjson.git \
           file://0001-use-macro-instead-of-header-defines-for-Lua-5.2-supp.patch \
           "
SRCREV = "${PV}"

DEPENDS += ""
RDEPENDS_${PN} = "lua"

S = "${WORKDIR}/git"

inherit luarocks
