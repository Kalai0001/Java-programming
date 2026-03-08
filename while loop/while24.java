import java.util.Scanner;

public class while24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 0;
        int z = a < b ? a : b;
        int i = 1;
        while (i <= z / 2) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
            i++;
        }
        System.out.printf("HCF of %d and %d = %d", a, b, hcf);
        sc.close();
    }
}
