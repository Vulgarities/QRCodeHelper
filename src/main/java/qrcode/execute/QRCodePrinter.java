package qrcode.execute;

import qrcode.execute.domain.QRCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class QRCodePrinter {


    public static void printToImg(QRCode qrCode, String filePath) {

    }

    public static void printToTxt(QRCode qrCode, String filePath) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
        for(List<Boolean> line: qrCode.getBitmap()) {
            for(Boolean i: line) {
                out.write(i?"■":"▢");
            }
            out.write("\n");
        }
        out.close();
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
