import java.util.Scanner;

public class while02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=-1;
        int sum=0;
        int count=0;
        while(n!=0){
            n=sc.nextInt();
            sum=sum+n;
            System.out.printf("Enter number (0 to stop): %d\n",n);
            count++;
        }
        System.out.printf("Total sum: %d\n",sum);
        System.out.printf("Count: %d",count-1);
        sc.close();
    }
}
