import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String sifre=new String("1234");
        String pass,e;


        Scanner input=new Scanner (System.in);
        System.out.println("Sifreyi girininz: ");
        pass= input.nextLine();

        if(pass.equals(sifre)){
            System.out.println("Sifre dogru giris yaptiniz.");

        }else{
            System.out.println("Hatali Sifre!!!");
            System.out.println("Sifreyi sifirlamak ister misiniz? e/h");
            e= input.nextLine();

            if (e.equals("e")){
                System.out.println("Yeni Sifreyi giriniz: ");
                 pass= input.nextLine();
                if (pass.equals(sifre)){
                    System.out.println("Yeni Sifre Eski Sifre ile ayni olamaz!! ");
                }else{
                    System.out.println("Yeni sifre olusturuldu.");
                }

            }else{
                System.out.println("sifirlama islemi basarisiz..");
            }

        }

    }
}
