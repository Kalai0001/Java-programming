import java.util.Scanner;

public class palindrome {
    static String palindromenum(int n){
        int original=n;
        int rev=0;
        while(n!=0){
        int ld=n%10;
        rev=rev*10+ld;
        n=n/10;
        }
        if(original==rev){
            return "Palindrome";
        }
        else{
            return "Not an Palindrome";
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String res=palindromenum(num);
        System.out.println(res);
        sc.close();
    }
}
