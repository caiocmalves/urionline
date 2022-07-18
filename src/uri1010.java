import java.util.Scanner;

public class uri1010 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int qte1, qte2;
        double preco1, preco2, total;

        //cod = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        //codd = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();
        
        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


        sc.close();
        
    }
    
}
