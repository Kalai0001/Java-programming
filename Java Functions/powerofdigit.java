import java.util.Scanner;

public class powerofdigit {
    static int powerofnum(int a1,int b1){
        if(a1>0 && b1==0){
            return 1;
        }
        int ans=0;
        int x=1;
        for(int i=1;i<=b1;i++){
            ans=x*a1;
            x=ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=powerofnum(a,b);
        System.out.println(res);
        sc.close();
    }
}
