import java.util.Scanner;

public class loop05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int day=0;
        int roomoccupied=0;
        int totalrooms=0;
        // double occupancyrate=(roomoccupied/totalrooms)*100;
        double occupancyrate=0;
        String status="0";
        double average=0;
        double sumoccupancyrate=0;
        double max=0;
        // double peakoccupancyrate=0;
        int peakday=0;
        int fullcapacityday=0;
        for(int i=1;i<=n;i++){
            day=sc.nextInt();
            roomoccupied=sc.nextInt();
            totalrooms=sc.nextInt();
            occupancyrate = ((double) roomoccupied / totalrooms) * 100;

            if(occupancyrate<60){
                status="Low";
            }
            else if(occupancyrate>=60 && occupancyrate<=79){
                status="Moderate";
            }
            else if(occupancyrate>=80 && occupancyrate<=99){
                status="High";
            }
            else if(occupancyrate==100){
                status="Full";
                fullcapacityday=day;
            }

            sumoccupancyrate=sumoccupancyrate+occupancyrate;
            if(occupancyrate>max){
                max=occupancyrate;
                peakday=day;
            }
            // if(status.equals("Full")){
            //     fullcapacityday=day;
            // }
            System.out.printf("Day: %d\n",day);
            System.out.printf("Rooms Occupied: %d\n",roomoccupied);
            System.out.printf("Total Rooms: %d\n",totalrooms);
            System.out.printf("Occupancy Rate: %.1f%%\n",occupancyrate);
            System.out.printf("Status: %s\n",status);
        }
        int totaldays=n;
        average=sumoccupancyrate/n;
        System.out.printf("Total Days Analyzed: %d\n",totaldays);
        System.out.printf("Average Occupancy Rate: %.2f%%\n",average);
        System.out.printf("Peak Occupancy Day: Day %d\n",peakday);
        System.out.printf("Days at Full Capacity: %d\n",fullcapacityday);
        sc.close();
    }
}
