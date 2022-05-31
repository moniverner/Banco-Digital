package BancoD;

public interface Interface {
    void extrato(double value);
    void deposito(double value);
    void transferir(double value, Account ContaDestino);
    void printExcerpt();
}


