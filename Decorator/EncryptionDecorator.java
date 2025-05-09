package Decorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionDecorator extends DataSourceDecorator {
    private static final String AES_ALGORITHM = "AES";
    private static final String SECRET_KEY = "MySecretKey12345"; // 16/24/32字节的密钥
    private static final byte[] KEY_BYTES = SECRET_KEY.getBytes(StandardCharsets.UTF_8);

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(wrappee.readData());
    }

    private String encrypt(String data) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(KEY_BYTES, AES_ALGORITHM);
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes); // Base64编码便于存储
        } catch (Exception e) {
            throw new RuntimeException("加密失败", e);
        }
    }

    private String decrypt(String encryptedData) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(KEY_BYTES, AES_ALGORITHM);
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("解密失败", e);
        }
    }
}
