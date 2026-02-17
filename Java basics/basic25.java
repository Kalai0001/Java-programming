import java.util.Scanner;
public class basic25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int resusage=sc.nextInt();
        int resrate=sc.nextInt();
        int comusage=sc.nextInt();
        int comrate=sc.nextInt();
        int connection=sc.nextInt();
        int penalty=sc.nextInt();
        int maintenance=sc.nextInt();
        int treatment=sc.nextInt();

        int netrevenue=(resusage*resrate)+(comusage*comrate)+connection+penalty-maintenance-treatment;
        System.out.printf("Net Water Revenue = %d",netrevenue);
        sc.close();
    }
}
