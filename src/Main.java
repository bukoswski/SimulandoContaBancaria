import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int Numero;
         double Saldo;
         String NomeCliente;
         //String Agencia;


        Scanner input = new Scanner(System.in);

        System.out.println("Olá tudo bem? Como é o seu nome? ");
        NomeCliente = input.nextLine();

        System.out.println("Por favor digite o número da sua Agência: ");
        String Agencia = input.nextLine();

        System.out.println("Agora digite o número da sua conta: ");
        Numero = input.nextInt();

        System.out.println("Por fim digite o seu Saldo por favor: ");
        Saldo = input.nextDouble();

        System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em noso banco, sua agência é " + Agencia + ", conta "+ Numero + " e seu saldo é: " + Saldo + " já esta dísponivel para saque.");

    }
}