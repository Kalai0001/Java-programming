import java.util.Scanner;
public class basic07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int wages=sc.nextInt();
        int overtime=sc.nextInt();
        int charge=sc.nextInt();

        int base=days*wages;
        int bonus=base+overtime;
        int deducedcharge=bonus-charge;

        System.out.printf("Final Weekly Wage = %d",deducedcharge);
        sc.close();
    }
}