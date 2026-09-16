package OOP.accounts;

public class UserAccount {
    // 1. Fill out the properties
    public String username; 
    private String password;
    private String email;
    private String hometown;

    // 2. Write constructor for UserAccount
    public UserAccount(String username, String password, String email, String hometown) {
        this.username = username; 
        this.password = password; 
        this.email = email;
        this.hometown = hometown;
    }

    // 3. Write your methods here
    public void signup () {
        System.out.println("Welcome to your new account, " + username);

    }

    public void login () {
        System.out.println("Welcome back, " + username);
    }
}
