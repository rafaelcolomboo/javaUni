public class atividade3for {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 3, 7, 9, 1, 4, 6, 10}; 
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
