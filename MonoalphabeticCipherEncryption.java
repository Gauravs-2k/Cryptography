import java.util.*;

public class MonoalphabeticCipherEncryption {
    public static void main(String [] args) {
        String plaintext = "meet me after the toga party";
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        ArrayList<Integer> permutation = new ArrayList<>();
        for (int i = 0; i < alphabet.length(); i++)
            permutation.add(i);
        Collections.shuffle(permutation);
        
        String key = "", KEY = "";
        for (int j = 0; j < ALPHABET.length(); j++) {
            key += alphabet.charAt(permutation.get(j));
            KEY += ALPHABET.charAt(permutation.get(j));
        }
        
        String ciphertext = "";
        
        int i, j;
        for (i = 0; i < plaintext.length(); i++) {
            for (j = 0; j < alphabet.length(); j++) {
                if (plaintext.charAt(i) == alphabet.charAt(j)) {
                    ciphertext += key.charAt(j);
                    break;
                }
                if (plaintext.charAt(i) == ALPHABET.charAt(j)) {
                    ciphertext += KEY.charAt(j);
                    break;
                }
            }
            if (j == ALPHABET.length())
                ciphertext += plaintext.charAt(i);
        }
        
        System.out.println("Monoalphabetic Cipher [Encryption]");
        System.out.println("Plain Text  : " + plaintext);
        System.out.println("key         : " + key);
        System.out.println("KEY         : " + KEY);
        System.out.println("Cipher Text : " + ciphertext);
    }
}