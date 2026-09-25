public class Main {
    void main() {
        //Declaration
        double cardBalance = 5000.00;
        double interestRate = 0.17;
        double monthOneInterest = cardBalance * interestRate;

        cardBalance = cardBalance + monthOneInterest;
        // Display
        System.out.println("Initial Credit Card Balance: $5000.0");
        System.out.println("Interest due after 1 month:" + monthOneInterest);




    }
}