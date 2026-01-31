/**Create a class BankAccount with accountId (String), accountHolderName (String), and balance (double) as instance variables. Include methods assignValues () 
(for initialization) and displayValues (). Implement a search function that takes an accountId as input and, if found within an array of BankAccount objects, 
displays the details of that specific account. In your main method, create an array of at least five BankAccount objects and demonstrate adding, displaying, 
and searching for accounts.*/

import java.util.Scanner;

class P14 {

    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    static void searchAccount(P14[] accounts, String searchId) {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        P14[] accounts = new P14[5];

        for (int i = 0; i < 5; i++) {
            accounts[i] = new P14();
            System.out.print("Enter Account ID: ");
            String id = sc.next();
            sc.nextLine();
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Balance: ");
            double bal = sc.nextDouble();

            accounts[i].assignValues(id, name, bal);
            System.out.println();
        }

        System.out.println("All Account Details:");
        for (int i = 0; i < 5; i++) {
            accounts[i].displayValues();
        }

        System.out.print("Enter Account ID to search: ");
        String searchId = sc.next();
        searchAccount(accounts, searchId);
    }
}
