import java.util.Scanner;

public class FlyTicket {
    public static void main(String[] args) {
        int line, old;
        int selected;
        double yasSell, normalPrice;

        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        line=inp.nextInt();
        System.out.print("Yas giriniz: ");
        old=inp.nextInt();

        normalPrice=line*0.10;

        System.out.println("Tek Yon=> 1 , Cift Yon=> 2     Secim Yapiniz!!!!");
        selected=inp.nextInt();

      if(selected==2){
            if(old<=12){
                yasSell=normalPrice*0.50;
                normalPrice-=yasSell;

            } else if (old>12 && old<=24) {
                yasSell=normalPrice*0.10;
                normalPrice-=yasSell;


            } else if (old>65) {
                yasSell=normalPrice*0.30;
                normalPrice-=yasSell;

            }else{
                System.out.println("fiyat: "+normalPrice + " TL ");
            }

            double gd= normalPrice*0.20;
            double total= (normalPrice-gd)*2;
            System.out.println("Toplam tutar: " + total + " Tl ");

        }


    }

}
