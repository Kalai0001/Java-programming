import java.util.Scanner;
public class operator08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int id=sc.nextInt();
        if(age>=18 && id==1){
            System.err.println("Allowed");
        }
        else{
            System.out.println("Denied");
        }
        sc.close();
    }
}
