import java.util.Scanner;
public class basic16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int genpass=sc.nextInt();
        int genfare=sc.nextInt();
        int acpass=sc.nextInt();
        int acfare=sc.nextInt();
        int platform=sc.nextInt();
        int maintenance=sc.nextInt();
        int fuel=sc.nextInt();

        int netrevenue=(genpass*genfare)+(acpass*acfare)+platform-maintenance-fuel;
        System.out.printf("Net Railway Revenue = %d",netrevenue);
        sc.close();
    }
}
