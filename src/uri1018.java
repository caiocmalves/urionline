import java.util.Scanner;

public class uri1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int cem = valor / 100;
        int rest1 = valor % 100;
        int cinquenta = rest1 / 50;
        int rest2 = rest1 % 50;
        int vinte = rest2 / 20;
        int rest3 = rest2 % 20;
        int dez = rest3 / 10;
        int rest4 = rest3 % 10;
        int cinco = rest4 / 5;
        int rest5 = rest4 % 5;
        int dois = rest5 / 2;
        int rest6 = rest5 % 2;
        int um = rest6 / 1;

        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

        sc.close();
    }
    
}
