package OOP.accounts;

import java.util.Scanner;

public class AccountsRunner2 {
    public static void main(String[] args) {
        // 5. Create two UserAccount variables `user1` and `user2` with usernames and passwords of your choosing. 
        //  Fill in the blank below for a program which asks the user for a username/password and checks 

        String user1 = "lila";
        String password1 = "superdupersecret";
        String user2 = "madeline";
        String password2 = "donthackme";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");  
        String username = input.nextLine(); 
        System.out.print("Enter password: "); 
        String password = input.nextLine();

        if (username == user1 && password == password1) {
            System.out.println("Welcome " + username);
        } else if (username == user2 && password == password2) {
            System.out.println("Welcome " + username);
        } else {
            System.out.println("Invalid username or password");
        }

        input.close(); 
    }
}
