import java.util.Scanner;

public class uri1009 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double montante = sc.nextDouble();
        double salario = salarioFixo + montante * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", salario);

        sc.close();
    }
    
}
