import java.util.Scanner;
public class basic24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int register=sc.nextInt();
        int broadcast=sc.nextInt();
        int sponsor=sc.nextInt();
        int prize=sc.nextInt();
        int rent=sc.nextInt();
        int advertising=sc.nextInt();

        int remainingfund=register+broadcast+sponsor-prize-rent-advertising;
        System.out.printf("Remaining Tournament Fund = %d",remainingfund);
        sc.close();
    }
}
