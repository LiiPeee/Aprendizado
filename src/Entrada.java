import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta cliente = new Conta();

        int depositar = 1, saque = 2, tentativa = 0,acesso = 2003;

        // Menu de Entrada
        System.out.println("                Bem Vindo Cliente               ");
        System.out.println("Qual o nome da sua Conta?");
        cliente.setNome(sc.next());
        System.out.println("Qual o número da sua conta?");
        cliente.setnDaConta(sc.nextInt());
        System.out.println("Qual a senha da sua conta?");
        cliente.setSenha(sc.nextInt());
        while (cliente.getSenha() != acesso) {
            if (tentativa < 3) {
                tentativa++;
                System.out.printf("Sua senha ainda está errada você tem 3 restam %d %n",tentativa );
                cliente.setSenha(sc.nextInt());
                continue;
            } else if (tentativa == 3) {
                System.out.println("Acabou o numero de tentativas");
                System.out.println("Deseja Alterar a senha?");
                String opcao = sc.next();
                cliente.setN(opcao);
                switch (cliente.getN()) {
                    case "Sim":
                        System.out.println("Qual a sua nova senha?");

                        System.out.printf("Sua senha nova é, %n" + cliente.getNovaSenha());
                        break;
                    case "Não":
                        System.out.println("Não há como acessar a conta, Até mais!");
                        break;

                }
            }
//
//            /else if (cliente.getSenha() == 2003) {
//                System.out.println("Sua senha está correta");
//                continue;
//            }

            System.out.println("   Acesso permitido    ");
            // Aqui é o Menu
            cliente.setSaldo(1000);
            System.out.printf("MENU %n Seu saldo é :%d", cliente.getSaldo(), "Depositar - 1 %n Saque - 2 ");
            depositar = sc.nextInt();
            saque = sc.nextInt();

            System.out.printf("Seu saldo é: %.2f %n", cliente.getSaldo());
            System.out.println("Gostaria de depositar algum valor? se sim digite :1 , se Não digite: 2");
            depositar = (sc.nextInt());
            if (depositar == 1) {
                System.out.println("Gostaria de depositar qual valor?");
                cliente.deposito(sc.nextDouble());
                System.out.printf("Seu saldo atual é de %d", cliente.getSaldo());
            } else if (depositar != 1) {
                System.out.println("Tudo bem, gostaria de fazer algum saque? se Sim digite: 1, caso Não digite 2");
                saque = (sc.nextInt());
                if (saque == 2) {
                    System.out.println("Qual valor deseja sacar?");
                    cliente.sacar(sc.nextDouble());
                }
                if (cliente.getSaldo() < 1000) {
                    System.out.printf("Você não pode sacar um valor maior que o seu Saldo ");
                }
            }
        }
    }
}

