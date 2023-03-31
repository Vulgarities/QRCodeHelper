package qrcode.execute.domain;

import lombok.Data;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Data
public class QRCode {
    private byte[] data;
    private Version version; // 1-40

    private List<List<Boolean>> bitmap = new ArrayList<>();

    public static QRCode of(String str, Charset charset, Version version) {
        QRCode qrCode = new QRCode();
        qrCode.setVersion(version);
        qrCode.setData(str.getBytes(charset));
        return qrCode;
    }
}
