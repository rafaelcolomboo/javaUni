public class atividadevetores1 {
    public static void main(String[] args)  {
        int[] numeros = {2, 6, 10, 16, 22, 5, 7, 33, 9, 45};
        int soma = 0; 
        for (int numero : numeros  ){
            soma = soma + numero;
         
        }
        System.out.println("A soma dos números é: " + soma );
    }
}
