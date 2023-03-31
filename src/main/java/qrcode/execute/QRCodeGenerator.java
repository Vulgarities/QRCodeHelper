package qrcode.domain;

import qrcode.domain.domain.QRCode;
import qrcode.domain.domain.Version;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class QRCodeGenerator {
    public static List<List<Boolean>> generateBitMap(QRCode qrCode) {
        List<List<Boolean>> bitmap = new ArrayList<>();
        for (int i = 0; i < qrCode.getVersion().getSidelen(); i++) {
            bitmap.add(new ArrayList<>());
            for (int j = 0; j < qrCode.getVersion().getSidelen(); j++) {
                bitmap.get(i).add(j%2 == 0);
            }
        }
        return bitmap;
    }

    public static QRCode generateByString(String data, Charset charset, Version version) {
        QRCode qrCode = QRCode.of("123", charset, version);
        qrCode.setBitmap(generateBitMap(qrCode));
        return qrCode;
    }

    public static QRCode generateByString(String data) {
        QRCode qrCode = QRCode.of("123", StandardCharsets.UTF_8, Version.V1);
        qrCode.setBitmap(generateBitMap(qrCode));
        return qrCode;
    }
}
