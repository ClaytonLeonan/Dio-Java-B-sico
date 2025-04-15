import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        int opcao;
        String agencia;
        String nomeCliente = "Roberto";
        Double saldo = 1500.00;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================\n");
        System.out.println("*** Bem Vindo ao Banco xxxxx ***");
        System.out.println("===================================\n");
        
        
        while (contador < 1) {
            System.out.println("Olá " + nomeCliente + ", digite um numero para avançar:\n");
            System.out.println("1. Ver saldo\n2. Sacar valor\n3. Sair ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar");
                    Double valorSolicitado = scanner.nextDouble();

                    if(valorSolicitado > saldo){
                        System.out.println("Saldo insuficiente");
                        System.out.println("===================================\n");
                    } else {
                        saldo = saldo - valorSolicitado;
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar o Banco xxxxx!");
                    contador++;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    
            }
        }

    }
}
