 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan27;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Latihan27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Formatting Kalimat");

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        String kalimatHurufBesar = kalimat.toUpperCase();
        String kalimatHurufKecil = kalimat.toLowerCase();

        System.out.println("==HASIL FORMATTING==");
        System.out.println("Huruf Besar : " + kalimatHurufBesar);
        System.out.println("Huruf Kecil : " + kalimatHurufKecil);
    }
    
}