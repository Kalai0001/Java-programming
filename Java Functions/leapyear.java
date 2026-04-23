import java.util.Scanner;

public class leapyear {
    static String leapyearnum(int n){
        if((n%100==0 && n%400!=0)||(n%4==0)){
            return "Leap Year";
        }
        else{
            return "Not an Leap Year";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String res=leapyearnum(num);
        System.out.println(res);
        sc.close();
    }
}
