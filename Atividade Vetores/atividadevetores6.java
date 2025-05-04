
import java.util.Scanner;

public class atividadevetores6 {
    public static void main(String[] args) {
            int [] vetor = new int[10];
            int valorParaRemover = 0; 
            Scanner sc = new Scanner(System.in);
           
           System.out.println("Digite 10 números:");
            for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
    }

            System.out.println("Remova um elemento do vetor: "  );
            valorParaRemover = sc.nextInt();


            int indexRemover = -1;
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == valorParaRemover) {
                    indexRemover = i;
                    break;
                }
            }
    
           
            if (indexRemover != -1) {
                int[] novoVetor = new int[vetor.length - 1];
                for (int i = 0, j = 0; i < vetor.length; i++) {
                    if (i != indexRemover) {
                        novoVetor[j++] = vetor[i];
                    }
                }
    
                
                System.out.println("Vetor após remover o número " + valorParaRemover + ":");
                for (int num : novoVetor) {
                    System.out.print(num + " ");
                }
            } else {
                System.out.println("Número não encontrado no vetor.");
            }
}
}