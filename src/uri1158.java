import java.util.Scanner;

public class uri1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0;
        int y = 0;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            soma = 0;
            if (x % 2 != 0){
                soma = x;
                for (int j = 1; j < y; j ++) {
                    soma = soma + (x + (2 * j));           
                }
            }
            else{
                soma = x+1;
                for (int j = 1; j < y; j++) {
                    soma = soma + ((x+1) + (2 * j));    
                }
            }
            System.out.println(soma);
            
        }
        sc.close();
    }
    
}