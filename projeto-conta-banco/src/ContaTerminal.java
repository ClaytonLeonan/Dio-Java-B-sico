import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        String agencia;
        String nomeCliente;
        Double saldo = 1500.00;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite sua AG: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite sua conta: ");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite seu Nome: ");
        nomeCliente = scanner.next();

        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque\"");
      


    }
}
