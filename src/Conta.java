public class Conta {

    private String nome;
    private int nDaConta;
    private double saldo;
    private double sacar;
    private double deposito;
    private int senha;
    private String novaSenha;
    private String N;

    public Conta() {
    }

    public String getN() {
        return N;
    }

    public void setN(String n) {
        N = n;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        return deposito;
    }

//    public String getNovaSenha() {
//        return novaSenha;
//    }
//
//    public void setNovaSenha(String novaSenha) {
//        this.novaSenha = novaSenha;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
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


    public double deposito(double deposito) {
        return deposito + saldo;
    }

    public void sacar(double nextDouble) {
    }
}


