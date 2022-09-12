import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int m,f,k,t,ta,mu,top;
        double ort;
        boolean flag;
        String gectiMi;

        Scanner input =new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        m=input.nextInt();
        System.out.print("Fizik Notunuz: ");
        f=input.nextInt();
        System.out.print("Kimya Notunuz: ");
        k=input.nextInt();
        System.out.print("Turkce Notunuz: ");
        t=input.nextInt();
        System.out.print("Tarih Notunuz: ");
        ta=input.nextInt();
        System.out.print("Muzik Notunuz: ");
        mu=input.nextInt();

        top=m+f+k+t+ta+m;

        ort= top/7;
        System.out.println("Ortalmasi: " + ort);


         flag = ort<=60;
         gectiMi= flag ? "Sinifta kaldi": "Sinifi Gecti";
         System.out.println(gectiMi);
    }

}
