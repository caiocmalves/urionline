import java.util.Scanner;

public class uri1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double first = 0;
        double sec = 0;
        double third = 0;

        if (b > a && b > c && c > a ) {
            first = b;
            sec = c;
            third = a;
        }
        else if (b > a && b > c && c < a ) {
            first = b;
            sec = a;
            third = c;
        }
        else if (c > a && c > b && b > a){
            first = c;
            sec = b;
            third = a;
        }
        else if (c > a && c > b && b < a){
            first = c;
            sec = a;
            third = b;
        }
        else if (a > b && a > c && b < c){
            first = a;
            sec = c;
            third = b;
        }
        else if (a > b && a > c && b > c){
            first = a;
            sec = b;
            third = c;
        }
        else if (a == b && a > c){
            first = a;
            sec = b;
            third = c;
        }
         else if (a == b && a < c){
            first = c;
            sec = a;
            third = b;
        }
        else if (b == c && c > a){
            first = b;
            sec = c;
            third = a;
        }
        else if (b == c && c < a){
            first = a;
            sec = b;
            third = c;
        }
        else if (a == b && a == c){
            first = a;
            sec = b;
            third = c;
        }
        else if (a == c && c > b){
            first = a;
            sec = c;
            third = b;
        }
        else if (a == c && c < b){
            first = b;
            sec = a;
            third = c;
        }

        if (first >= (sec+third)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (Math.pow(first, 2) == (Math.pow(sec, 2) + Math.pow(third, 2))) {
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (Math.pow(first, 2) > (Math.pow(sec, 2) + Math.pow(third, 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if (Math.pow(first, 2) < (Math.pow(sec, 2) + Math.pow(third, 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        
        
        if (first == sec && sec == third) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if (first == sec || first == third || sec == third) {
            System.out.println("TRIANGULO ISOSCELES");
        }
        
        sc.close();

    }
}
