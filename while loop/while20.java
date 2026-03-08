import java.util.Scanner;

public class while20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int fact=1;
        int a=1;
        int sum=0;
        int i=1;
        while(n!=0){
            a=n%10;
            for(i=1;i<=a;i++){
                fact=fact*i;
            } 
            sum=sum+fact;
            fact=1;
            n=n/10;
        }
        if(original==sum){
            System.out.printf("%d is a strong number",original);
        }
        else{
            System.out.printf("%d is not a strong number",original);
        }
        sc.close();
    }
}
