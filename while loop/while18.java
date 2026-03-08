import java.util.Scanner;

public class while18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int z=a<b?a:b;
        int i=1;
        int gcd=0;
        while(i<=z/2){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
            i++;
        }
        int lcm=a*b/gcd;
        System.out.printf("LCM of %d and %d: %d",a,b,lcm);
        sc.close();
    }
}
