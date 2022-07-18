import java.util.Scanner;

public class uri1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double litroMedio = 12.0;
        
        double litros = (tempo * velocidade) / litroMedio;

        System.out.printf("%.3f%n", litros); 

        
        sc.close();
    }
    
}
