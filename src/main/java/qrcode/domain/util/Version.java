package qrcode.domain.util;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Version {
    VERSION_1(1, getLenByV(1)),
    VERSION_2(2, getLenByV(2)),
    VERSION_MICRO(999, 123);
    private final int ver;
    private final int len;
    private static int getLenByV(int version) {
        return (version-1)*4 + 21;
    }
}
