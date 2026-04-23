import java.util.Scanner;

public class simpleinterest {
    
    static float simpleinterested(int a,int b,int c){
        int z=(a*b*c)/100;
        return z;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        float res=simpleinterested(p,r,t);
        System.out.printf("%.2f",res);
        sc.close();
    }
}
