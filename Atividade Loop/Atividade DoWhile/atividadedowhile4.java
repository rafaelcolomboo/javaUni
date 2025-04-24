import java.util.Scanner;

public class atividadedowhile4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaNotas = 0;
        int totalNotas = 0;
        int nota;
        int opcao = 1;
        double media;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
             nota = scanner.nextInt();

            if (nota >= 0 && nota <= 10) {
                somaNotas = somaNotas + nota;
                totalNotas++;
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                continue;
            }

            System.out.print("Deseja inserir outra nota? (1 - Sim / 2 - Não): ");
            opcao = scanner.nextInt();

        } while (opcao == 1);

        if (totalNotas > 0) {
             media = (double) somaNotas / totalNotas;
            System.out.printf("Média das notas inseridas: %.2f", media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}
