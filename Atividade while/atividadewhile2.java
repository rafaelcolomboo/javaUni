
import java.util.Scanner;

public class atividadewhile2 {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        
        
        while (numero >= 0) { 
            System.out.println("Digite um número positivo : " );
            numero = scanner.nextInt();

            if (numero >= 0){
                soma = soma + numero;
            } 
        }
        System.out.println("A soma dos números positivos digitados é: " + soma);
        scanner.close();
        
    }

}
