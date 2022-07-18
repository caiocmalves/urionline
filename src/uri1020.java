import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ano = n / 365;
        int sobra = n % 365;
        int mes = sobra / 30;
        int sobraMes = sobra % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(sobraMes + " dia(s)");

        sc.close();

    }
    
}
