/*
 * Program untuk menginputkan biodata lengkap
 * Tugas 1 - Pemrograman Berbasis Objek
 */

import java.util.Scanner;

public class BiodataInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel untuk menyimpan biodata
        String namaLengkap, namaPanggilan, nim, tempatLahir, telepon, alamat;
        int umur;
        
        try {
            // Input biodata dari user
            System.out.print("Masukkan nama lengkap: ");
            namaLengkap = input.nextLine();
            
            System.out.print("Masukkan nama panggilan: ");
            namaPanggilan = input.nextLine();
            
            System.out.print("Masukkan NIM: ");
            nim = input.nextLine();
            
            System.out.print("Masukkan umur: ");
            umur = input.nextInt();
            input.nextLine(); // Consume newline character
            
            System.out.print("Masukkan tempat lahir: ");
            tempatLahir = input.nextLine();
            
            System.out.print("Masukkan nomor telepon: ");
            telepon = input.nextLine();
            
            System.out.print("Masukkan alamat: ");
            alamat = input.nextLine();
            
            // Output sesuai format yang diminta
            System.out.println("\n=== BIODATA ===");
            System.out.println("Hello, Let me introduce myself. My name is " + namaLengkap + 
                             ", but you can call me " + namaPanggilan + ". My NIM is " + nim + 
                             ". I was born in " + tempatLahir + " and I am " + umur + 
                             " years old. I am very glad if you want to invite my house in " + 
                             alamat + ". So, don't forget to call me before with the number " + 
                             telepon + ". Thank you.");
                             
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            input.close();
        }
    }
}