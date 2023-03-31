import org.junit.Test;
import qrcode.QRCodeHelper;

public class HelperTest {
    @Test
    public void qrcodeHelperTest() {
        QRCodeHelper.generateToConsole("123");
    }

    @Test
    public void t2() {
        QRCodeHelper.generateToTxt("123", "1.txt");
    }
}
