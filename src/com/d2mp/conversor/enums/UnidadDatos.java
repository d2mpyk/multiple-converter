package com.d2mp.conversor.enums;

public enum UnidadDatos {
    BIT(1),
    KILOBIT(1024),
    MEGABIT(1024 * 1024),
    GIGABIT(1024 * 1024 * 1024),
    TERABIT(1024L * 1024 * 1024 * 1024),
    PETABIT(1024L * 1024 * 1024 * 1024 * 1024),
    EXABIT(1024L * 1024 * 1024 * 1024 * 1024 * 1024),
    ZETTABIT(1024L * 1024 * 1024 * 1024 * 1024 * 1024 * 1024),
    YOTTABIT(1024L * 1024 * 1024 * 1024 * 1024 * 1024 * 1024 * 1024),
    BYTE(8),
    KILOBYTE(8 * 1024),
    MEGABYTE(8 * 1024 * 1024),
    GIGABYTE(8L * 1024 * 1024 * 1024),
    TERABYTE(8L * 1024 * 1024 * 1024 * 1024),
    PETABYTE(8L * 1024 * 1024 * 1024 * 1024 * 1024),
    EXABYTE(8L * 1024L * 1024L * 1024 * 1024 * 1024 * 1024),
    ZETTABYTE(8L * 1024 * 1024 * 1024 * 1024 * 1024 * 1024 * 1024),
    YOTTABYTE(8L * 1024 * 1024 * 1024 * 1024 * 1024 * 1024 * 1024 * 1024);


    private final long bits;

    UnidadDatos(long bits) {
        this.bits = bits;
    }

    public long getBits() {
        return bits;
    }
}

