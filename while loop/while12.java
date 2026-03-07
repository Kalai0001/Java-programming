import java.util.Scanner;

public class while12 {
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
        if(original==rev){
            System.out.printf("%d is a palindrome",original);
        }
        else{
            System.out.printf("%d is not a palindrome",original);
        }
        sc.close();
    }
}
