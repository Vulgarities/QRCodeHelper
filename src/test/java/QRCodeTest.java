import org.junit.Test;
import qrcode.execute.QRCodePrinter;
import qrcode.execute.domain.QRCode;
import qrcode.execute.domain.Version;

import java.nio.charset.StandardCharsets;

public class QRCodeTest {
    @Test
    public void testQRcodePrint() {
        QRCode qrCode = QRCode.of("123", StandardCharsets.UTF_8, Version.V1);
        QRCodePrinter.printToConsole(qrCode);
        QRCodePrinter.printToConsole(qrCode);

        //QRCode qrCode1 = QRCode.of("456", StandardCharsets.UTF_8, Version.V2);
        //QRCodePrinter.printToConsole(qrCode1);
    }

}
