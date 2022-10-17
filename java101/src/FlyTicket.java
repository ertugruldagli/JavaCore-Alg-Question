import java.util.Scanner;

public class FlyTicket {
    public static void main(String[] args) {
        int line, old;
        String type;
        double yasSell, normalPrice,sell;

        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        line=inp.nextInt();
        System.out.print("Yas giriniz: ");
        old=inp.nextInt();

        normalPrice=line*0.10;
        System.out.println("Mesafeli fiyat: " + normalPrice + " TL ");

        if(old<=12){
            yasSell=normalPrice*0.50;
            System.out.println("Yas indirimi fiyat: "+yasSell + " TL ");
            sell=normalPrice-yasSell;
            System.out.println(" indirimli fiyat: "+sell + " TL ");
        } else if (old>12 && old<=24) {
            yasSell=normalPrice*0.10;
            System.out.println("Yas indirimi fiyat: "+yasSell + " TL ");
            sell=normalPrice-yasSell;
            System.out.println(" indirimli fiyat: "+sell + " TL ");
        } else if (old>65) {
            yasSell=normalPrice*0.30;
            System.out.println("Yas indirimi fiyat: "+yasSell + " TL ");
            sell=normalPrice-yasSell;
            System.out.println(" indirimli fiyat: "+sell + " TL ");
        }else{
            System.out.println("fiyat: "+normalPrice + " TL ");
        }

    }

}
