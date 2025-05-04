
import java.util.Scanner;

public class atividadevetores2 {
    public static void main(String[] args) {
        int[] numeros = new int [15];
        int maior = numeros[0];
        int indice = 0;
        Scanner sc = new Scanner(System.in);
        
      for(int i= 0; i< numeros.length; i++) { 
        System.out.println("Digite um número inteiro: ");
        numeros[i] = sc.nextInt(); 
        }
        
        for(int i = 1; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
                indice = i;
            }
        }
        System.out.println("O maior valor é " + maior + " e está na posição  " + indice + ".");
    }
        
     }

