import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String sifre=new String("1234");

        Scanner input=new Scanner (System.in);
        System.out.println("Sifreyi girininz: ");
        String pass= input.nextLine();

        if(pass.equals(sifre)){
            System.out.println("Sifre dogru giris yaptiniz.");
        }else{
            System.out.println("Yanlis girdiniz daha sonra tekrar deneyiniz!");
        }

    }
}
