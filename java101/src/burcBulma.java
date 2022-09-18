import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("gun giriniz:");
        int gun= inp.nextInt();

        System.out.println("ay giriniz:");
        int ay= inp.nextInt();


        if(ay==1){
            if(gun>=1 && gun<=31){
                if(gun<=22){
                    System.out.println("oglak burcudur.");
                }else {
                    System.out.println("kova burcudur.");
                }
            }else System.out.println("yanlis gun girdiniz.");

        }else if (ay==2){
            if(gun>=1 && gun<=28){
                if(gun<=19){
                    System.out.println("kova burcudur.");
                }else {
                    System.out.println("balik burcudur.");
                }
            }else System.out.println("yanlis gun girdiniz.");

        }else if (ay==3) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 20) {
                    System.out.println("balik burcudur.");
                } else {
                    System.out.println("koc burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");

        }else if (ay==4) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 20) {
                    System.out.println("koc burcudur.");
                } else {
                    System.out.println("boga burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");
        }else if (ay==5) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.println("boga burcudur.");
                } else {
                    System.out.println("ikizler burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");

        }else if (ay==6) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    System.out.println("ikizler burcudur.");
                } else {
                    System.out.println("yengec burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");

        }else if (ay==7) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.println("yengec burcudur.");
                } else {
                    System.out.println("aslan burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");

        }else if (ay==8) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.println("aslan burcudur.");
                } else {
                    System.out.println("basak burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");

        }else if (ay==9) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    System.out.println("basak burcudur.");
                } else {
                    System.out.println("terazi burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");

        }else if (ay==10) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.println("terazi burcudur.");
                } else {
                    System.out.println("akrep burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");

        }else if (ay==11) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 21) {
                    System.out.println("akrep burcudur.");
                } else {
                    System.out.println("yay burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");

        }else if (ay==12) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.println("yay burcudur.");
                } else {
                    System.out.println("oglak burcudur.");
                }
            } else System.out.println("yanlis gun girdiniz.");
        }




    }
}
