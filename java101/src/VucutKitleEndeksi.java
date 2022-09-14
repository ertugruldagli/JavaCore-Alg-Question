import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double h,w, vke;

        Scanner girdi=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu giriniz: ");
        h= girdi.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz: ");
        w= girdi.nextDouble();

        vke=w/Math.pow(h,2);

        System.out.println("Vucut kitle Endeksiniz: " + vke);
    }

}
