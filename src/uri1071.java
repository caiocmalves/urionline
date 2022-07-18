import java.util.Scanner;

public class uri1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int inicio = 0;
        int fim = 0;
        int soma = 0;

        if (a > b){
            inicio = b;
            fim = a;
        }
        else{
            inicio = a;
            fim = b;
        }
        
        for (int i = inicio + 1; i < fim; i++) {
            if(i % 2 != 0)
                soma += i;
        }
        System.out.println(soma);




        sc.close();
    
    }
}