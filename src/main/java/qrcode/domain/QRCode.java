package qrcode.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Arrays;

@Data
public class QRCode {
    private byte[] data;
    private int version = 1; // 1-40



}
