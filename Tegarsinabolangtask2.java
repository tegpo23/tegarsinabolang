/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tegarsinabolangtask2;

import java.util.Scanner;

/**
 * Program untuk menentukan nilai huruf berdasarkan input nilai angka dengan pembagian:
 * 90-100 (A), 80-89 (A-), 70-79 (B), 65-69 (B-), 56-64 (C), 40-55 (D), 0-39 (E)
 */
public class Tegarsinabolangtask2 {

    /**
     * Method utama untuk menjalankan program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat instance Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai angka
        System.out.print("Masukkan nilai angka: ");
        int angka = input.nextInt();

        // Logika untuk menentukan nilai huruf berdasarkan nilai angka
        if (angka >= 90 && angka <= 100) {
            System.out.println("A");
        } else if (angka >= 80 && angka <= 89) {
            System.out.println("A-");
        } else if (angka >= 70 && angka <= 79) {
            System.out.println("B");
        } else if (angka >= 65 && angka <= 69) {
            System.out.println("B-");
        } else if (angka >= 56 && angka <= 64) {
            System.out.println("C");
        } else if (angka >= 40 && angka <= 55) {
            System.out.println("D");
        } else if (angka >= 0 && angka <= 39) {
            System.out.println("E");
        } else {
            // Jika nilai di luar batas 0-100
            System.out.println("Nilai tidak valid, masukkan nilai antara 0 dan 100.");
        }

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}