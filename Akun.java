import java.io.BufferedReader;
import java.io.FileReader;
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
     * Method getter untuk mendapatkan username
     * 
     * @return username
     */
    public String getUsername() {
        return this.username;
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
        boolean login = false;
        FileReader inputFile = null;
        BufferedReader bufferInput = null;
        StringTokenizer stringToken;
        inputFile = new FileReader("AkunDB.txt");
        bufferInput = new BufferedReader(inputFile);

        String data;
        data = bufferInput.readLine();
        
        // mengecek inputan user dengan data didalam database
        while (data != null) {
            
            stringToken = new StringTokenizer(data, ",");
            String usernameDB = stringToken.nextToken();
            String passwordDB = stringToken.nextToken();
            this.namaLengkap = stringToken.nextToken();
            

            
            if (this.username.equals(usernameDB) && this.password.equals(passwordDB)) {
                login = true;
                break;
            } else {
                login = false;
            }
            data = bufferInput.readLine();
        }
        // menutup buffer
        bufferInput.close();
        return login;
    }

}
