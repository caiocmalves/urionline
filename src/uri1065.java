import java.util.Scanner;

public class uri1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int i = 0;
        int pares = 0;

        
        while (i < 5) {
            x = sc.nextInt();
            i++;
            if (Math.abs(x) % 2 == 0){
                pares++;
            }
        }
        System.out.println(pares + " valores pares");

        sc.close();
    }
    
}
