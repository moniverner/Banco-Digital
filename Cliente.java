package BancoD;

public class Cliente {
    private String NomeCliente;
    private float clienteSSN;
    
    public float getSSN() {
        return this.clienteSSN;
    }

    public void setSSN(float SSN) {
        this.clienteSSN = SSN;
    }

    public String getNome() {
        return this.NomeCliente;
    }

    public void setNome(String nome) {
        this.NomeCliente = nome;
    }
}


