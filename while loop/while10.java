import java.util.Scanner;

public class while10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int a=0;
        int b=1;
        System.out.printf("Fibonacci sequence(%d terms)\n",n);
        while(x!=0){
            // System.out.printf("Fibonacci sequence(%d terms)\n",n);
            System.out.printf("%d ",a);
            int c=a+b;
            a=b;
            b=c;
            x--;
        }

        sc.close();
    }
}
