import java.util.Scanner;

public class dersGecme {
    public static void main(String[] args) {


        int k,m,f,t,mz;
        int toplam=0;
        double ort = 0;

        Scanner input =new Scanner(System.in);

        System.out.print("Kimya Notunu Giriniz:");
        k=input.nextInt();
        System.out.print("Mat Notunu Giriniz:");
        m=input.nextInt();
        System.out.print("Fizik Notunu Giriniz:");
        f=input.nextInt();
        System.out.print("Turkce Notunu Giriniz:");
        t=input.nextInt();
        System.out.print("Muzik Notunu Giriniz:");
        mz=input.nextInt();

        if(k>=0 && k<=100){
            toplam+=k;
            ort=toplam/1;
        }else {
            System.out.print("yanlis deger girdiniz:");
        }
        if(m>=0 && m<=100){
            toplam+=m;
            ort=toplam/2;
        }else {
            System.out.print("yanlis deger girdiniz:");
        }
        if(f>=0 && f<=100){
            toplam+=f;
            ort=toplam/3;
        }else {
            System.out.print("yanlis deger girdiniz:");
        }
        if(t>=0 && t<=100){
            toplam+=t;
            ort=toplam/4;
        }else {
            System.out.print("yanlis deger girdiniz:");
        }if(mz>=0 && mz<=100){
            toplam+=mz;
            ort=toplam/5;
        }else {
            System.out.println("yanlis deger girdiniz: " );
        }

       
        System.out.println("Ortlamanız: "+ort);



    }
}
