SUMMARY = "Copies bash script in /usr/bin"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://ram-disk-test.c \
          "

S = "${WORKDIR}"

do_compile() {
        ${CC} ram-disk-test.c ${LDFLAGS} -o ram-disk-test
}

do_install() {
    #bindir = /usr/bin
    install -d ${D}${bindir}
    install -m 0755 ram-disk-test ${D}${bindir}
}