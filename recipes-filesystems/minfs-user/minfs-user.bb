SUMMARY = "Copies bash script in /usr/bin"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://mkfs.minfs.c \
           file://minfs.h \
           file://Makefile \
           file://test-minfs-0.sh \
           file://test-minfs-1.sh \
           file://test-minfs-2.sh \
           file://test-minfs.sh \
           "

S = "${WORKDIR}"

RDEPENDS:${PN} = "bash"

EXTRA_OEMAKE:append = " DESTDIR=${D} BINDIR=${bindir}" 
EXTRA_OEMAKE:append = " TARGET=mkfs.minfs"

do_compile() {
        oe_runmake
}

do_install() {
    oe_runmake install

    #bindir = /usr/bin
    install -d ${D}${bindir}
    install -m 0755 ${S}/test-minfs-0.sh ${D}${bindir}/
    install -m 0755 ${S}/test-minfs-1.sh ${D}${bindir}/
    install -m 0755 ${S}/test-minfs-2.sh ${D}${bindir}/
    install -m 0755 ${S}/test-minfs.sh ${D}${bindir}/
}

