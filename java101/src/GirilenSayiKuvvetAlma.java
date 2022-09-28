import java.util.Scanner;

public class GirilenSayiKuvvetAlma {
    public static void main(String[] args) {

        int n, sayac=1, i=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        n=input.nextInt();

        while(sayac<=n ){
            System.out.println("dort ussu: "+ sayac);
            sayac*=4;
            if(i<=n){
                System.out.println("bes ussu:---------- "+ i);
                i*=5;
            }
        }
    }
}
