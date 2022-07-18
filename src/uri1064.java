import java.util.Scanner;

public class uri1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = 0;
        int i = 0;
        int soma = 0;
        int positivo = 0;
        double media = 0.0;
        
        while (i < 6 && positivo < 1) {
            x = sc.nextDouble();
            i++;
                if (x > 0){
                    soma++;
                    media += x;
                }
        }
        media = (double) media / soma;

        System.out.println(soma + " valores positivos");
        System.out.printf("%.1f%n", media);

        sc.close();
    }
    
}
