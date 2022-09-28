import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int year;
        Scanner inp=new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz: ");
        year=inp.nextInt();

        if(year%12==0){
            System.out.print("Cin Zodyagi Burcunuz: Maymun ");
        }else if(year%12==1){
            System.out.print("Cin Zodyagi Burcunuz: horoz ");
        }else if(year%12==2){
            System.out.print("Cin Zodyagi Burcunuz: kopek ");
        }else if(year%12==3){
            System.out.print("Cin Zodyagi Burcunuz: domuz ");
        }else if(year%12==4){
            System.out.print("Cin Zodyagi Burcunuz: fare ");
        }else if(year%12==5){
            System.out.print("Cin Zodyagi Burcunuz: okuz ");
        }else if(year%12==6){
            System.out.print("Cin Zodyagi Burcunuz: kaplan ");
        }else if(year%12==7){
            System.out.print("Cin Zodyagi Burcunuz: tavsan ");
        }else if(year%12==8){
            System.out.print("Cin Zodyagi Burcunuz: ejderha ");
        }else if(year%12==9){
            System.out.print("Cin Zodyagi Burcunuz: yilan ");
        }else if(year%12==10){
            System.out.print("Cin Zodyagi Burcunuz: at ");
        }else{
            System.out.print("Cin Zodyagi Burcunuz: koyun ");
        }
    }
}
