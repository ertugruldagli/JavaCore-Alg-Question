import java.util.Scanner;
public class hipo {
    public static void main(String[] args) {
        double a,b,c;

        Scanner scn = new Scanner(System.in);
        System.out.println("1. kenari gir: ");
        a=scn.nextDouble();
        System.out.println("2. kenari gir: ");
        b=scn.nextDouble();
        //double t=Math.pow(a,2)+Math.pow(b,2);
        c=Math.sqrt((a*a)+(b*b));

        System.out.Println("sonuc:"+c);



    }
}
