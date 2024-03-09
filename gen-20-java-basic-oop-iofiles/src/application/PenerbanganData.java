package application;

import data.PenerbanganService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PenerbanganData extends PenerbanganService { // class untuk mengolah proses input dari user
    //class ini sebagai class child dari parent class penerbangan service

    public PenerbanganData(String fileName){//menggunakan constructor yang sama dengan parentnya
        super(fileName);
    }

    @Override
    public void create(String data) { // mengembangkan method abstract creat yang diambil dari class parent
        try(FileWriter fw = new FileWriter(fileName,true); // menambahkan method java.io untuk menulis di file
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw)) {

            pw.println(data);
            System.out.println("Jadwal berhasil dimasukkan ");
        }
        catch (IOException e){
            System.err.println("Data Input Error");
        }
    }

    @Override
    public void read() { // mengembangkan method abstract read yang diambil dari class parent
        try(BufferedReader br =  new BufferedReader(new FileReader(fileName))) { // menambahkan method java.io untuk membaca di file
            String line;
            while ((line = br.readLine()) != null){ // perulangan untuk membaca setiap baris
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("Data penerbangan tidak dapat dibaca");
        }
    }

    @Override
    public void update(int lineNumber, String newData) { // mengembangkan method abstract update yang diambil dari class parent
        List <String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){ //membaca isi file
            String line;
            while ((line = br.readLine()) != null){ // perulangan untuk membaca isi file tiap baris
                lines.add(line);
            }
            if (lineNumber >= 0 && lineNumber < lines.size()){ // kondisi file apabila file tersebut memiliki isi
                lines.set(lineNumber, newData);//line dimulai dari 0
                try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))) { // menulis file kembali
                    for (String updateLine : lines){ // perulangan untuk menambahkan update
                        pw.println(updateLine);
                    }
                    System.out.println("Data Penerbangan berhasil diperbarui");
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            } else {
                System.out.println("Baris data salah");
            }
        }
        catch (IOException e){
            System.err.println("Jadwal gagal diperbarui");
        }
    }

    @Override
    public void delete(int lineNumber) { // mengembangkan method abstract delete yang diambil dari class parent
        List <String> lines = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) { // membaca isi file
            String line;
            while ((line = br.readLine()) != null){ // perulangan untuk membaca isi file tiap baris
                lines.add(line);
            }

            if (lineNumber >= 0 && lineNumber < lines.size()){ // perulangan untuk menghapus dan menuliskan sisa dari isi file
                lines.remove(lineNumber);//line dimulai dari 0

                try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
                    for (String remainingLine : lines){
                        pw.println(remainingLine);
                    }

                    System.out.println("Data penerbangan berhasil dihapus");
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Baris data error");
            }
        }
        catch (IOException e){
            System.err.println("Jadwal gagal dihapus");
        }
    }
}
