import java.util.Scanner;

public class uri1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ossada = sc.next().toLowerCase();
        String tipo = sc.next().toLowerCase();
        String dieta = sc.next().toLowerCase();

        if (ossada.equals("vertebrado") && tipo.equals("ave") && dieta.equals("carnivoro")){
            System.out.println("aguia");
        } 
        else if (ossada.equals("vertebrado") && tipo.equals("ave") && dieta.equals("onivoro")){
            System.out.println("pomba");
        }
        else if (ossada.equals("vertebrado") && tipo.equals("mamifero") && dieta.equals("onivoro")){
            System.out.println("homem");
        }
        else if (ossada.equals("vertebrado") && tipo.equals("mamifero") && dieta.equals("herbivoro")){
            System.out.println("vaca");
        }
        else if (ossada.equals("invertebrado") && tipo.equals("inseto") && dieta.equals("hematofago")){
            System.out.println("pulga");
        }
        else if (ossada.equals("invertebrado") && tipo.equals("inseto") && dieta.equals("herbivoro")){
            System.out.println("lagarta");
        }
        else if (ossada.equals("invertebrado") && tipo.equals("anelideo") && dieta.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if (ossada.equals("invertebrado") && tipo.equals("anelideo") && dieta.equals("onivoro")){
            System.out.println("minhoca");
        }

        sc.close();
    }
}
