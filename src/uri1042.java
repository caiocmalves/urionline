import java.util.Scanner;

public class uri1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x1, x2, x3;

        System.out.println();

        if (a > b && a > c && b > c){
            x1 = a;
            x2 = b;
            x3 = c;
            System.out.println(x3);
            System.out.println(x2);
            System.out.println(x1);
        }
        else if(a > b && a > c && c > b){
            x1 = a;
            x2 = c;
            x3 = b;    
            System.out.println(x3);
            System.out.println(x2);
            System.out.println(x1);
        }
        else if(b > c && a > c) {
            x1 = b;
            x2 = a;
            x3 = c;
            System.out.println(x3);
            System.out.println(x2);
            System.out.println(x1);
        }
        else if(b > c && a < c){
            x1 = b;
            x2 = c;
            x3 = a;
            System.out.println(x3);
            System.out.println(x2);
            System.out.println(x1);
        }
        else if(b > a){
            x1 = c;
            x2 = b;
            x3 = a;
            System.out.println(x3);
            System.out.println(x2);
            System.out.println(x1);
        }
        else{
            x1 = c;
            x2 = a;
            x3 = b;    
            System.out.println(x3);
            System.out.println(x2);
            System.out.println(x1);
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}