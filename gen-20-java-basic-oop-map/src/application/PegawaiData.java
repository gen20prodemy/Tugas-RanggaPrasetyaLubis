package application;

import data.Pegawai;
import data.PegawaiService;

import java.util.HashMap;
import java.util.Map;

public class PegawaiData implements PegawaiService<Integer, Pegawai>{ // class dengan mengimplementasikan interface
    private Map<Integer, Pegawai> pegawaiMap; //varible untuk menampung data
    public PegawaiData(){ //constructor pegawai data
        this.pegawaiMap = new HashMap<>();
    }

    @Override
    public void create(Integer idPegawai, Pegawai value) {//method create untuk menambahkan data
        pegawaiMap.put(idPegawai, value);
        System.out.println("\nData berhasil di buat");
    }

    @Override
    public Pegawai read(Integer idPegawai) {// method read untuk membaca atau mencari data dengan mencari key dari data
        Pegawai value = pegawaiMap.get(idPegawai);

        if (pegawaiMap.containsKey(idPegawai)){

            System.out.println();
            System.out.println(idPegawai + " | " + value.toString());
        }
        else {
            System.out.printf("\nId %d tidak ditemukan\n", idPegawai);
        }
        return value;
    }

    @Override
    public void update(Integer idPegawai, Pegawai newPegawai) { // method untuk mengupdate data dengan mencari key dari data
        if (pegawaiMap.containsKey(idPegawai)){
            pegawaiMap.put(idPegawai, newPegawai);
            System.out.println("\nUpdate data berhasil ");
        } else {
            System.out.printf("\nId %d tidak ditemukan", idPegawai);
        }
    }

    @Override
    public void delete(Integer idPegawai) { // method untuk menghapus data dengan mencari key dari data
        if (pegawaiMap.containsKey(idPegawai)){
            pegawaiMap.remove(idPegawai);
            System.out.println("\nData Pegawai di hapus");
        }
        else {
            System.out.printf("\nId %d tidak ditemukan", idPegawai);
        }
    }

    @Override
    public void display(){ // menampilkan seluruh isi data
        System.out.println("\nDaftar Seluruh Pegawai");

        for (Map.Entry<Integer, Pegawai> entry : pegawaiMap.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
