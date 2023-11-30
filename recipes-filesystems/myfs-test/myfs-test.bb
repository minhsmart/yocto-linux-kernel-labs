SUMMARY = "Copies bash script in /usr/bin"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://test-myfs-1.sh \
            file://test-myfs-2.sh \
            file://test-myfs.sh \
           "

S = "${WORKDIR}"

RDEPENDS:${PN} = "bash"

do_install() {
    #bindir = /usr/bin
    install -d ${D}${bindir}
    install -m 0755 ${S}/test-myfs-1.sh ${D}${bindir}/
    install -m 0755 ${S}/test-myfs-2.sh ${D}${bindir}/
    install -m 0755 ${S}/test-myfs.sh ${D}${bindir}/
}

