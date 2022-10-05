import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n=inp.nextInt();
        double total=0;

        //with for loop
        for(double i=1; i<=n; i++){
            total+= (1/i);
        }
        System.out.println(" for -- Harmonik Seri Toplami: " + total);


        //with while loop
        double sayac=1;
        while(sayac<=n){
            total+= (1/sayac);
            sayac++;
        }
        System.out.println(" While -- Harmonik Seri Toplami: " + total);

    }
}
