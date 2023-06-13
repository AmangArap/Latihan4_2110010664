/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        NilaiAkhir mahasiswa = new NilaiAkhir("M. Raflian Noor", "2110010664", 80, 85, 90);
        
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NPM: " + mahasiswa.getNpm());
        System.out.println("Nilai Akhir: " + mahasiswa.hitungNilaiAkhir());
    }
}