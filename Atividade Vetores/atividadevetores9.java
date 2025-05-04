
import java.util.Scanner;

public class atividadevetores9 {
    public static void main(String[] args) {
        int[] vetorA = new int[6];
        int[] vetorB = new int[6];
        int[] vetorComum = new int[6];
        int contador = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 6 elementos para o vetor A: ");
        for(int i= 0; i < vetorA.length; i++){
        vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite 6 elementos para o vetor B: ");
        for(int j= 0; j < vetorB.length; j++){
        vetorB[j] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (vetorA[i] == vetorB[j]) {
                    boolean jaExiste = false;
                    
                    for (int k = 0; k < contador; k++) {
                        if (vetorComum[k] == vetorA[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        vetorComum[contador] = vetorA[i];
                        contador++;
                    }
                }
            }
        }

        
        System.out.println("Elementos comuns:");
        for (int i = 0; i < contador; i++) {
            System.out.print(vetorComum[i] + " ");
        }


    }
}
