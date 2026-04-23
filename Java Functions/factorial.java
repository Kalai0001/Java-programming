import java.util.Scanner;

public class factorial {
    static int factorialnum(int num){
        int res=1;
        for(int i=1;i<=num;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=factorialnum(n);
        System.out.println(ans);
        sc.close();
    }
}
