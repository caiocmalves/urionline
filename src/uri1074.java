import java.util.Scanner;

public class uri1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n > 10000) {
            n = sc.nextInt();
        }
        int x = 0;
        
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x % 2 == 0 && x > 0)
                System.out.println("EVEN POSITIVE");
            else if (x % 2 != 0 && x < 0)
                System.out.println("ODD NEGATIVE");
            else if (x % 2 != 0)
                System.out.println("ODD POSITIVE");
            else if (x % 2 == 0 && x < 0)
                System.out.println("EVEN NEGATIVE");
            else
                System.out.println("NULL");
            }

        sc.close();
    }
    
}
