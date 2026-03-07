import java.util.Scanner;
public class while11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=a;
        int b=sc.nextInt();
        int y=b;
        int temp=0;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.printf("GCD of %d and %d= %d",x,y,a);
        sc.close();
    }
}
