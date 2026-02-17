import java.util.*;
public class operator04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int creditlimit=sc.nextInt();
        int purchaseamount=sc.nextInt();
        int card=sc.nextInt();
        if(purchaseamount<=creditlimit && card==0){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
        sc.close();
    }
}
