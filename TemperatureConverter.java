/*
 * Program untuk konversi suhu dari Celsius ke Fahrenheit, Reamur, dan Kelvin
 * Tugas 3 - Pemrograman Berbasis Objek
 * Rumus:
 * F = C * 9/5 + 32
 * K = C + 273.15
 * R = 4/5 * C
 */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Input suhu dalam Celsius dari user
            System.out.print("Masukkan suhu dalam Celsius: ");
            double celsius = input.nextDouble();
            
            // Konversi suhu menggunakan rumus yang diberikan
            double fahrenheit = celsius * 9.0/5.0 + 32;
            double kelvin = celsius + 273.15;
            double reamur = 4.0/5.0 * celsius;
            
            // Output hasil konversi
            System.out.println("\n=== HASIL KONVERSI SUHU ===");
            System.out.println("Suhu dalam Celsius: " + celsius + "°C");
            System.out.println();
            
            // Format output dengan 2 desimal
            System.out.printf("Konversi ke Fahrenheit: %.2f°F%n", fahrenheit);
            System.out.printf("Konversi ke Kelvin: %.2f K%n", kelvin);
            System.out.printf("Konversi ke Reamur: %.2f°R%n", reamur);
            
            // Informasi tambahan tentang rumus yang digunakan
            System.out.println("\n=== RUMUS YANG DIGUNAKAN ===");
            System.out.println("Fahrenheit = C × 9/5 + 32");
            System.out.println("Kelvin = C + 273.15");
            System.out.println("Reamur = 4/5 × C");
            
        } catch (Exception ex) {
            System.out.println("Error: Input harus berupa angka! " + ex.getMessage());
        } finally {
            input.close();
        }
    }
}