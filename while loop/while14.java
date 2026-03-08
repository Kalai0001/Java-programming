import java.util.Scanner;

public class while14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int a=0;
        int sum=0;
        while(n!=0){
            a=n%10;
            sum=a*a*a+sum;
            n=n/10;
        }
        if(original==sum){
            System.out.printf("%d is an Armstrong number",original);
        }
        else{
            System.out.printf("%d is not an Armstrong number",original);
        }
        sc.close();
    }
}
