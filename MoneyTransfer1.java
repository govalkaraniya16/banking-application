public class MoneyTransfer {

    public static boolean transfer(double balance, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        }
        if (amount > 50000) {
            System.out.println("Transfer limit exceeded.");
            return false;
}
        System.out.println("Money transferred successfully.");
        return true;
    }

    public static void main(String[] args) {
        double balance = 10000;
        double amount = 2500;

        transfer(balance, amount);
    }
}