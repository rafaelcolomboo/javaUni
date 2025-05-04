
import java.util.Scanner;

public class atividadevetores5 {
    public static void main(String[] args) {
        int [] valores = new int[12];
        int somaValores = 0;
        double mediaValores;
        int contadorMaior = 0;
        Scanner sc = new Scanner(System.in);
    
    for (int i = 0; i < valores.length; i++){
        System.out.println("Digite um número: ");
        valores[i] = sc.nextInt();
    }

    for(int valor : valores){
        somaValores = somaValores + valor;
       
    }
   
    mediaValores = somaValores / valores.length; 
    
    for (int numero : valores) {
        if (numero > mediaValores) {
            contadorMaior++;
        }
    
    }
    System.out.println("Media dos numeros: " + mediaValores);
    System.out.println("Quantidade de elementos maiores que a média: " + contadorMaior);
}
}
