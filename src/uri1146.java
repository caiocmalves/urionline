import java.util.Scanner;

public class uri1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) {
                
            for (int i = 1; i <= x; i++) {
                System.out.print(i);
                if(i % x == 0)
                    System.out.println();
                else
                    System.out.print(" ");
            }
            x = sc.nextInt();
        }

        sc.close();


    }
    
}
