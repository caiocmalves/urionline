import java.util.Scanner;

public class uri1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;
        int a = 0;
        int b = 0;
        if (x > y) {
            a = y;
            b = x;
        }
        else {
            a = x;
            b = y;
        }
        
        for (int i = a; i <= b; i++) {
            if (i % 13 != 0)
                soma += i;            
        }
        System.out.println(soma);

        sc.close();
    }
}
