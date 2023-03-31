package qrcode.domain;

import qrcode.domain.domain.QRCode;

import java.util.List;

public class QRCodePrinter {


    public static void printToImg(QRCode qrCode, String filePath) {

    }

    public static void printToTxt(QRCode qrCode, String filePath) {

    }

    public static void printToConsole(QRCode qrCode) {
        for(List<Boolean> line: qrCode.getBitmap()) {
            for(Boolean i: line) {
                System.out.print(i? "1": "1");
            }
            System.out.println();
        }
    }
}
