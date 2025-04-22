public class atividadewhile4 {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int contador = 0;

        System.out.println("Os 10 primeiros números da sequência de Fibonacci:");

        while (contador < 10) {
            if (contador == 0) {
                System.out.print(primeiro);
            } else if (contador == 1) {
                System.out.print(", " + segundo);
            } else {
                int proximo = primeiro + segundo;
                System.out.print(", " + proximo);
                primeiro = segundo;
                segundo = proximo;
            }

            contador++;
        }
        
        System.out.println(); 
    }
}
        
   