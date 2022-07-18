import java.util.Scanner;

public class uri1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double cem = valor / 100;
        int notaCem = (int) cem;
        double rest1 = valor % 100;
        double cinquenta = rest1 / 50;
        int notaCinq = (int) cinquenta;
        double rest2 = rest1 % 50;
        double vinte = rest2 / 20;
        int notaVinte = (int) vinte;
        double rest3 = rest2 % 20;
        double dez = rest3 / 10;
        int notaDez = (int) dez;
        double rest4 = rest3 % 10;
        double cinco = rest4 / 5;
        int notaCinco = (int) cinco;
        double rest5 = rest4 % 5;
        double dois = rest5 / 2;
        int notaDois = (int) dois;
        double rest6 = rest5 % 2;
        double um = rest6 / 1;
        int moedaUm = (int) um;
        double rest7 = rest6 % 1;
        double mCinq = rest7 / 0.5;
        int moedaCinquenta = (int) mCinq;
        double rest8 = rest7 % 0.5;
        double mVint = rest8 / 0.25;
        int moedaVint = (int) mVint;
        double rest9 = rest8 % 0.25;
        double mDez = rest9 / 0.1;
        int moedaDez = (int) mDez;
        double rest10 = rest9 % 0.1;
        double mCinco = rest10 / 0.05;
        int moedaCinco = (int) mCinco;
        double rest11 = (rest10 % 0.05) * 100;
        int moedaUmCent = (int) rest11;        



        System.out.println("NOTAS:");
        System.out.println(notaCem + " nota(s) de R$ 100.00");
        System.out.println(notaCinq + " nota(s) de R$ 50.00");
        System.out.println(notaVinte + " nota(s) de R$ 20.00");
        System.out.println(notaDez + " nota(s) de R$ 10.00");
        System.out.println(notaCinco + " nota(s) de R$ 5.00");
        System.out.println(notaDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedaUm + " moeda(s) de R$ 1.00");
        System.out.println(moedaCinquenta + " moeda(s) de R$ 0.50");
        System.out.println(moedaVint + " moeda(s) de R$ 0.25");
        System.out.println(moedaDez + " moeda(s) de R$ 0.10");
        System.out.println(moedaCinco + " moeda(s) de R$ 0.05");
        System.out.println(moedaUmCent + " moeda(s) de R$ 0.01");

        sc.close();
    }
    
}
