

/**
 * Class akun untuk mengelola akun admin dan pendaftar sistem PPDB
 * @author pakabar
 * @since 21.11.18
 * @version 21.11.18
 */

public class Akun {
    private String username;
    private String password;

    /**
     * Method constructor untuk class Akun.
     * @param username
     * @param password
     */
    public Akun(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    /**
     * Method getter untuk mendapatkan username
     * @return username
     */
    public String getUsername(){
        return this.username;
    }
    /**
     * Method getter untuk mendapatkan password
     * @return password
     */
    public String getPassword(){
        return this.password;
    }
    
}
