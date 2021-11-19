

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class register untuk mendaftarkan akun pendaftar pada sistem PPDB
 * @author pakabar
 * @since 21.11.18
 * @version 21.11.18
 */

public class Register {
    private String username;
    private String password;

    /**
     * Method constructor untuk class register.
     * @param username
     * @param username
     * @param password
     * @throws IOException
     */
    public Register(String username, String password) throws IOException
    {
        this.username = username;
        this.password = password;
        tulisDataRegister();
        
    }
    /**
     * method untuk menulis data registrasi akun ke dalam database
     * @throws IOException
     */
    protected void tulisDataRegister() throws IOException
    {
        // membuka file database
        File dbFile = new File("AkunDB.txt");
        FileWriter inputFile = new FileWriter(dbFile, true);
        BufferedWriter bufferInput = new BufferedWriter(inputFile);
        // menulis data ke dalam database
        bufferInput.write(this.username + "," + this.password);
        bufferInput.newLine();
        bufferInput.flush();
        // menutup database
        inputFile.close();
        bufferInput.close();
        
    }
    
}
