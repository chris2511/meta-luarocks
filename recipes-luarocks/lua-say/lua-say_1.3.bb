SUMMARY = "Lua String Hashing/Indexing Library"
DESCRIPTION = "Useful for internationalization."
HOMEPAGE = "http://olivinelabs.com/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=005de8f8f73245c988a708cf1cace960"

SRC_URI = "https://github.com/Olivine-Labs/say/archive/v1.3-1.tar.gz"
SRC_URI[sha256sum] = "23e8cd378bb4ab1693279100a785acb2246418e3570b7de7d995b5847b3507ca"

S = "${WORKDIR}/say-${PV}-1"

inherit luarocks
