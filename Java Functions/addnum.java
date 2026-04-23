import java.util.Scanner;

public class addnum{
    static int addnums(int c,int d){
        return c+d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=addnums(a,b);
        System.out.println("Sum = "+res);
        sc.close();
    }
    
}