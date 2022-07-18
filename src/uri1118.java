import java.util.Scanner;

public class uri1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int novoDo = 0;

        do{
            int valores = 0;
            double media = 0;
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
            System.out.println("novo calculo (1-sim 2-nao)");
            novoDo = sc.nextInt();
            while (novoDo < 1 || novoDo > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                novoDo = sc.nextInt();
            }

        } while (novoDo == 1);

            sc.close();
        }
    
}
