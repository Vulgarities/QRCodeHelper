package qrcode.domain;

public class Printer {
    static int side;
    private static String qrCodeToMap(QRCode qrCode) {
        side = (qrCode.getVersion()-1)*4 + 21;
        return "111";
    }

    public static void printToImg(QRCode qrCode, String filePath) {

    }

    public static void printToTxt(QRCode qrCode, String filePath) {

    }

    public static void printToConsole(QRCode qrCode) {
        String map = qrCodeToMap(qrCode);
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("◼︎ ");
            }
            System.out.println();
        }
    }
}
