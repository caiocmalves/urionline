import java.util.Scanner;

public class uri1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();

        double consumo = x / y;

        System.out.printf("%.3f km/l%n", consumo);

        sc.close();

    }
}
