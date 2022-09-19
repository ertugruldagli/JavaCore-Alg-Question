public class palindromSayi {
    static boolean isPoli(int number){
        int temp=number, lastNumber,tersNumber=0;

        while(temp!=0){
            System.out.println("---------------------------------- ");
            lastNumber=temp%10;
            System.out.println("last number: "+ lastNumber);
            tersNumber=(tersNumber*10)+lastNumber;
            System.out.println("ters number: "+ tersNumber);
            temp/=10;
            System.out.println("yeni number: "+ temp);
        }
        System.out.println("############## ");
        if(number==tersNumber){
            System.out.println("sayi palindromdur. ");
        }else {
            System.out.println("sayi palindrom degildir. ");
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPoli(9889));
    }
}
