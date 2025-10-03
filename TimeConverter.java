/*
 * Program untuk konversi waktu dari detik ke jam, menit, detik
 * Tugas 2 - Pemrograman Berbasis Objek
 */

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Input detik dari user
            System.out.print("Masukkan waktu dalam detik: ");
            int totalDetik = input.nextInt();
            
            // Validasi input tidak boleh negatif
            if (totalDetik < 0) {
                System.out.println("Error: Waktu tidak boleh negatif!");
                return;
            }
            
            // Konversi detik ke jam, menit, detik
            int jam = totalDetik / 3600;  // 1 jam = 3600 detik
            int sisaDetik = totalDetik % 3600;
            int menit = sisaDetik / 60;   // 1 menit = 60 detik
            int detik = sisaDetik % 60;
            
            // Output hasil konversi
            System.out.println("\n=== HASIL KONVERSI WAKTU ===");
            System.out.println("Input: " + totalDetik + " detik");
            System.out.println("Hasil konversi: " + jam + " jam, " + menit + " menit, " + detik + " detik");
            
            // Format alternative untuk tampilan yang lebih rapi
            System.out.printf("Format time: %02d:%02d:%02d (HH:MM:SS)%n", jam, menit, detik);
            
        } catch (Exception ex) {
            System.out.println("Error: Input harus berupa angka! " + ex.getMessage());
        } finally {
            input.close();
        }
    }
}