package data;

public interface PegawaiService<Integer, String> { //interface
    void create(Integer idPegawai, String namaPegawai);
    Pegawai read(Integer idPegawai);
    void update(Integer idPegawai, String newPegawai);
    void delete(Integer idPegawai);

    void display();
}
