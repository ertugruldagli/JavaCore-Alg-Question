import java.util.Scanner;

public class KdvTutariHesap {
    public static void main(String[] args) {
        double tutar, kdv, kdvTutar, kdvli;
        boolean flag;

        Scanner inp=new Scanner(System.in);

        System.out.print("Tutar Giriniz:");
        tutar=inp.nextDouble();

        flag=tutar<=1000;
        kdv=flag? 0.18:0.08;

        kdvTutar=kdv*tutar;
        System.out.println("Kdv Tutari: " + kdvTutar);

        kdvli=kdvTutar+tutar;
        System.out.println("Kdvli fiyat: " + kdvli);

    }
}
