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
    public Akun(){

    }
    

    /**
     * Method constructor untuk class Akun.
     * @param username
     * @param password
     */
    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
       
    }
    /**
     * Method setter untuk mengatur username
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
     * @param namaLengkap
     */
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

     /**
     * Method getter nama lengkap user
     * @return namaLengkap
     */
    public String getNamaLengkap() {
        return this.namaLengkap;
    }
    /**
     * Method getter jenis kelamin user
     * @return jenisKelamin
     */
    public String getJeniskelamin() {
        return jeniskelamin;
    }

    /**
     * Method untuk mengecek username dan password user.
     * @return login
     * @throws IOException
     */
    public boolean cekUsernameAndPassword() throws IOException{
        // membuka file
        boolean login;
        FileReader inputFile = null;
        BufferedReader bufferInput = null;
        StringTokenizer stringToken;
        inputFile = new FileReader("AkunDB.txt");
        bufferInput = new BufferedReader(inputFile);
        File tempFile = new File("akunAktif.txt");
        FileWriter outputFile = new FileWriter(tempFile);
        BufferedWriter bufferOutput = new BufferedWriter(outputFile);


        String data;
        
        // mengecek inputan user dengan data didalam database
        while (true) {
            data = bufferInput.readLine();
            stringToken = new StringTokenizer(data, ",");
            String usernameDB = stringToken.nextToken();
            String passwordDB = stringToken.nextToken();
            this.namaLengkap = stringToken.nextToken();
            

            
            if (this.username.equals(usernameDB) && this.password.equals(passwordDB)) {
                login = true;
                bufferOutput.write(this.username + "," + this.password + "," + this.namaLengkap);
                bufferOutput.newLine();
                bufferOutput.flush();
                break;
            } else {
                login = false;
            }

        }
        // menutup buffer
        bufferOutput.close();
        bufferInput.close();
        return login;


    }

    public void readUserAktif() throws IOException{
        // membuka file useraktif
        FileReader akunAktif = new FileReader("akunAktif.txt");
        BufferedReader bufferAkun =  new BufferedReader(akunAktif);
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

    public boolean editData() throws IOException{
        // membuka file database
        FileWriter inputFile = new FileWriter("database.txt", true);
        BufferedWriter bufferInput = new BufferedWriter(inputFile);
        // variabel boolean untuk mengecek username
        boolean isExist = cekUsername(this.username);
        // mengecek username sudah ada atau tidak
        if (isExist) {
            // menulis data ke dalam database
            bufferInput.write(this.username + "," + this.password + "," + this.namaLengkap);
            bufferInput.newLine();
            bufferInput.flush();
        }        

        // menutup database
        inputFile.close();
        bufferInput.close();
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
            isExist = isExist && data.toLowerCase().contains(keywords.toLowerCase());
            // membaca baris selanjutnya
            data = bufferInput.readLine();
        }
        bufferInput.close();
        return isExist;

    }

}
