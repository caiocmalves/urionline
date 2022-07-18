import java.util.Scanner;

public class uri1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;
        int b = 0;
        int c = 0;
        int cont = 0;

        for (int i = 1; i <= n; i++) {
            
            a = cont + 1;
            b = a + 1;
            c = b + 1;

            System.out.printf("%d %d %d PUM%n", a, b, c);
            cont += 4;
        }
        sc.close();
    }
}
