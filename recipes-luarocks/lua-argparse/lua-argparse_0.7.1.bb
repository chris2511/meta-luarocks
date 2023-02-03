SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional arguments, subcommands and more. Argparse automatically generates usage, help, and error messages, and can generate shell completion scripts."
HOMEPAGE = "https://github.com/luarocks/argparse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=121fa4cef6513eb48482998ce7805bad"

SRC_URI = "git://github.com/luarocks/argparse.git;branch=master;protocol=https"
SRCREV = "27967d7b52295ea7885671af734332038c132837"

S = "${WORKDIR}/git"

inherit luarocks
