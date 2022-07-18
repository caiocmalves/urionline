import java.util.Scanner;

public class uri1159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();

        while (x != 0) {
            if (x % 2 != 0) {
                x += 1;
            }
            int soma = 5 * x + 20;
            System.out.println(soma);
            x = scanner.nextInt();
        }

        scanner.close();
    }
    
}
