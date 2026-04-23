import java.util.Scanner;

public class prime {
    static String primenum(int z){
        int flag=0;
        if(z<=1) return "Not a Prime";
        for(int i=2;i<z;i++){
            if(z%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return "Prime";
        }
        else{
            return "Not an Prime";
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String res=primenum(num);
        System.out.println(res);
        sc.close();
    }
}
