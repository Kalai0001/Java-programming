import java.util.Scanner;

public class while13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        int expo=power;
        int result=1;
        int fact=1;
        while(power>0){
            // result=base*(expo-base);
            // fact=fact*result;
            // power--;
            fact=base*result;
            result=fact;
            power--;
        }
        System.out.printf("%d^%d = %d",base,expo,fact);
        sc.close();
    }
}
