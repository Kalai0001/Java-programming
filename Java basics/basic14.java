import java.util.Scanner;
public class basic14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int basesalary=sc.nextInt();
        int session=sc.nextInt();
        int paypersession=sc.nextInt();
        int bonus=sc.nextInt();
        int maintenance=sc.nextInt();

        int salary=basesalary+(session*paypersession)+bonus-maintenance;
        System.out.printf("Final Salary = %d",salary);
        sc.close();
    }
}
