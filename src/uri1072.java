import java.util.Scanner;

public class uri1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int intervalo = 0;
        int foraIntervalo = 0;
        
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20)
                intervalo++;
            else
                foraIntervalo++;
        }

        System.out.println(intervalo +  " in");
        System.out.println(foraIntervalo + " out");



        sc.close();
    }
    
}
