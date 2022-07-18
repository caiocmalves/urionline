import java.util.Scanner;

public class uri1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        double resultado = 0;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            resultado = 0;
            if (b == 0)
                System.out.println("divisao impossivel");
            else {
                resultado = (double) a / b;
                System.out.println(resultado);    
            }
        }


        sc.close();
    }
}
