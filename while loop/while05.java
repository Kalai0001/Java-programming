import java.util.Scanner;

public class while05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int a=0;
        int rev=0;
        while(n!=0){
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        System.out.printf("Original: %d\n",original);
        System.out.printf("Reversed: %d\n",rev);
        sc.close();
    }
}
