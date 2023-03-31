package qrcode.domain;

import lombok.Data;
import qrcode.domain.util.Version;

@Data
public class QRCode {
    private byte[] data;
    private Version version = Version.VERSION_1; // 1-40



}
