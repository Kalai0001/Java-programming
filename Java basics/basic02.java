import java.util.Scanner;
class basic02{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int basecost=sc.nextInt();
        int extragb=sc.nextInt();
        int ratepergb=sc.nextInt();
        int tax=sc.nextInt();
        int additionalcharges=extragb*ratepergb;


        float bill=basecost+additionalcharges;
        float percent=bill+tax*(bill/100);
        // float totalbill=bill+percent;

        System.out.printf("Total Bill = %.2f",percent);
        sc.close();
    }
}
