import java.util.Scanner;
public class basic10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int delivery=sc.nextInt();
        int payout=sc.nextInt();
        int incentive=sc.nextInt();
        int fuelcost=sc.nextInt();

        int netearnings=(delivery*payout)+incentive-fuelcost;
        System.out.printf("Drive Earnings = %d",netearnings);
        sc.close();
    }
}
