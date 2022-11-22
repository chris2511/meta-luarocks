SUMMARY = "A feature-rich command-line argument parser"
DESCRIPTION = "Argparse supports positional arguments, options, flags, optional arguments, subcommands and more. Argparse automatically generates usage, help, and error messages, and can generate shell completion scripts."
HOMEPAGE = "https://github.com/luarocks/argparse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=121fa4cef6513eb48482998ce7805bad"

SRC_URI = "https://github.com/luarocks/argparse/archive/${PV}.zip"
SRC_URI[sha256sum] = "009f27e874f1a873de41dd0d2878b240bcd9eb7f9e6c3b0ed6e3fed1fd2f6141"

S = "${WORKDIR}/argparse-${PV}"

# If the QA error about gnu-hash shows up, try uncommenting the following line
# LUAROCKS_EXTRA_CC = "${LDFLAGS}"

inherit luarocks
