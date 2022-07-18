import java.util.Scanner;

public class uri1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int b = 0;
        int c = 0;

      

        for (int i = 1; i <= n; i++) {
            b = i * i;
            c = i * i * i;
            System.out.printf("%d %d %d%n", i, b, c);
            
            System.err.printf("%d %d %d%n", i, b + 1, c + 1);
            
        }

        sc.close();
    }
    
}