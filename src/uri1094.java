import java.util.Scanner;

public class uri1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int qtdCobaia = 0;
        String tipoCobaia = "";
        int total = 0;
        int totalCoelho = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        double percentCoelho = 0;
        double percentRatos = 0;
        double percentSapos = 0;
        int cobaiaCorreto = 0;
        
        for(int i = 0; i < n; i++){
            qtdCobaia = sc.nextInt();
            while (qtdCobaia < 1 || qtdCobaia > 15) {
                qtdCobaia = sc.nextInt();
            }
            
            do {
                tipoCobaia = sc.next();
                if (tipoCobaia.equals("R") || tipoCobaia.equals("S") || tipoCobaia.equals("C")){
                    cobaiaCorreto ++;
                }        
            } while (cobaiaCorreto == 0);
            
            total += qtdCobaia;

            if (tipoCobaia.equals("R"))
                    totalRatos += qtdCobaia;
            else if (tipoCobaia.equals("S"))
                    totalSapos += qtdCobaia;
            else if (tipoCobaia.equals("C"))
                    totalCoelho += qtdCobaia;
        }

        percentCoelho = (double) totalCoelho / total * 100;
        percentSapos = (double) totalSapos / total * 100;
        percentRatos = (double) totalRatos / total * 100;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelho);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentSapos);


        sc.close();
    }
}
    

