import java.util.Scanner;

public class uri1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hrInicial = sc.nextInt();
        int minInicial = sc.nextInt();
        int hrFinal = sc.nextInt();
        int minFinal = sc.nextInt();
        
        int duracaoInicial = hrInicial * 60 + minInicial;
        int duracaoFinal = hrFinal * 60 + minFinal;
        
        int duracao;
       
        if (duracaoInicial < duracaoFinal) {
            duracao = duracaoFinal - duracaoInicial;
        }
        else {
            duracao = (24 * 60 - duracaoInicial) + duracaoFinal;
        }

        int duracaoHoras = duracao / 60;
        int duracaoMin = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMin);

        sc.close();
    }
    
}
