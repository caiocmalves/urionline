import java.util.Scanner;

public class uri1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario = sc.nextDouble();
        double valorCobrado = salario - 2000.0;

        if (salario < 2000.0)
            System.out.println("Isento");
        else if (salario > 2000.0 && salario <= 3000.0 ) {
            valorCobrado *= 0.08;
            System.out.printf("R$ %.2f%n", valorCobrado);
        }
        else if (salario > 3000.0 && salario <= 4500.0) {
            valorCobrado = (valorCobrado - 1000.0) * 0.18 + 80.0;
            System.out.printf("R$ %.2f%n", valorCobrado);
        }
        else {
            valorCobrado = (valorCobrado - 2500) * 0.28 + 350.0;
            System.out.printf("R$ %.2f%n", valorCobrado);
        }


        sc.close();
    }
    
}
