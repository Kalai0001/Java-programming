import java.util.Scanner;
public class basic11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int rate=sc.nextInt();
        int maintenance=sc.nextInt();
        int allowance=sc.nextInt();
        int subsidy=sc.nextInt();

        int transportfee=(distance*rate)+maintenance+allowance-subsidy;
        System.out.printf("Total Transport Fee = %d",transportfee);
        sc.close();
    }
}
