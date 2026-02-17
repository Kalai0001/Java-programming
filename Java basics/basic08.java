import java.util.Scanner;
public class basic08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rodsperhour=sc.nextInt();
        int hoursworked=sc.nextInt();
        int overtimerods=sc.nextInt();
        int rejectedrods=sc.nextInt();

        int finalproduction=(rodsperhour*hoursworked)+overtimerods-rejectedrods;
        System.out.printf("Usable Rods = %d",finalproduction);
        sc.close();
    }
}
