import java.util.Scanner;

public class while04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.printf("Factorial of %d = %d",num,fact);
        sc.close();
    }

}
