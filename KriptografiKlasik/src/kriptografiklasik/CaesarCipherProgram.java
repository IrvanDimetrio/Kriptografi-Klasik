package kriptografiklasik;

import java.util.Scanner;
// Dibuat Oleh : M.Irvan Dimetrio(18360018)

/**
 * Program CaesarCipher
 */
public class CaesarCipherProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Encrypt\n2.Decrypt\n3.Exit...");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
// Masuk ke fungsi Enkripsi
                    Eknripsi();
                    break;
                case 2:
// Masuk ke fungsi Dekripsi
                    Dekripsi();
                    break;
                case 3:
// exit from the program
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option..");
            }
        }
    }
// Fungsi untuk melakukan enkripsi metode Caesar

    public static void Eknripsi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan pesan plaintext : ");
        String plaintext = sc.nextLine();
        System.out.println("Masukkan nilai dimana karakter plaintext akan di-shifted : ");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;

        for (int i = 0; i < plaintext.length(); i++) {
            // Shift one character at a time
            alphabet = plaintext.charAt(i);
            // if alphabet lies between a and z
            if (alphabet >= 'a' && alphabet <= 'z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
                // if shift alphabet greater than 'z'
                if (alphabet > 'z') {
                    // reshift to starting position
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } // if alphabet lies between 'A'and 'Z'
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);

                // if shift alphabet greater than 'Z'
                if (alphabet > 'Z') {
                    // reshift to starting position
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else {
                ciphertext = ciphertext + alphabet;
            }
        }
        System.out.println("ciphertext : " + ciphertext);
    }

// Fungsi untuk melakukan Dekripsi metode Caesar
    public static void Dekripsi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan pesan ciphertext : ");
        String ciphertext = sc.nextLine();
        System.out.println("Masukkan nilai shift : ");
        int shift = sc.nextInt();
        String decryptMessage = "";

        for (int i = 0; i < ciphertext.length(); i++) {
            // Shift one character at a time
            char alphabet = ciphertext.charAt(i);
            // if alphabet lies between a and z
            if (alphabet >= 'a' && alphabet <= 'z') {
                // shift alphabet
                alphabet = (char) (alphabet - shift);
                // shift alphabet lesser than 'a'
                if (alphabet < 'a') {
                    // reshift to starting position
                    alphabet = (char) (alphabet - 'a' + 'z' + 1);
                }
                decryptMessage = decryptMessage + alphabet;
            } // if alphabet lies between A and Z
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                // shift alphabet
                alphabet = (char) (alphabet - shift);
                // shift alphabet lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position
                    alphabet = (char) (alphabet - 'A' + 'Z' + 1);
                }
                decryptMessage = decryptMessage + alphabet;
            } else {
                decryptMessage = decryptMessage + alphabet;
            }
        }
        System.out.println("decrypt message : " + decryptMessage);
    }
}
