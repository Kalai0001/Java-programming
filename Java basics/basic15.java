import java.util.Scanner;
public class basic15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rooms=sc.nextInt();   
        int price=sc.nextInt();  
        int charge=sc.nextInt();  
        int commission=sc.nextInt(); 
        
        int revenue=(rooms*price)+charge-commission;
        System.out.printf("Total Revenue = %d",revenue);
        sc.close();
    }
}
