import java.util.Scanner;

public class while16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int original=binary;
        int a=0;
        int result=0;
        int power=1;
        int remain=0;
        while(binary>0){
            a=binary%10;
            remain=power*a;
            result=result+remain;
            binary=binary/10;
            power=power*2;
        }
        System.out.printf("Binary: %d\n",original);
        System.out.printf("Decimal: %d\n",result);
        sc.close();
    }
}
