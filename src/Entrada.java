import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta cliente = new Conta();

        int j = 3, depositar, saque,T;
        // Menu de Entrada
        System.out.println("Qual o nome da sua Conta?");
        cliente.setNome(sc.next());
        System.out.println("Qual o número da sua conta?");
        cliente.setnDaConta(sc.nextInt());
        System.out.println("Qual a senha da sua conta?");
        cliente.setSenha(sc.nextInt());

        // aqui eu testo a senha
        if (cliente.getSenha() != 2003) {
            for ( T = 0; T < 3; T++) {
                System.out.printf("Sua senha está errada você tem %d tentiva restante %n", j--);
                cliente.setSenha(sc.nextInt());
            }
            if (T == 3) {
                System.out.print("Acabou o numero de tentativas");
                return;
            }
        }
        if (cliente.getSenha() == 2003) {
            System.out.println("Sua senha está correta");
        }
        // Mostrando o Saldo do cliente e perguntando se quer depositar mais algum valor
        cliente.setSaldo(1000);
        System.out.printf("Seu saldo é: %.2f %n", cliente.getSaldo());
        System.out.println("Gostaria de depositar algum valor? se sim digite :1 , se Não digite: 2");
        depositar = (sc.nextInt());
        if (depositar == 1) {
            System.out.println("Gostaria de depositar qual valor?");
            cliente.deposito(sc.nextDouble());
        } else if (depositar != 1) {
            System.out.println("Tudo bem, gostaria de fazer algum saque? se Sim digite: 1, caso Não digite 2");
            saque = (sc.nextInt());
            if (saque == 1) {
                System.out.println("Qual valor deseja sacar?");
                cliente.sacar(sc.nextDouble());
            }
            if (cliente.getSaldo() < 1000) {
                System.out.printf("Você não pode sacar um valor maior que o seu Saldo ");
            }
        }
    }
}