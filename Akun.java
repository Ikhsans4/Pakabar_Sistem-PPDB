
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Class akun untuk mengelola akun admin dan pendaftar sistem PPDB
 * 
 * @author pakabar
 * @since 21.11.18
 * @version 21.11.18
 */

public class Akun {
    private String username;
    private String password;
    private String namaLengkap;
    private String jeniskelamin;

    /**
     * Method constructor untuk class Akun.
     */
    public Akun() {

    }

    /**
     * Method constructor untuk class Akun.
     * 
     * @param username
     * @param password
     */
    public Akun(String username, String password) {
        this.username = username;
        this.password = password;

    }

    /**
     * Method setter untuk mengatur username
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Method getter untuk mendapatkan username
     * 
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Method setter untuk mengatur password
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method getter untuk mendapatkan password
     * 
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Method setter untuk mengatur namalengkap
     * 
     * @param namaLengkap
     */
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    /**
     * Method getter nama lengkap user
     * 
     * @return namaLengkap
     */
    public String getNamaLengkap() {
        return this.namaLengkap;
    }

    /**
     * Method getter jenis kelamin user
     * 
     * @return jenisKelamin
     */
    public String getJeniskelamin() {
        return jeniskelamin;
    }

    /**
     * Method untuk mengecek username dan password user.
     * 
     * @return login
     * @throws IOException
     */
    public boolean cekUsernameAndPassword() throws IOException {
        // membuka file
        boolean login = false;
        FileReader inputFile = null;
        BufferedReader bufferInput = null;
        StringTokenizer stringToken;
        inputFile = new FileReader("AkunDB.txt");
        bufferInput = new BufferedReader(inputFile);
        

        String data = bufferInput.readLine();

        // mengecek inputan user dengan data didalam database
        while (data != null) {
            
            stringToken = new StringTokenizer(data, ",");
            String usernameDB = stringToken.nextToken();
            String passwordDB = stringToken.nextToken();
            this.namaLengkap = stringToken.nextToken();

            if (this.username.equals(usernameDB) && this.password.equals(passwordDB)) {
                login = true;
                tulisAkunAktif();
                break;
            }
            data = bufferInput.readLine();

        }
        // menutup buffer
        
        bufferInput.close();
        return login;

    }
    protected void tulisAkunAktif() throws IOException {
        File tempFile = new File("akunAktif.txt");
        FileWriter outputFile = new FileWriter(tempFile);
        BufferedWriter bufferOutput = new BufferedWriter(outputFile);
        // menulis data akun aktif ke dalam database
        bufferOutput.write(this.username + "," + this.password + "," + this.namaLengkap);
        bufferOutput.newLine();
        bufferOutput.flush();
        // menutup file
        bufferOutput.close();
    }

    /**
     * Method read user aktif digunakan untuk mengatur variabel akun
     * untuk dijadikan primary key dari data pendaftar
     * 
     * @throws IOException
     */
    public void readUserAktif() throws IOException {
        // membuka file useraktif
        FileReader akunAktif = new FileReader("akunAktif.txt");
        BufferedReader bufferAkun = new BufferedReader(akunAktif);
        // membaca data dalam file
        String data = bufferAkun.readLine();
        // memisahkan data
        StringTokenizer stringToken = new StringTokenizer(data, ",");
        this.setUsername(stringToken.nextToken());
        this.setPassword(stringToken.nextToken());
        this.setNamaLengkap(stringToken.nextToken());
        // menutup file
        akunAktif.close();
        bufferAkun.close();

    }

    public boolean editDataAkun(String newUsername, String newPassword, String newNamaLengkap) throws IOException {
        
        
        // mengambil ambil database original
        File database = new File("AkunDB.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        // membuat buat database sementara
        File tempDB = new File("tempAkunDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        // membaca useraktif
        readUserAktif();
        // variabel boolean untuk mengecek username
        boolean isExist = cekUsername(newUsername);

        // // mengecek username sudah ada atau tidak
        if (!isExist) {
            // membaca database
            String data = bufferInput.readLine();

            // menyesuaikan data username dalam db dengan username yang aktif
            while (data != null) {
                StringTokenizer strToken = new StringTokenizer(data, ",");
                if (strToken.nextToken().equals(this.username)) {
                    // menulis data baru ke dalam database
                    bufferOutput.write(newUsername + "," + newPassword + "," + newNamaLengkap);
                    // mengupdate data dalam atribut
                    this.username = newUsername;
                    this.password = newPassword;
                    this.namaLengkap = newNamaLengkap;
                    // mengupdate data dalam file temp akun aktif
                    tulisAkunAktif();
                } else {
                    // menulis data ke dalam database
                    bufferOutput.write(data);
                }
                bufferOutput.newLine();
                bufferOutput.flush();
                // membaca kembali data
                data = bufferInput.readLine();

            }
        }

        // menutup database
        fileInput.close();
        bufferInput.close();
        fileOutput.close();
        bufferOutput.close();
        // menghapus database lama
        database.delete();
        // membuat database baru
        tempDB.renameTo(database);
        return isExist;
    }

    protected boolean cekUsername(String keywords) throws IOException {

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        String data = bufferInput.readLine();
        boolean isExist = false;

        while (data != null) {
            isExist = true;
            // menecek username ada atau tidak
            isExist = isExist && data.contains(keywords);
            // mengecek untuk menghentikan looping
            if (isExist) {
                if(this.username.contains(keywords)){
                    isExist = false;
                }
                break;
            }
            // membaca baris selanjutnya
            data = bufferInput.readLine();
        }
        bufferInput.close();
        return isExist;

    }

}
