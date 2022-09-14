import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {

        int r; double pi=3.14, alan, alfa;

        Scanner scn=new Scanner(System.in);
        System.out.println("Yaricap Giriniz: ");
        r= scn.nextInt();

        System.out.println("mao Giriniz: ");
        alfa= scn.nextInt();

        alan= (pi*(r*r)*alfa)/360;


        System.out.println("Alani: " + alan);




    }

}
