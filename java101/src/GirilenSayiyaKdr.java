import java.util.Scanner;

public class GirilenSayiyaKdr {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("bir sayi giriniz: ");
        int s=inp.nextInt();
        int sayac=0;
        int toplam=0;
        double ort=0;
        int sayilar=0;

        while(sayac<s){
            sayac++;
            if(sayac%3==0 && sayac%4==0){
                toplam+=sayac;
                sayilar++;
                ort=toplam/sayilar;
            }
        }
        System.out.println(ort);

    }
}
