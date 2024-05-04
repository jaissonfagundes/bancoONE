import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String nome;
        int conta;
        int agencia;
        int saldo = 2000;
        int opcao;
        int recebe = 0;
        int transfere = 0;

        System.out.println("=-= Bem Vindo ao banco ONE=-=");
        System.out.println("Informe os seus dados para acessar sua conta");
        System.out.println("Nome: ");
        nome = leitura.next();
        System.out.println("Agencia: ");
        conta = leitura.nextInt();
        System.out.println("Conta: ");
        agencia = leitura.nextInt();
        do {
            System.out.println("""
                **********************************
                 ➖➖ Operações disponíveis ➖➖
                
                      1.✅Consultar saldo.
                      2.✅Receber Valor.
                      3.✅Transferir Valor.
                      4.✅Sair
                  
                **********************************
                """);
            opcao = leitura.nextInt();
            if (opcao > 4 || opcao < 1){
                System.out.println("❌ OPÇÃO INVÁLIDA ❌");
            }else if (opcao == 1) {
                System.out.println("""
                                =======================
                                |   Seu saldo é de:   |
                                .                     .  
                                        R$ """ + saldo);
                System.out.println("=======================");
            } else if (opcao == 2) {
                while (recebe < 1) {
                    System.out.println("Quanto você deseja depositar ?: ");
                    recebe = leitura.nextInt();
                    if (recebe < 1){
                        System.out.println("Valor Inválido !");
                    }
                }
                saldo = saldo + recebe;
            } else if (opcao == 3) {
                while (true) {
                    System.out.println("Quanto você deseja transferir ?:");
                    transfere = leitura.nextInt();
                    if (transfere <= saldo){
                        saldo = saldo - transfere;
                        break;
                    }else{
                        System.out.println("Saldo insuficiente !");
                    }
                }

            } else {
                System.out.println("Obrigado por utilizar os serviços do Banco ONE !");
            }

        }while (opcao != 4) ;
    }

}