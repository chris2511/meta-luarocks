SUMMARY = "Lua library for using Linux evdev & uinput interfaces"
DESCRIPTION = "A Lua 5.2 module for interacting with input devices on Linux. You can read events with a Device object, or create a virtual input device with a Uinput object."
HOMEPAGE = "http://github.com/Tangent128/lua-evdev"
LICENSE = "MIT&X11"
LIC_FILES_CHKSUM = "file://LICENCE;md5=09b2d059ab048def211a06d0018f9cbc"

SRC_URI = "git://github.com/Tangent128/lua-evdev;branch=master;protocol=https \
           file://0001-Rename-rockspec-file-and-add-support-for-linux-4.16.patch \
           file://0001-Add-support-for-initial-switch-state-via-EVIOCGSW.patch \
           "
SRCREV = "eabedac3c221d5b597d8f18ebf12b3374d2798d3"

PR = "r1"

S = "${WORKDIR}/git"

inherit luarocks
