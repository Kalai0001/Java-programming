import java.util.Scanner;

public class while17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n/2){
            if(n%i==0){
                sum=sum+i;
            }
            i++;
        }
        if(n==sum){
            System.out.printf("%d is a perfect number",n);
        }
        else{
            System.out.printf("%d is not a perfect number",n);
        }
        sc.close();
    }
}
