import java.util.Scanner;

public class uri1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nHoras = n / 3600;
        int restoHoras = n % 3600;
        int nMinutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;
        
        System.out.printf("%d:%d:%d%n", nHoras, nMinutos, restoMinutos);

        sc.close();

        
    }
    
}
