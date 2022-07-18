import java.util.Scanner;

public class uri1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 1 || n > 1000) {
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println(i);            
        }

        sc.close();
    }
    
}
