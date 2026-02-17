import java.util.Scanner;
public class basic06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuelprice=sc.nextInt();
        int tollcharge=sc.nextInt();

        int mileageperkm=distance/mileage;
        int total=(mileageperkm*fuelprice)+tollcharge;

        System.out.printf("Total Trip Cost = %d",total);
        sc.close();
    }
}
