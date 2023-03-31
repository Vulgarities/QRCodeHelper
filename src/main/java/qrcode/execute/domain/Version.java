package qrcode.execute.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Version {
    V1(1, getLenByV(1)),
    V2(2, getLenByV(2)),
    V3(3, getLenByV(3)),
    V4(4, getLenByV(4)),
    MICRO(999, 123);

    private final int version;
    private final int sidelen;

    private static int getLenByV(int version) {
        return version * 4;
        //return (version-1)*4 + 21;
    }
    public int getSidelen() {return sidelen;}
}
