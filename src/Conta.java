public class Conta {

    private String nome;
    private int nDaConta;
    private double saldo;
    private double sacar;
    private double deposito;
    private int senha;
    private String novaSenha;


    public Conta() {
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    public double deposito(double colocar ){

        this.saldo +=deposito;
        return saldo;

    }
    public double sacar(double retirada ){

        this.saldo -=retirada;
        return saldo;

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

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }
}
