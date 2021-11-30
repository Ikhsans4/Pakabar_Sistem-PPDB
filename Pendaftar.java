

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Pendaftar extends Akun implements Data{
    String nama;
    String NISN;
    String alamat;
    String kabupatenKota;
    String jenisKelamin;
    
    /**
     * Method constructor class pendaftar
     */
    public Pendaftar() {
        
    }
    
    /**
     * Method constructor class pendaftar
     * @param nama
     * @param NISN
     * @param alamat
     * @param kabupatenKota
     * @param jenisKelamin
     */
    public Pendaftar(String nama, String NISN, String alamat, String kabupatenKota, String jenisKelamin) {
        this.nama = nama;
        this.NISN = NISN;
        this.alamat = alamat;
        this.kabupatenKota = kabupatenKota;
        this.jenisKelamin = jenisKelamin;
    }
    /**
     * Method getter untuk mengambil nama
     * @return nama
     */
    public String getNama() {
        return this.nama;
    }
    /**
     * Method getter untuk mengambil NISN
     * @return NISN
     */
    public String getNISN() {
        return this.NISN;
    }
    /**
     * Method getter untuk mengambil alamat
     * @return alamat
     */
    public String getAlamat() {
        return this.alamat;
    }
    /**
     * Method getter untuk mengambil kabupatenkota
     * @return kabupatenKota
     */
    public String getKabupatenKota() {
        return this.kabupatenKota;
    }
    /**
     * Method getter untuk mengambil jeniskelamin
     * @return jenisKelamin
     */
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    /**
     * Method untuk menulis data pendaftar kedalam database
     * @throws IOException
     */
    public void tulisDataPendaftar() throws IOException{
        // membuka file database
//        File input = new File("database.txt");
        FileWriter inputFile = new FileWriter("database.txt", true);
        BufferedWriter bufferInput = new BufferedWriter(inputFile);

        // menulis data ke dalam database
        bufferInput.write(super.getUsername() + "," + this.nama + "," + this.NISN + "," + this.alamat + "," + this.kabupatenKota + "," + this.jenisKelamin);
        bufferInput.newLine();
        bufferInput.flush();

        // menutup database
        inputFile.close();
        bufferInput.close();
    }
    public boolean updateData(String newNama, String newNISN, String newAlamat, String newKabupatenKota, String newJenisKelamin)throws IOException {
        // membuka file database
        File database = new File("database.txt");
        FileReader inputFile = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(inputFile);
        boolean sukses = false;

        // membuat file database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter outputFile = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(outputFile);
        // membaca useraktif
        super.readUserAktif();

        // membaca data dalam database
        String data = bufferInput.readLine();
        while (data != null) {
            // memisahkan setiap data untuk mengecek username
            StringTokenizer strToken = new StringTokenizer(data, ",");
            String usernameDB = strToken.nextToken();
            if (usernameDB.equals(super.getUsername())) {
                bufferOutput.write(super.getUsername() + "," + newNama + "," + newNISN + "," + newAlamat + "," + newKabupatenKota + "," + newJenisKelamin);
                sukses = true;
            } else {
                bufferOutput.write(data);
            }
            bufferOutput.newLine();
            bufferOutput.flush();
            data = bufferInput.readLine();
        }

        // menutup database
        inputFile.close();
        bufferInput.close();
        outputFile.close();
        bufferOutput.close();
        // menghapus database
        database.delete();
        // merename tempdb ke database
        tempDB.renameTo(database);
        
        return sukses;
        
    }
    
    public boolean cekUserDaftar() throws IOException{
        // membuka file database
        FileReader inputFile = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(inputFile);
        // membuat boolean untuk mengecek data ada atau tidak
        boolean isExist = true;
        String data = bufferInput.readLine();
        while (data != null) {
            // membaca data satu per satu
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            String userDB = stringToken.nextToken();
            if (userDB.equals(super.getUsername())) {
                isExist = false;
            }else {
                isExist = true;
        
            }
            // membaca baris baru
            data = bufferInput.readLine();
            
        }
        bufferInput.close();
        return isExist;
    }
    
    public void readData() throws IOException{
        // membuka file database
        FileReader inputFile = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(inputFile);
        // membaca database
        String data = bufferInput.readLine();
        while (data != null) {
            // membaca data satu per satu
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            String userDB = stringToken.nextToken();
            if (userDB.equals(super.getUsername())) {
                this.nama = stringToken.nextToken();
                this.NISN = stringToken.nextToken();
                this.alamat = stringToken.nextToken();
                this.kabupatenKota = stringToken.nextToken();
                this.jenisKelamin = stringToken.nextToken();
                break;
            }
            // membaca baris baru
            data = bufferInput.readLine();
            
        }
        bufferInput.close();
        inputFile.close();
    }

    @Override
    public String getKecamatan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
