/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penggajian;

/**
 *
 * @author USer
 */
// Class `Gaji` Mendapat Warisan Dari `Karyawan` :0
public class Gaji extends Karyawan {
    
    public Gaji() {}
    
    public int tunjanganGolongan() {
        int tunjangan = 0; 
        if(getGolongan().equals("I")) {
            tunjangan = 3000000; 
        } else if(getGolongan().equals("II")) {
            tunjangan = 4000000;
        } else if(getGolongan().equals("III")) {
            tunjangan = 5000000;
        } else if(getGolongan().equals("IV")) {
            tunjangan = 6000000;
        } else {
            tunjangan = 7000000;
        }
        return tunjangan;
    }
    
    public int tunjanganStatus() {
        int tunjanganNikah = 0;
        if(getStatus().equals("Menikah")) {
            tunjanganNikah = 1000000;
        } else {
            tunjanganNikah = 250000;
        }
        return tunjanganNikah;
    }
    
    public int tunjanganMasaKerja() {
        int tunjanganKerja = 0;
        if(getMasa() >= 1 && getMasa() <= 3) {
            tunjanganKerja = 2000000;
        } else if(getMasa() >= 4 && getMasa() <= 7) {
            tunjanganKerja = 3000000;
        } else {
            tunjanganKerja = 4000000;
        } 
        return tunjanganKerja;
    }
    
    public int gajiTotal() {
        return tunjanganMasaKerja() + tunjanganGolongan() + 
                tunjanganStatus();
    }
    
    
    
    
    
    
    
    
}
