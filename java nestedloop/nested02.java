import java.util.Scanner;

public class nested02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int seatsperrow=sc.nextInt();
        int z=rows*seatsperrow;
        System.out.println("Seating Arrangement:");
        for(int i=1;i<=rows;i++){
            System.out.printf("Row %d:",i);
            for(int j=1;j<=seatsperrow;j++){
                System.out.printf("Seat-%d ",j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("Total Seats: %d",z);
        sc.close();
    }
}
