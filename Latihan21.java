/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan21;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan21 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int banyakMahasiswa = scanner.nextInt();
        System.out.println("\n");
        
        double nilaiTotal = 0; 
        double rataRataNilai;
        for (int i=1; i<= banyakMahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-"+ i + ": ");
            double nilai= scanner.nextDouble();
            nilaiTotal += nilai;
        }
        
        rataRataNilai = nilaiTotal / banyakMahasiswa;
        System.out.print("\nMaka, rata-rata nilainya adalah " + rataRataNilai);
     }
        
}