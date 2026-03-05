import java.util.Scanner;

public class loop15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double distancekm=0;
        String timeofday="0";
        double basefare=0;
        double distancecharge=0;
        double timesurcharge=0;
        double totalfare=0;
        double totaldistance=0;
        double totalrevenue=0;
        for(int i=1;i<=n;i++){
            distancekm=sc.nextDouble();
            timeofday=sc.next();
            basefare=3.0;
            distancecharge=1*distancekm;
            if(timeofday.equals("Morning")){
                timesurcharge=0;
            }
            else if(timeofday.equals("Afternoon")){
                timesurcharge=0;
            }
            else if(timeofday.equals("Evening")){
                timesurcharge=3;
            }
            else if(timeofday.equals("Night")){
                timesurcharge=5;
            }
            totalfare=basefare+distancecharge+timesurcharge;
            totaldistance=totaldistance+distancekm;
            totalrevenue=totalrevenue+totalfare;

            System.out.printf("Ride %d\n",i);
            System.out.printf("Distance: %.1f km\n",distancekm);
            System.out.printf("Time: %s\n",timeofday);
            System.out.printf("Base Fare: $%.1f\n",basefare);
            System.out.printf("Distance Charge: $%.1f\n",distancecharge);
            System.out.printf("Time Surcharge: $%.1f\n",timesurcharge);
            System.out.printf("Total Fare: $%.1f\n",totalfare);
        }
        double averagefare=totalrevenue/(double)n;
        System.out.printf("Total Rides: %d\n",n);
        System.out.printf("Total Distance: %.1f km\n",totaldistance);
        System.out.printf("Total Revenue: $%.1f km\n",totalrevenue);
        System.out.printf("Average Fare: %.2f\n",averagefare);
        sc.close();
    }
}
