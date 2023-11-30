#
# SO2 - Networking Lab (#10)
#
# Makefile for test filter module
#

CFLAGS = -Wall -static -m32

all: test-netfilter
test-netfilter: test-netfilter.c

.PHONY: clean

install:
	install -d ${DESTDIR}${BINDIR}
	install -m 0755 $(TARGET) ${DESTDIR}${BINDIR}

clean:
	-rm -f test-netfilter *~ *.o
