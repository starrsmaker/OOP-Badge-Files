package OOP.accounts;

import OOP.accounts.UserAccount;

public class AccountsRunner1 {
    public static void main(String[] args) {
        // 4. Fill in the blanks below for Bill, a UserAccount with username 'bill' and password 'Password123'. 
        //  Then, write a program which involves calling both of Bill's methods.  
        UserAccount bill = new UserAccount("MoneyMoneyBillz", "kachingkachingrich", "bill123@gmail.com", "Chicago"); 

        // 5. After all of that, create another user. Fill in the blank below for a program which asks the user for a username/password, and checks 
        UserAccount mary = new UserAccount("ALittleLamb", "baabaablacksheep", "mary546@gmail.com", "a land far, far away");

        bill.signup();
        mary.login();
    }
}


