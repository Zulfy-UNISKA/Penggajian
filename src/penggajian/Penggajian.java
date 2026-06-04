/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package penggajian;
import java.util.ArrayList; // Array dinamis 
import frame.FrameUtama;


/**
 *
 * @author USer
 */
public class Penggajian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Karyawan tes = new Karyawan();
        
        // Array Statis
//        int tahun[] = new int[3]; // [3] array jumlah
//        String negara[] = new String[5]; // [5] 5 Element
//        tahun[0] = 2026;
//        tahun[1] = 2027;
//        tahun[2] = 2028;
//        
//        negara[0] = "Indonesia";
//        negara[1] = "Perancis";
//        negara[2] = "India";
//        negara[3] = "Malaysia";
//        negara[4] = "Konoha";
//        
//        System.out.println(tahun.length + " " + negara.length);
//        System.out.println(tahun[1] + " " + negara[2]);
//        
//        
//        // Array dinamis
//        ArrayList<Integer> umur  = new ArrayList<>();
//        ArrayList<String>  buah  = new ArrayList<>();
//        
//        umur.add(3);
//        umur.add(10);
//        umur.add(22);
//        
//        buah.add("Apel");
//        buah.add("Nanas");
//        buah.add("Pepaya");
//        buah.add("Semangka");
//        buah.add("Mangga");
//        
//        System.out.println(umur+ " " + buah);
//        System.out.println(umur.size() + " " + buah.size());
//        System.out.println(umur.get(2) + " " + buah.get(3));
//        umur.remove(1); // Hapus element ke dua
//        buah.remove(2); // Hapus element ke tiga
//        
//        
//        System.out.println(umur+ " " + buah);
//        System.out.println(umur.size() + " " + buah.size());
//        System.out.println(umur.get(1) + " " + buah.get(3));
//        
//        
        
        
        
        Gaji tes = new Gaji();
        tes.inputDataNama("Kaela");
        tes.inputDataNama("Ole");
        
        tes.inputDataMasaKerja(2);
        tes.inputDataMasaKerja(1);
        
        tes.inputDataGolongan("II");
        tes.inputDataGolongan("I");
        
        tes.inputDataStatus("Belum");
        tes.inputDataStatus("Menikah");
        
        System.out.println(tes.listDataNama());
        System.out.println(tes.listDataMasaKerja());
        System.out.println(tes.listDataGolongan());
        System.out.println(tes.listDataStatus());
        int i = tes.getIndexData("Kobo");
        System.out.println(i);
        tes.searchData("Yaya");
        
        new FrameUtama().setVisible(true);
        
        
        
//        tes.setNamaKaryawan("Muhammad Zulfy");
//        tes.setStatus("Belum");
//        tes.setGolongan("II");
//        tes.setMasa(2);
//        
//        System.out.println(tes.gajiTotal());
        
    }
    
}
