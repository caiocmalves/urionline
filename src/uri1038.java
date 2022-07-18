import java.util.Scanner;

public class uri1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int item = sc.nextInt();
        int qtd = sc.nextInt();
        double valor;

        if (item ==1 ){
            valor = 4.0 * qtd;
            System.out.printf("Total: R$ %.2f%n", valor);
        }
        else if(item ==2 ){
            valor = 4.50 * qtd;
            System.out.printf("Total: R$ %.2f%n", valor);
        }
        else if(item ==3 ){
            valor = 5.00 * qtd;
            System.out.printf("Total: R$ %.2f%n", valor);
        }
        else if(item ==4 ){
            valor = 2.00 * qtd;
            System.out.printf("Total: R$ %.2f%n", valor);
        }
        else if(item == 5 ){
            valor = 1.50 * qtd;
            System.out.printf("Total: R$ %.2f%n", valor);
        }

        sc.close();
    }
}
