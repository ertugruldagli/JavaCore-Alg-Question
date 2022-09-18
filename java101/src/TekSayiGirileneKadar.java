import java.util.Scanner;
public class TekSayiGirileneKadar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam=0;
        while(true){
            System.out.print("Bir sayi giriniz: ");
            int s= input.nextInt();
            if(s%4==0 || s%2==0){
                System.out.println("Sayi cift veya 4'un katidir");
                toplam+=s;
            }
            else {
                System.out.println("Tek sayi girilmistir!!");
                System.out.println("Girilen sayilarin toplami:  " + toplam);
                break;
            }
        }
    }
}
