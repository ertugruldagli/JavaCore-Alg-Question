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

        System.out.println("Yolculuk tipini seciniz: Tek Yon=> 1 and Cift Yon=> 2");
        selected=inp.nextInt();

        if((selected==1 || selected==2) && line>=0){
                if(old<=12){
                    yasSell=normalPrice*0.50;
                    normalPrice-=yasSell;

                } else if (old>12 && old<=24) {
                    yasSell=normalPrice*0.10;
                    normalPrice-=yasSell;

                } else if (old>65) {
                    yasSell=normalPrice*0.30;
                    normalPrice-=yasSell;
                }

            if(selected==2) {
                double gd = normalPrice * 0.20;
                double total = (normalPrice - gd) * 2;
                System.out.println("Toplam tutar: " + total + " Tl ");
            }else {
                System.out.println("toplam Tutar: "+normalPrice + " TL ");
            }

        }else{
            System.out.println("Hatali Veri Girdiniz!");
        }




    }

}
