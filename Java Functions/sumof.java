import java.util.Scanner;

public class sumof {
    static int sumofdigits(int n){
        int sum=0;
        while(n!=0){
        int ld=n%10;
        sum=sum+ld;
        n=n/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=sumofdigits(num);
        System.out.println(res);
        sc.close();
    }
}
