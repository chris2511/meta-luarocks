SUMMARY = "Lua String Hashing/Indexing Library"
DESCRIPTION = "Useful for internationalization."
HOMEPAGE = "http://olivinelabs.com/busted/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=005de8f8f73245c988a708cf1cace960"

SRC_URI = "git://github.com/Olivine-Labs/say.git;branch=master;protocol=https"
SRCREV = "45a3057e68c52b34ab59ef167efeb2340e356661"

S = "${WORKDIR}/git"

inherit luarocks
