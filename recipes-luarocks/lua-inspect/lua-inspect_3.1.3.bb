SUMMARY = "Lua table visualizer, ideal for debugging"
DESCRIPTION = "inspect will print out your lua tables nicely so you can debug your programs quickly. It sorts keys by type and name and handles recursive tables properly."
HOMEPAGE = "https://github.com/kikito/inspect.lua"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://inspect.lua;start=24;end=45;md5=7e9de0a71b93679ec215c83379a84ccd"

SRC_URI = "git://github.com/kikito/inspect.lua.git;branch=master;protocol=https"
SRCREV = "691eea1fc6346be131e9749150976010f13e84f7"

S = "${WORKDIR}/git"

inherit luarocks
