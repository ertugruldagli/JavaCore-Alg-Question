import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double a=2.14, e=3.67,  d=1.11, m=0.95, p=5.00;
        double aKg,eKg,dKg,mKg,pKg,total;

        Scanner scn=new Scanner(System.in);
        System.out.println("Armut kac kilo?: ");
        aKg= scn.nextInt();
        System.out.print("Elma kac kilo?: ");
        eKg= scn.nextInt();
        System.out.print("Domates kac kilo?: ");
        dKg= scn.nextInt();
        System.out.print("Muz kac kilo?: ");
        mKg= scn.nextInt();
        System.out.print("Patlican kac kilo?: ");
        pKg= scn.nextInt();

        a*=aKg; e*=eKg; d*=dKg; m*=mKg; p*=pKg;

        total=a+e+d+m+p;
        System.out.println("toplam: " + total);

    }
}
