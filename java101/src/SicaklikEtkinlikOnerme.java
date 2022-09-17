import java.util.Scanner;

public class SicaklikEtkinlikOnerme {
    public static void main(String[] args) {
        int s;
        Scanner scn=new Scanner(System.in);
        System.out.println("sicaklik degeri giriniz: ");
        s=scn.nextInt();

        if(s<5) {
            System.out.println("kayak");
        }
        if (s>=5&&s<=15){
                System.out.println("sinema");
        }
        if (s>=10&&s<=25){
                System.out.println("piknik");
        }
        else {
            System.out.println("yüzme");
        }

    }

}
