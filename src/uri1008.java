import java.util.Scanner;

public class uri1008 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double horaSalario = sc.nextDouble();

        double salario = horasTrabalhadas * horaSalario;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        

        sc.close();
    }
    
}
