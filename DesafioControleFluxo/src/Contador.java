import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner valores = new Scanner(System.in);

        int numero1, numero2;

        try {

            System.out.println("Por favor digite um o primeiro número: ");
            numero1 = valores.nextInt();

            System.out.println("Agora digite o segundo número: ");
            numero2 = valores.nextInt();

            ParametrosInvalidosException.validarEntrada(numero1, numero2);

            contar(numero1, numero2);

        } catch (ParametrosInvalidosException e) {

            System.out.println("Error " + e.getMessage());
        }

    }

    static void contar(int n1, int n2) {
        for (int cont = 0; cont != 2; cont++) {

            System.out.println("Imprimindo o número " + (cont + 1));

        }

    }
}
