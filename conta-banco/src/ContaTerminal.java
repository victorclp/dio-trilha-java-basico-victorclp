import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner valores = new Scanner(System.in);

    int Numero;
    String NomeCliente, Agencia, Saldo;
    Double SaldoAnt;


    System.out.println(" === Novo Banco do Povo ===");
    System.out.println("");

    System.out.println("Por favor digite seu nome: ");
    NomeCliente = valores.nextLine();
    System.out.println("");

    System.out.println("Por favor " +NomeCliente+ ", digite o número da Agência!");
    Agencia = valores.nextLine();
    System.out.println("");

    System.out.println(NomeCliente+", agora por favor digite sua conta:");
    Numero = valores.nextInt();
    System.out.println("");

    System.out.println("Quanto de saldo deseja depositar?");
    SaldoAnt = valores.nextDouble();
    Saldo = String.format("%.2f", SaldoAnt);

    System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo R$ "+Saldo+" já está disponível para saque.");
 
    }
}
