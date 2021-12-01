
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Class register untuk mendaftarkan akun pendaftar pada sistem PPDB
 * 
 * @author pakabar
 * @since 21.11.18
 * @version 21.12.1
 */

public class Register {

    private String username;
    private String password;
    private String namaLengkap;

    /**
     * Method constructor untuk class register tanpa parameter.
     */
    public Register() {

    }

    /**
     * Method constructor untuk class register.
     * 
     * @param username
     * @param password
     * @param namaLengkap
     * @throws IOException
     */
    public Register(String username, String password, String namaLengkap) throws IOException {
        this.username = username;
        this.password = password;
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
     * method untuk menulis data registrasi akun ke dalam database
     * 
     * @throws IOException
     */
    public boolean tulisDataRegister() throws IOException {
        // membuka file database
        FileWriter inputFile = new FileWriter("AkunDB.txt", true);
        BufferedWriter bufferInput = new BufferedWriter(inputFile);
        // variabel boolean untuk mengecek username
        boolean isExist = cekUsername(this.username);
        // mengecek username sudah ada atau tidak
        if (!isExist) {
            isExist = false;
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

    /**
     * Method untuk mengecek username telah digunakan atau belum
     * @param keywords
     * @return isExist
     * @throws IOException
     */
    protected boolean cekUsername(String keywords) throws IOException {

        FileReader fileInput = new FileReader("AkunDB.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);
        String data = bufferInput.readLine();
        boolean isExist = false;

        while (data != null) {
            isExist = true;
            StringTokenizer strToken = new StringTokenizer(data, ",");
            // menecek username ada atau tidak
            isExist = isExist && (strToken.nextToken().equals(keywords));
            // // mengecek data ada atau tidak untuk menghentikan looping
            if (isExist) {
                break;
            }
            // membaca baris selanjutnya
            data = bufferInput.readLine();
        }
        bufferInput.close();
        return isExist;

    }

}
