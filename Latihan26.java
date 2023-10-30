 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan26;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author User
 */
public class Latihan26 {
    public static void main(String[] args) {
        Date tanggalWaktuSaatIni = new Date();
        SimpleDateFormat formatTanggalWaktu = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String tanggalWaktuSaatIniString = formatTanggalWaktu.format(tanggalWaktuSaatIni);

        System.out.println("Tanggal dan waktu saat ini: " + tanggalWaktuSaatIniString);
    }
    
}