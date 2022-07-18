import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int m = (a + b + Math.abs(a - b)) / 2;
        int mm = (m + c + Math.abs(m - c)) / 2;

        System.out.println(mm + " eh o maior");

        sc.close();
    }    
}
