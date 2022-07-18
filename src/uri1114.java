import java.util.Scanner;

public class uri1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int x = 0;

        while (x != senha) {
            x = sc.nextInt();
            if (x != senha)
                System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
    
}
