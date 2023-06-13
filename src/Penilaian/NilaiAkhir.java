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
class NilaiAkhir extends Mahasiswa {
    private int uts;
    private int uas;
    private int tugas;

    public NilaiAkhir(String nama, String npm, int uts, int uas, int tugas) {
        setNama(nama);
        setNpm(npm);
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public double hitungNilaiAkhir() {
        double nilaiAkhir = 0.3 * uts + 0.3 * uas + 0.4 * tugas;
        return nilaiAkhir;
    }
}