import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {

        Random rand = new Random();
        int number=rand.nextInt(100);

        Scanner inp=new Scanner(System.in);
        int sayi;
        int hak=0;


        while(hak<5){
            System.out.print("Sayi Tahmin Ediniz: ");
            sayi=inp.nextInt();

            if(number==sayi){
                System.out.print("TEBRIKLER DOGRU TAHMINN.....");
                break;
            }else{
                System.out.println("Tahmininiz yanlistir.");
            }
            hak++;
            System.out.println("Kalan hakkiniz: " +(5-hak));

        }
    }
}
