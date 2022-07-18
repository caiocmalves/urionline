import java.util.Scanner;

public class uri1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float valor = 0;
        float media = 0;

        for (int i = 0; i < n; i++) {
        media = 0;
            for (int j = 0; j < 3 ; j++) {
                valor = sc.nextFloat();
                if (j == 0)
                    media += valor * 2;
                else if (j == 1)
                    media += valor * 3;
                else
                    media += valor * 5;
            }
            media /= 10;
            System.out.printf("%.1f%n", media);
        }


        sc.close();
    }
}
