/**Design a class BankAccount with account_holder_name and balance. Use a static variable
interest_rate (same for all accounts). Include methods to calculate and display the interest
Earned. Update interest rate using a static method.*/


class BankAccount {
    private String holderName;
    private double balance;
    private static double interestRate = 0.05;

    public BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getInterest() {
        return balance * interestRate;
    }

    public void showInterest() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + getInterest());
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
        System.out.println("New interest rate: " + interestRate);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Alice", 1000);
        BankAccount a2 = new BankAccount("Bob", 2000);

        a1.showInterest();
        a2.showInterest();

        BankAccount.setInterestRate(0.07);

        a1.showInterest();
        a2.showInterest();
    }
}
