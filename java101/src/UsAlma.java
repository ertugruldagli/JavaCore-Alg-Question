import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {

        int n,k,total=1;
        Scanner input =new Scanner(System.in);

        System.out.println("Degeri giriniz: ");
        n=input.nextInt();
        System.out.println("us Degeri giriniz: ");
        k=input.nextInt();

        for (int i=1;i<=k;i++){
            total*=n;
        }
        System.out.println(total);



    }
}
