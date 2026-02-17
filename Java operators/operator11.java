import java.util.Scanner;
public class operator11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int basebox=sc.nextInt();
        int level=sc.nextInt();
        int capacity=basebox<<level;
        System.out.printf("Total capacity = %d",capacity);
        sc.close();
    }
}
