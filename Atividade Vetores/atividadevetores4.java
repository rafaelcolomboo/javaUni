
import java.util.Scanner;

public class atividadevetores4 {
        public static void main(String[] args) {
            int[] vetorInverso = new int[8];
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < vetorInverso.length; i++) {
                System.out.println("Digite um número: ");
                vetorInverso[i] = sc.nextInt(); 
            }
            System.out.println("Vetor original:");
            for (int i = 0; i < vetorInverso.length; i++) {
            System.out.print(vetorInverso[i] + " ");
             }

            System.out.println("\n\nVetor invertido:");
            for (int i = vetorInverso.length - 1; i >= 0; i--) {
            System.out.print(vetorInverso[i] + " ");
            }
        }

}
