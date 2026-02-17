import java.util.Scanner;
public class basic12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ticket=sc.nextInt();
        int snack=sc.nextInt();
        int maintenance=sc.nextInt();
        int electricity=sc.nextInt();

        int netprofit=ticket+snack-maintenance-electricity;
        System.out.printf("Net Profit = %d",netprofit);
        sc.close();
    }
}
