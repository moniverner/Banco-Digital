package BancoD;
import java.util.Scanner;

public abstract class Account implements InterfaceAccount {
    private static int DEFAULT_ACCOUNT = 1;
    private static int SEQUENCE = 1;

    protected int account;
    protected int number;
    protected double balance;
    protected BankClient client;

    public Account() {
        this.account = Account.DEFAULT_ACCOUNT;
        this.number = SEQUENCE++;
        this.client = new BankClient();
    }
    
    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double setBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void extract(double value) {
        balance -= value;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void transfer(double value, Account destinyAccount) {
        this.extract(value);
        destinyAccount.deposit(value);
    }

    protected void registerClient() {
        String name;
        System.out.println("Please inform your name:");
        Scanner scan = new Scanner(System.in); 
        name = scan.nextLine();
        this.client.setName(name);
        float SSN;
        System.out.println("Please inform you Social Security Number:");
        Scanner scanSSN = new Scanner(System.in);
        SSN = scan.nextFloat();
        this.client.setSSN(SSN);
    }
    
    protected void PrintCommonInfo() {
        System.out.println(String.format("Client's name: %s", this.client.getName()));
        System.out.println(String.format("Client's SSN: %.0f", this.client.getSSN()));
        System.out.println(String.format("Account: %d", this.account));
        System.out.println(String.format("Account Number: %d", this.number));
        System.out.println(String.format("Excerpt: %.2f", this.balance));
    }
}