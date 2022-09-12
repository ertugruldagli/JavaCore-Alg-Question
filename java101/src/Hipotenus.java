import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        double a,b,t;

        Scanner scn = new Scanner(System.in);
        System.out.println("1. kenari gir: ");
        a=scn.nextDouble();
        System.out.println("2. kenari gir: ");
        b=scn.nextDouble();

        t= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(t);






    }
}
