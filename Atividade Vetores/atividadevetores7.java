
import java.util.Scanner;

public class atividadevetores7 {
    public static void main(String[] args) {
        int [] vetor = new int[15];
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 15 números: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
       
        System.out.println("Digite um número: ");
        int numeroDigitado = sc.nextInt();

        for (int num : vetor){
            if (num == numeroDigitado) {
                contador++;
                
            }
    
        }
        System.out.println("O número digitado repetiu " + contador + " vezes.");
    }
}
