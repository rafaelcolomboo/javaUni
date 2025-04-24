import java.util.Random;
import java.util.Scanner;

public class atividadedowhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(20) + 1; 
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 20!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("O número digitado é maior que o número secreto.");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número digitado é menor que o número secreto.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativa(s)!");
            }

        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
