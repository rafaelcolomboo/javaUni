
import java.util.Scanner;

public class atividadevetores10 {
    public static void main(String[] args) {
        int [] vetorA = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 valores inteiros: ");
        for (int i= 0; i < vetorA.length; i++) {
        vetorA[i] = sc.nextInt();    
        }

        for (int i = 0; i < vetorA.length - 1; i++) {
            for (int j = 0; j < vetorA.length - 1 - i; j++) {
                if (vetorA[j] > vetorA[j + 1]) {
                    int temp = vetorA[j];
                    vetorA[j] = vetorA[j + 1];
                    vetorA[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
    }
}
