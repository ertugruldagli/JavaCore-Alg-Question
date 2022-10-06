import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);
        System.out.print("Year input: ");
        int year= inp.nextInt();

        if(year%4==0){
            System.out.println(year + " Artik Yildir.");
        }
        if(year%400==0) {
            System.out.println(year + " Artik Yildir.");
        }else{
            System.out.println(year + " Artik Yil degildir!!.");
        }

    }
}
