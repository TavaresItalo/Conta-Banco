import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        int numero;
        String  nome;
        String agencia;
        double saldo;

        System.out.println("Digite por favor o número de sua conta: ");
        numero = leitor.nextInt();
        System.out.println("Digite o número da agência: ");
        agencia = leitor.next();
        System.out.println("Digite o saldo da conta: ");
        saldo = leitor.nextDouble();
        System.out.println("Digite o nome do cliente: ");
        nome = leitor.next();

        System.out.print(" Olá " + nome + "," + "obrigado por criar uma conta em nosso banco,"
        + " sua agência é " + agencia + ", conta número " + numero + " e seu saldo de " + saldo + " já está disponível para saque." );

    
    }
}
