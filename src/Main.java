import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Bank App");
        Scanner sc = new Scanner(System.in);

        Bank bankAccount1 = new SBIBankAccount(1000, "Rushi", "rushi123");
        bankAccount1.addMoney(1000);
        bankAccount1.withdrawMoney(200);
        int balance1 = bankAccount1.checkBalance();

        SBIBankAccount bankAccount2 = new SBIBankAccount();
        bankAccount2.setName("Harshu");
        bankAccount2.setBalance(5000);
        bankAccount2.setPassword("harshu123");
    }
}