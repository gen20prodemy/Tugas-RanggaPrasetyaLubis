package data;

public class Pegawai {
    private String namaPegawai;
    private String alamatPegawai;

    public Pegawai(String namaPegawai, String alamatPegawai){
        this.namaPegawai = namaPegawai;
        this.alamatPegawai = alamatPegawai;
    }

    public String toString(){
        return namaPegawai + " | " + alamatPegawai;
    }
}
