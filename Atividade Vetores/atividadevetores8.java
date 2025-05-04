
import java.util.Scanner;

public class atividadevetores8 {
    public static void main(String[] args) {
        int [] vetorA = new int [5];
        int [] vetorB = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < vetorA.length; i++) {
           vetorA [i] = sc.nextInt(); 
        }
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < vetorB.length; i++) {
           vetorB [i] = sc.nextInt(); 
        }
    
        int [] vetorC = new int [10];
    
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];       
            vetorC[i + 5] = vetorB[i];   
        }

        
        System.out.println("Vetor C (união de A e B):");
        for (int num : vetorC) {
            System.out.print(num + " ");
        }
    
    
    
    
    
    }
}
