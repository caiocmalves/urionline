import java.util.Scanner;

public class uri1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int x = 0;
        int maior = 0;
        int posicao = 0;
        for (int i = 1; i <= 100; i++) {
            x = sc.nextInt();    
            if(x > maior){
                maior = x;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
        


        sc.close();
    }
    
}
