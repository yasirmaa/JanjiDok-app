package models;

public class User {
    private String fullName;
    private String username;
    private String password;
    private String noTelp;

    public User(String fullName, String username, String password, String noTelp) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.noTelp = noTelp;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    
}
