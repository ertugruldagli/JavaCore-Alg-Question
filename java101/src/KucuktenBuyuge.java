import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Birinci sayi:");
        int a=inp.nextInt();
        System.out.print("Ikinci sayi:");
        int b=inp.nextInt();
        System.out.print("Ucuncu sayi:");
        int c=inp.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.print("c<b<a");
            }else{
                System.out.print("b<c<a");
            }
        } else if (b>a && b>c) {
           if(a>c){
               System.out.print("c<a<b");
           }else{
               System.out.print("a<c<b");
           }
        }else if(c>a && c>b){
            if(a>b){
                System.out.print("b<a<c");
            }else{
                System.out.print("a<b<c");
            }
        }
    }
}
