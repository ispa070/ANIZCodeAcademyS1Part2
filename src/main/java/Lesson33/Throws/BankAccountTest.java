package Lesson33.Throws;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1500); // prøver at hæve for meget
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account.deposit(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance: " + account.getBalance());
    }
}