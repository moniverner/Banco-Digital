package BancoD;

public class ContaPoupanca extends Conta {
        public void printExcerpt() {
            System.out.println("Extrato da conta poupanca: ");
            super.PrintCommonInfo();
        }
}

