import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta cliente1 = new Conta("Felipe",2003,1000);
       //Conta cliente2 = new Conta("Amanda",2002,3000);


        int depositar = 1, saque = 2, tentativa = 0;
        int acesso;


        // Essa parte seria tipo o cadastro do cliente
        // Menu de Entrada
        System.out.println("                Bem Vindo Cliente               ");
        System.out.println("Sua conta é: " + cliente1.getNome());
        System.out.println("Numero da sua conta é: " + cliente1.getnDaConta());
        System.out.println("Qual a senha da sua conta?");
        acesso = sc.nextInt();




        // Agora vamos para a l�gica do while :)

        while (cliente1.getSenha() != acesso) {
            if (tentativa < 3) {
                tentativa++;
                System.out.printf("Sua senha ainda est� errada voc� tem 3 restam %d %n", tentativa);
                acesso = sc.nextInt();
                continue;
            } else if (tentativa == 3) {
                System.out.println("Acabou o numero de tentativas");
                System.out.println("Deseja Alterar a senha?");
                String opcao = sc.next();
                switch (opcao) {
                    case "Sim":
                        System.out.println("Qual a sua nova senha?");
                        // Aqui teria que receber a nova senha digitada pelo usu�rio e setar com o setSenha(), para depois mostrar com o getSenha()
                        // ATEN��O: Se for usar os dois atributos, precisa setar a senha nova nos dois, para n�o ter inconsist�ncias depois

                        // Comentei a linha abaixo s� para n�o ficar com erro
                        // System.out.printf("Sua senha nova �, %n" + cliente.getNovaSenha());
                        break;
                    case "Nao   ":
                        System.out.println("Nao ha como acessar a conta, até mais!");
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

            System.out.printf("MENU %n Seu saldo é :%d", cliente1.getSaldo(), "Depositar - 1 %n Saque - 2 ");
            depositar = sc.nextInt();
            saque = sc.nextInt();
            if (depositar == 1) {
                System.out.println("Gostaria de depositar qual valor?");
                double amount = sc.nextDouble();
                cliente1.deposito(amount);
                System.out.printf("Seu saldo atual é de %d", cliente1.getSaldo());
            } else if (depositar != 1) {
                System.out.println("Tudo bem, gostaria de fazer algum saque? se Sim digite: 1, caso Não digite 2");
                saque = (sc.nextInt());
                if (saque == 2) {
                    System.out.println("Qual valor deseja sacar?");
                    double amount = sc.nextDouble();
                    cliente1.sacar(amount);
                }

                if (cliente1.getSaldo() < 1000) {
                    System.out.printf("Você não pode sacar um valor maior que o seu Saldo ");
                }
            }
        }
    }
}

