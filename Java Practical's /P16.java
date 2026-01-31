/**A bank wants to offer a facility to calculate EMI (Equated Monthly Installment) for
Different types of loans. Design a class LoanCalculator with the following overloaded
Methods:
 calculateEMI(int principal, int time, float rate): For home loans
 calculateEMI(double principal, int time, double rate): For vehicle loans
 calculateEMI(int principal, int time): For short-term personal loans with a fixed interest rate of 10%
Demonstrate the use of all three methods in the main method by calculating EMIs for
Different loan types.*/


class P16 {

    double calculateEMI(int principal, int time, float rate) {
        double r = rate / (12 * 100);
        int n = time * 12;
        return (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }

    double calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int n = time * 12;
        return (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }

    double calculateEMI(int principal, int time) {
        double rate = 10;
        double r = rate / (12 * 100);
        int n = time * 12;
        return (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }

    public static void main(String[] args) {
        P16 loan = new P16();

        System.out.println("Home Loan EMI: " + loan.calculateEMI(500000, 20, 8.5f));
        System.out.println("Vehicle Loan EMI: " + loan.calculateEMI(300000.0, 5, 9.0));
        System.out.println("Personal Loan EMI: " + loan.calculateEMI(100000, 2));
    }
}
