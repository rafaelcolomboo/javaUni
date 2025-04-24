import java.util.Scanner;

public class atividade2for {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
         numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Insira um número inteiro positivo.");
        } else {
            long fatorial = 1;

            System.out.print(numero + "! = ");
            for (int i = numero; i >= 1; i--) {
                fatorial = fatorial * i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" x ");
                }
            }

            System.out.println(" = " + fatorial);
        }

        scanner.close();
    }
}
