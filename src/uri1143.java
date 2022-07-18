import java.util.Scanner;

public class uri1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            
            a = i; 
            b = i * i;
            c = i * i * i;
            System.out.printf("%d %d %d%n", a, b, c);
        }


        sc.close();
    }   
}
