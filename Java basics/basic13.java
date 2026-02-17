import java.util.Scanner;
public class basic13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yield=sc.nextInt();
        int acre=sc.nextInt();
        int extrayield=sc.nextInt();
        int damagecrops=sc.nextInt();

        int finalyield=(yield*acre)+extrayield-damagecrops;
        System.out.printf("Markteable Yield = %d",finalyield);
        sc.close();
    }
}
