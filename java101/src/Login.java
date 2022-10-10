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
            System.out.println("Hatali Sifre!!!  daha sonra tekrar deneyiniz!");
            System.out.println("Sifreyi sifirlamak ister misiniz? e/h");

            String e= input.nextLine();
            if (e=="e"){
                System.out.println();
            }else{
                System.out.println("sifirlama islemi basarisiz..");
            }

        }

    }
}
