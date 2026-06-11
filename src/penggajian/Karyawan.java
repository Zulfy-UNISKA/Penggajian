/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USer
 */
public class Karyawan {

    private String namaKaryawan, golongan, statusNikah;
    private int masaKerja;
    private ArrayList<String> dataNamaKaryawan;
    private ArrayList<String> dataGolongan;
    private ArrayList<String> dataStatusNikah;
    private ArrayList<Integer> dataMasaKerja;
    
    
    
    // Constructor 1
    public Karyawan() {
        this.dataNamaKaryawan = new ArrayList<>();
        this.dataGolongan     = new ArrayList<>();
        this.dataStatusNikah  = new ArrayList<>();
        this.dataMasaKerja    = new ArrayList<>();
    }
    
    // Constructor 2 ( Overload Constructor )
    public Karyawan(String namaKaryawan, String golongan, String status, int masa) {
        this.golongan     = golongan;
        this.namaKaryawan = namaKaryawan;
        this.statusNikah  = status;
        this.masaKerja    = masa;
        
        this.dataNamaKaryawan = new ArrayList<>();
        this.dataGolongan     = new ArrayList<>();
        this.dataStatusNikah  = new ArrayList<>();
        this.dataMasaKerja    = new ArrayList<>();
        
    }
    
    public void inputDataNama(String data) {
        this.dataNamaKaryawan.add(data);
    }
    
    public ArrayList<String> listDataNama() {
        return this.dataNamaKaryawan;
    }
    
    public void inputDataGolongan(String data) {
        this.dataGolongan.add(data);
    }
    
    public ArrayList<String> listDataGolongan() {
        return this.dataGolongan;
    }
    
    public void inputDataStatus(String data) {
        this.dataStatusNikah.add(data);
    }
    
    public ArrayList<String> listDataStatus() {
        return this.dataStatusNikah;
    }
    
    public void inputDataMasaKerja(int data) {
        this.dataMasaKerja.add(data);
    }
    
    public ArrayList<Integer> listDataMasaKerja() {
        return this.dataMasaKerja;
    }
    
    // Mengembalikan nama Karyawan
    public String getKaryawan() {
        return this.namaKaryawan;
    } 
    // Mengembalikan Golongan
    public String getGolongan() {
        return this.golongan;
    }
    // Mengembalikan status Nikah
    public String getStatus() {
        return this.statusNikah;
    }
    // Mengembalikan masaKerja
    public int getMasa() {
        return this.masaKerja;
    }
    // Mengisi nilai namaKaryawan 
    public void setNamaKaryawan(String nama) {
        this.namaKaryawan = nama;
    }
    // Mengisi nilai golongan
    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }
    // Mengisi nilai StatusNikah
    public void setStatus(String statusNikah) {
        this.statusNikah = statusNikah;
    }
    // Mengisi nilai MasaKerja
    public void setMasa(int masa) {
        this.masaKerja = masa;
    }
    
    public int getIndexData(String nama) {
        int index = this.dataNamaKaryawan.indexOf(nama);
        if(index < 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
        return index;
    }
    
    public void searchData(String nama) {
        int i           = getIndexData(nama);
        String golongan = this.dataGolongan.get(i);
        int masa        = this.dataMasaKerja.get(i);
        String status   = this.dataStatusNikah.get(i);
        
        String pesan = "Nama karyawan : " + nama + "\nGolongan: " + golongan + "\n" +
                        "Masa : " + masa + "\nStatus : " + status;
        
        JOptionPane.showMessageDialog(null, pesan);
    }
    
    public void ubahDataKaryawan(String nama, String status, String golongan, int masa) {
        int i = getIndexData(nama);
        this.listDataNama().set(i, nama);
        this.listDataStatus().set(i, status);
        this.listDataGolongan().set(i, golongan);
        this.listDataMasaKerja().set(i, masa);
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
    }
    
    public void hapusDataKaryawan(String nama, String status, String golongan, int masa) {
        int i = getIndexData(nama);
        this.listDataNama().remove(i);
        this.listDataStatus().remove(i);
        this.listDataGolongan().remove(i);
        this.listDataMasaKerja().remove(i);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
    }
    
}
