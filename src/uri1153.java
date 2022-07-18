import java.util.Scanner;

public class uri1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat = 0;
        while (n < 0 || n > 13) {
            n = sc.nextInt();    
        }
        fat = n;
        for (int i = 1; i < n; i++) {
            fat *= (n-i);
        }
        System.out.println(fat);
        sc.close();

    }
    
}
