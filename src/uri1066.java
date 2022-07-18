import java.util.Scanner;

public class uri1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = 0;
        int i = 0;
        int pos = 0;
        int neg = 0;
        int par = 0;
        int impar = 0;
        
        while (i < 5) {
            x = sc.nextDouble();
            i++;
                if (x > 0 )
                    pos++;
                else if (x < 0)
                    neg++;
                if (Math.abs(x) % 2 == 0)
                    par++;
                else
                    impar ++;
            }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

        sc.close();
    }
    
}
