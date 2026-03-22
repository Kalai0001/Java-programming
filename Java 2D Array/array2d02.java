import java.util.Scanner;

public class array2d02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char arr[][]=new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]='A';
            }
        }
        int booking=sc.nextInt();
        int bookcount=0;
        for(int i=0;i<booking;i++){
            int r1=sc.nextInt();
            int c1=sc.nextInt();
            if(arr[r1][c1]=='A'){
                arr[r1][c1]='B';
                bookcount++;
            }
        }
        System.out.println("Seating Chart:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int totalseats=r*c;
        int availableseats=totalseats-bookcount;
        double occupancyrate=((double)bookcount/(double)totalseats)*100;

        System.out.printf("Total Seats: %d\n",totalseats);
        System.out.printf("Booked Seats: %d\n",bookcount);
        System.out.printf("Available Seats: %d\n",availableseats);
        System.out.printf("Occupancy rate: %.2f%%\n",occupancyrate);
        sc.close();
    }
}
