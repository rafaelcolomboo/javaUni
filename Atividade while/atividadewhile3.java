
import java.util.Scanner;

public class atividadewhile3 {
    public static void main(String[] args) {
        String senhaCorreta = "1234";
        String senhaDigitada = ""; 
        Scanner scanner = new Scanner ( System.in);

           while (!senhaDigitada.equals(senhaCorreta)) { 
            System.out.println("Digite sua senha: ");
            senhaDigitada = scanner.nextLine();
          
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        } 
         System.out.println("Acesso concedido");
         scanner.close();
    }
}
