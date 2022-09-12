import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        double a,b,c,u,alan;

        Scanner scn = new Scanner(System.in);

        System.out.println("1. kenari gir: ");
        a=scn.nextDouble();
        System.out.println("2. kenari gir: ");
        b=scn.nextDouble();
        System.out.println("3. kenari gir: ");
        c=scn.nextDouble();

        u=(a+b+c)/2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(alan);






    }
}
