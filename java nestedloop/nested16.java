import java.util.Scanner;

public class nested16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int occupiedseats=sc.nextInt();
        boolean parking[][]=new boolean[rows][cols];
        // int occupiedspots=sc.nextInt();
        for(int i=0;i<occupiedseats;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            parking[r][c]=true;
        }
        System.out.println("Parking Lot Grid:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(parking[i][j]){
                    System.out.print("[O] ");
                }
                else{
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
        int totalspots=rows*cols;
        int vacanspots=totalspots-occupiedseats;
        double occupancyrate=(occupiedseats*100.0)/totalspots;
        System.out.println();
        System.out.println("Total Spots: "+totalspots);
        System.out.println("Occupied: "+occupiedseats);
        System.out.println("Vacant: "+vacanspots);
        System.out.printf("Occupancy Rate: %.2f%%",occupancyrate);
        sc.close();
    }
}
