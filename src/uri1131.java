import java.util.Scanner;

public class uri1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int novoGrenal = 0;
        int winInter = 0;
        int winGremio = 0;
        int empate = 0;
        int quantidade= 0;
            
        do {
            int inter = sc.nextInt();
            int gremio = sc.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = sc.nextInt();
            if (inter > gremio)
                winInter ++;
            else if (gremio > inter)
                winGremio ++;
            else
                empate ++;

            quantidade ++;
        } while (novoGrenal == 1);
        
        System.out.println(quantidade + " grenais");
        System.out.println("Inter:" + winInter);
        System.out.println("Gremio:" + winGremio);
        System.out.println("Empates:" + empate);
        if (winInter > winGremio)
            System.out.println("Inter venceu mais");
        else if (winInter < winGremio)
            System.out.println("Gremio venceu mais");
        else
            System.out.println("Nao houve vencedor");

        sc.close();
    }
    
}
