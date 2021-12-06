public class Conta {

    private String nome;
    private int nDaConta;
    private double saldo;
    private double deposito;
    private double sacar;
    private int senha;


    public Conta(String nome, int senha, double saldo) {
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }


    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getnDaConta() {
        return nDaConta;
    }

    public void setnDaConta(int nDaConta) {
        this.nDaConta = nDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double amount) {
        saldo += amount;
    }

    public boolean sacar(double amount) {
        if (this.saldo < amount) {
            return false;
        } else {
            this.saldo -= amount;
            return true;
        }
    }

}

