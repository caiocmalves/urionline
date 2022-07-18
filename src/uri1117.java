import java.util.Scanner;

public class uri1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0;
        int valores = 0;


        do {
            double a = sc.nextDouble();
            if (a < 0 || a > 10)
                System.out.println("nota invalida");
            else{
                valores ++;
                media += a;
            }    
        } while (valores < 1);

        do {
            double b = sc.nextDouble();
            if (b < 0 || b > 10)
                System.out.println("nota invalida");
            else{
                valores ++;
                media += b;
            }    
        } while (valores < 2);

        media /= 2;
        System.out.printf("media = %.2f%n", media);


        sc.close();
    }
    
}
