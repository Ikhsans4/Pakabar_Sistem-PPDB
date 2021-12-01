
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Admin extends Akun {
    /**
     * constructor class admin
     * 
     * @param username
     * @param password
     */
    public Admin(String username, String password) {
        super(username, password);
    }

    public String[] readData() throws IOException {
        // membuka file database
        FileReader inputFile = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(inputFile);
        // membuat variabel untuk nyimpan data
        String[] dataUser = new String[6];
        // membaca database
        String data = bufferInput.readLine();
        while (data != null) {
            // membaca data satu per satu
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            // memasukkan data ke dalam array
            dataUser[0] = stringToken.nextToken();
            dataUser[1] = stringToken.nextToken();
            dataUser[2] = stringToken.nextToken();
            dataUser[3] = stringToken.nextToken();
            dataUser[4] = stringToken.nextToken();
            dataUser[5] = stringToken.nextToken();

            // membaca baris baru
            data = bufferInput.readLine();

        }
        bufferInput.close();
        inputFile.close();

        return dataUser;
    }

}
