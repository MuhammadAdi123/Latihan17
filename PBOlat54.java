/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbolat54;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBOlat54 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================");
        System.out.println("Program Kalkulator");
        System.out.println("=================");

        System.out.println("Masukan angka pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.println("Masukan angka kedua: ");
        int angkaKedua = scanner.nextInt();

        System.out.println("Pilih operasi (+, -, *, /): ");
        String operasi = scanner.next();

        int hasil = 0;

        switch (operasi) {
            case "+" -> hasil = angkaPertama + angkaKedua;
            case "-" -> hasil = angkaPertama - angkaKedua;
            case "*" -> hasil = angkaPertama * angkaKedua;
            case "/" -> hasil = angkaPertama / angkaKedua;
            default -> {
                System.out.println("Operasi tidak valid");
                return;
                }
        }

        System.out.println("Hasil: " + hasil);
    }
}