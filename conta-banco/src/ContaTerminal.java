import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o nome do conta: ");
        String nome = keyboard.nextLine();
        System.out.println("Digite o saldo do conta: ");
        double saldo = Double.parseDouble(keyboard.nextLine());
        System.out.println("Digite a agencia do conta: ");
        String agencia = keyboard.nextLine();
        System.out.println("Digite a numero do conta: ");
        int numero = keyboard.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo "+ saldo +" já está disponível para saque");
        //imbackca
    }
}