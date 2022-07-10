SUMMARY = "Lua String Hashing/Indexing Library"
DESCRIPTION = "Useful for internationalization."
HOMEPAGE = "http://olivinelabs.com/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=005de8f8f73245c988a708cf1cace960"

SRC_URI = "git://github.com/Olivine-Labs/say.git;branch=master;protocol=https"
SRCREV = "7f30493f602bf8b97332c3faf94e824eb1c4ea2f"

S = "${WORKDIR}/git"

inherit luarocks
