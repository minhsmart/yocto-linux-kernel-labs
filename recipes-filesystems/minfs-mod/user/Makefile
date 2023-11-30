CFLAGS = -Wall -g -m32
LDFLAGS = -static -m32

.PHONY: all clean

all: mkfs.minfs

mkfs.minfs: mkfs.minfs.o

mkfs.minfs.o: mkfs.minfs.c minfs.h

install:
	install -d ${DESTDIR}${BINDIR}
	install -m 0755 $(TARGET) ${DESTDIR}${BINDIR}

clean:
	-rm -f *~ *.o mkfs.minfs
