import java.util.Scanner;

public class uri1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        double x = 0;
        int i = 0;
        int soma = 0;
        
        while (i < 6) {
            x = sc.nextDouble();
            if (x == 0)
                x = sc.nextDouble();
            else {
                i++;
                if (x > 0)
                    soma++;
            }
        }

        System.out.println(soma + " valores positivos");


        sc.close();
    }
    
}
