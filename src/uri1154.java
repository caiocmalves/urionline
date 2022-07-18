import java.util.Scanner;

public class uri1154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        int quantidade = 0;
        int sair = 0;
        do{
            int idade = scanner.nextInt();
            if (idade > 0){
                quantidade += 1;
                media += idade;
            }
            else 
                sair += 1;
        } while(sair < 1);
        media /= quantidade;
        System.out.printf("%.2f%n", media);

        scanner.close();
    }
}
