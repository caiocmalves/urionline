import java.util.Scanner;

public class uri1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int encerra = 0;
        do{
            int n = sc.nextInt();
            if (n > 0 && n < 5){
                switch (n) {
                    case 1:
                        alcool += 1;
                        break;
                    case 2:
                        gasolina += 1;
                        break;
                    case 3:
                        diesel += 1;
                        break;
                    case 4:
                        encerra +=1;
                        break;
                }
            }
            else
                encerra += 0;
        } while (encerra < 1);


        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
    
}