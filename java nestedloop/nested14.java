import java.util.Scanner;

public class nested14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int totalstudents = sc.nextInt();
        int counter = 1;
        int k=1;
        System.out.println("Exam Seating Plan:");
        for (int i = 1; i <= r*2; i++) {
            for (int j = 1; j <= c; j++) {
                if ((i + j) % 2 == 0 && k<=totalstudents) {
                    System.out.print("S" + String.format("%03d",k) + " ");
                    k++;
                    counter++;
                } else {
                    System.out.printf("---- ");
                }
            }
            System.out.println();
        }
        int totalseats = r * c;
        int emptyseats = totalseats-counter;

        System.out.printf("Total Seats: %d\n", totalseats);
        System.out.printf("Occupied Seats: %d\n", counter);
        System.out.printf("Empty Seats: %d\n", emptyseats);
        sc.close();
    }
}
