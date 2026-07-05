DESCRIPTION = "My Custom Package Groups"

inherit packagegroup

RDEPENDS:${PN} = "\
    lua-argparse \
    lua-busted \
    luacheck \
    lua-cjson \
    lua-cliargs \
    lua-curl \
    lua-dkjson \
    lua-evdev \
    luaexpat \
    luafilesystem \
    lua-iconv \
    lua-inotify \
    lua-inspect \
    lua-ldoc \
    lualogging \
    lua-ltui \
    lua-lyaml \
    lua-markdown \
    lua-mediator-lua \
    lua-mosquitto \
    luamqtt \
    lua-netlink \
    lua-openssl \
    lua-penlight \
    luaposix \
    lua-protobuf \
    lua-pwquality \
    lua-say \
    luasocket \
    luassert \
    luasystem \
    lua-term \
    lua-xml2lua \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 's6-rc', 'lua-s6ftrig', '', d)} \
"
