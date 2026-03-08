import java.util.Scanner;

public class while19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        int remainder=0;
        String binary="";
        while(decimal>0){
            remainder=decimal%2;
            binary=binary+remainder;
            decimal=decimal/2;
            // System.out.print(binary);
        }
        // int num=binary;
        // int rev=0;
        // int a=0;
        // while(num!=0){
        //     a=num%10;
        //     rev=rev*10+a;
        //     num=num/10;
        // }
        String rev="";
        for(int i=binary.length()-1;i>=0;i--){
            rev=rev+binary.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }
}
