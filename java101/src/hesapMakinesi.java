import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,secim;

        Scanner inp=new Scanner(System.in);
        System.out.print("birinci sayi gir: ");
        n1= inp.nextInt();
        System.out.print("ikinci sayi gir: ");
        n2= inp.nextInt();
        System.out.println("Secim yapiniz:");
        secim= inp.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplami: " + (n1+n2));break;
            case 2:
                System.out.println("Cikarma: " + (n1-n2));break;
            case 3:
                System.out.println("Carpma: " + (n1*n2));break;
            case 4:
                if(n2!=0){
                    System.out.println("Bolme: " + (n1/n2));
                }else{
                    System.out.println("payda sıfır olamaz");
                }
               break;
            default:
                System.out.println("Yanlis deger girdiniz..");
        }

    }
}
