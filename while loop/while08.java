import java.util.Scanner;

public class while08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        int a=0;
        while(n!=0){
            a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.printf("Number: %d\n",original);
        System.out.printf("Sum of digits: %d\n",sum);
        sc.close();
    }
}
