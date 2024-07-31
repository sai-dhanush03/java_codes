package crypto;
import java.util.*;

public class caesar_cipher{
    public static String encrypt(String plaintext, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String ciphertext, int shift) {
        return encrypt(ciphertext, 26 - shift);
    }

    public static void main(String[] args) {
        String plaintext = "GERMANY UNDER ATTACK";
        int shift = 3;

        String encryptedText = encrypt(plaintext, shift);
        String decryptedText = decrypt(encryptedText, shift);

        System.out.println("Original text : " + plaintext);
        System.out.println("Encrypted text: " + encryptedText);
        System.out.println("Decrypted text: " + decryptedText);
    }
}
