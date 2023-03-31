package qrcode;

import qrcode.execute.domain.QRCode;
import qrcode.execute.QRCodeGenerator;
import qrcode.execute.QRCodePrinter;
import qrcode.execute.domain.Version;

import java.nio.charset.StandardCharsets;

public class QRCodeHelper {
    public static void generateToConsole(String data) {
        QRCode qrCode = QRCodeGenerator.generateByString(data, StandardCharsets.UTF_8, Version.V1);
        QRCodePrinter.printToConsole(qrCode);
    }

    public static void generateToImg(String data, String filePath) {
        QRCode qrCode = QRCodeGenerator.generateByString(data, StandardCharsets.UTF_8, Version.V1);
        QRCodePrinter.printToImg(qrCode, filePath);
    }

    public static void generateToTxt(String data, String filePath) {
        QRCode qrCode = QRCodeGenerator.generateByString(data, StandardCharsets.UTF_8, Version.V1);
        try {
            QRCodePrinter.printToTxt(qrCode, filePath);
        } catch (Exception ignore) {}
    }
}
