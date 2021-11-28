import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Pendaftar extends Akun{
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
    /**
     * Method cek user aktif digunakan untuk mengatur class akun 
     * untuk dijadikan primary key dari data pendaftar
     * @throws IOException
     */
    public void cekUserAktif() throws IOException{
        // membuka file useraktif
        FileReader akunAktif = new FileReader("akunAktif.txt");
        BufferedReader bufferAkun =  new BufferedReader(akunAktif);
        // membaca data dalam file
        String data = bufferAkun.readLine();
        // memisahkan data
        StringTokenizer stringToken = new StringTokenizer(data, ",");
        super.setUsername(stringToken.nextToken());
        super.setPassword(stringToken.nextToken());
        super.setNamaLengkap(stringToken.nextToken());
        // menutup file
        akunAktif.close();
        bufferAkun.close();

    }
    public boolean cekUserDaftar() throws IOException{
        // membuka file database
        FileReader inputFile = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(inputFile);
        // membuat boolean untuk mengecek data ada atau tidak
        boolean isExist = false;
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
            }
            // membaca baris baru
            data = bufferInput.readLine();
            
        }
        bufferInput.close();
    }
    
    

}
