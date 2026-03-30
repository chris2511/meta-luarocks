SUMMARY = "File System Library for the Lua Programming Language"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions related to file systems offered by the standard Lua distribution."
LICENSE = "MIT"
HOMEPAGE = "https://lunarmodules.github.io/luafilesystem"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eea9910b0620641551736d969a197076"

SRC_URI = "git://github.com/lunarmodules/luafilesystem.git;branch=master;protocol=https"
SRCREV = "a186cca5833691e830ed255e38ace8ff6b870dbf"

inherit luarocks
