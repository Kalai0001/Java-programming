import java.util.Scanner;

public class loop12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String vehicletype="0";
        double hoursparked=0;
        double hourlyrate=0;
        double parkingfee=0;
        String capapplied="0";
        double totalrevenue=0;
        int hoursparkedmax=0;
        for(int i=1;i<=n;i++){
            vehicletype=sc.next();
            hoursparked=sc.nextDouble();
            if(vehicletype.equals("Car")){
                hourlyrate=3;
            }
            else if(vehicletype.equals("Motorcycle")){
                hourlyrate=2;
            }
            else if(vehicletype.equals("Truck")){
                hourlyrate=5;
            }
            else if(vehicletype.equals("Bus")){
                hourlyrate=7;
            }

            parkingfee=hoursparked*hourlyrate;

            if(vehicletype.equals("Car")){
                if(parkingfee==30){
                    capapplied="Yes";
                }
                else{
                    capapplied="NO";
                }
            }
            else if(vehicletype.equals("Motorcycle")){
                if(parkingfee==20){
                    capapplied="Yes";
                }
                else{
                    capapplied="NO";
                }
            }
            else if(vehicletype.equals("Truck")){
                if(parkingfee==60){
                    capapplied="Yes";
                }
                else{
                    capapplied="NO";
                }
            }
            else if(vehicletype.equals("Bus")){
                if(parkingfee==100){
                    capapplied="Yes";
                }
                else{
                    capapplied="NO";
                }
            }
            if(hoursparked>8){
                hoursparkedmax++;
            }
            totalrevenue=totalrevenue+parkingfee;
            System.out.printf("Vehicle %d: %s\n",i,vehicletype);
            System.out.printf("Hours Parked: %.1f\n",hoursparked);
            System.out.printf("Hourly Rate: $%.1f\n",hourlyrate);
            System.out.printf("Parking Fee: $%.1f\n",parkingfee);
            System.out.printf("Cap Applied: %s\n",capapplied);
        }
        double averagefeee=totalrevenue/n;
        System.out.printf("Total Vehicles: %d\n",n);
        System.out.printf("Total Revenue: $%.1f\n",totalrevenue);
        System.out.printf("Average Fee: $%.2f\n",averagefeee);
        System.out.printf("Peak Hours Vehicles(>8 hours): %d\n",hoursparkedmax);
        sc.close();
    }
}
