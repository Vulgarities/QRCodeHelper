import org.junit.Test;
import qrcode.domain.Printer;
import qrcode.domain.QRCode;

public class QRCodeTest {
    @Test
    public void testQRcodePrint() {
        QRCode qrCode = new QRCode();
        Printer.printToConsole(qrCode);
    }
}
