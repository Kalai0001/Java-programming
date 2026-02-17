import java.util.Scanner;
public class operator02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int withdraw=sc.nextInt();
        int limit=sc.nextInt();
        if(withdraw<=balance && withdraw<=limit){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
        sc.close();
    }
}
