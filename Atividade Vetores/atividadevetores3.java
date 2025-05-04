

public class atividadevetores3 {
    public static void main(String[] args) {
        int []numeros = {2,4,5,2,4,6,8,5,10,15,16,25,29,33,1,0,7,88,79,20};
       int totalPares = 0;
       
       for (int i= 0; i < numeros.length; i++){
           if (numeros[i] % 2 == 0 ){
            System.out.print(numeros [i] + "  .");
            totalPares++;
             } 
        }
        System.out.println("\nTotal de números pares: " + totalPares);
    }
}
