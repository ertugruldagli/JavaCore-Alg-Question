import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int combi;

        int a=4;
        int i,total=1;
        for ( i=1; i<=a; i++){
            //System.out.println(i);
            total*=i;
        }
        System.out.println(total);

    }
}
