FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append = " file://0001-Add-hello-driver-builtin.patch \
                   file://0001-Fix-syntas-error.patch \
                   file://fragment.cfg"