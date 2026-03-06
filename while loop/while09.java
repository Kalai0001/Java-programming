import java.util.Scanner;

public class while09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=2;
        int flag=0;
        while(k*k<=n){
            if(n%k==0){
                flag=1;
                break;
            }
            k++;
        }
        if(flag==1){
            System.out.printf("%d is not prime\n",n);
        }
        else{
            System.out.printf("%d is prime\n",n);
        }
        sc.close();
    }
}
