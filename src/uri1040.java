import java.util.Scanner;

public class uri1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        float exame, novaMedia;
        float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            exame = sc.nextFloat();
            System.out.println("Nota do exame: " + exame);
            novaMedia = (media + exame) / 2;
            if (novaMedia > 5.0){
                System.out.println("Aluno aprovado.");
            }
            else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + novaMedia);
        }

        sc.close();
    }
    
}
