SUMMARY = "File System Library for the Lua Programming Language"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions related to file systems offered by the standard Lua distribution."
LICENSE = "MIT"
HOMEPAGE = "https://github.com/keplerproject/luafilesystem"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9b7e441d51a96b17511ee3be5a75857"

SRC_URI = "git://github.com/keplerproject/luafilesystem.git;branch=master;protocol=https"
SRCREV = "7c6e1b013caec0602ca4796df3b1d7253a2dd258"

S = "${WORKDIR}/git"

inherit luarocks
