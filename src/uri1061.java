import java.util.Scanner;

public class uri1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Dia ");
        int diaInicio = sc.nextInt();
        int horaInicio = sc.nextInt();
        int minInicio = sc.nextInt();
        int secInicio = sc.nextInt();
        int inicio = (diaInicio * 24 * 60 * 60) + (horaInicio * 60 * 60) + (minInicio * 60) + secInicio;

        System.out.print("Dia ");
        int diaFim = sc.nextInt();
        int horaFim = sc.nextInt();
        int minFim = sc.nextInt();
        int secFim = sc.nextInt();
        int fim = (diaFim * 24 * 60 * 60) + (horaFim * 60 * 60) + (minFim * 60) + secFim;

        int duracao = fim - inicio;
        int duracaoDia = duracao / (24 * 60 * 60);
        int resto1 = duracao % (24 * 60 * 60);
        int duracaoHora = resto1 / (60 * 60);
        int resto2 = resto1 % (60 * 60);
        int duracaoMin = resto2 / 60;
        int duracaoSec = resto2 % 60;

        System.out.println(duracaoDia + " dia(s)");
		System.out.println(duracaoHora + " hora(s)");
		System.out.println(duracaoMin + " minuto(s)");
		System.out.println(duracaoSec + " segundo(s)");

        sc.close();
    
    }
    
}
