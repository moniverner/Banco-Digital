package BancoD;

public class Main {
    public static void main(String[] args) {
        Account checking = new checkingAccount();
        Account savings = new savingsAccount();

        checking.registerClient();
        savings.registerClient();

        checking.printExcerpt();
        savings.printExcerpt();
    }
}