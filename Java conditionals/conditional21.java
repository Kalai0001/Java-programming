import java.util.Scanner;

public class conditional21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String locationzone=sc.nextLine();
        double parkinghours=sc.nextDouble();
        sc.nextLine();
        String vehicletype=sc.nextLine();
        String membershipstatus=sc.nextLine();
        double basehours=5.00;
        int zonepremium=0;
        double vehiclesurcharge=0;
        int membershipdiscount=0;
        String dailycap="0";
        String ratecategory="0";
        if(locationzone.equals("Downtown")){
            zonepremium=50;
            ratecategory="Premium";
            if(parkinghours>=24){
                dailycap="Yes";
            }
            else{
                dailycap="No";
            }
        }
        else if(locationzone.equals("Business-District")){
            zonepremium=30;
            ratecategory="Premium";
            if(parkinghours>=24){
                dailycap="Yes";
            }
            else{
                dailycap="No";
            }
        }
        else if(locationzone.equals("Residential")){
            zonepremium=0;
            ratecategory="Standard";
            if(parkinghours>=24){
                dailycap="Yes";
            }
            else{
                dailycap="No";
            }
        }
        else if(locationzone.equals("Airport")){
            zonepremium=100;
            ratecategory="Luxury";
            if(parkinghours>=24){
                dailycap="Yes";
            }
            else{
                dailycap="No";
            }
        }

        if(vehicletype.equals("Motorcycle")){
            vehiclesurcharge=-2;
        }
        else if(vehicletype.equals("Compact")){
            vehiclesurcharge=0;
        }
        else if(vehicletype.equals("Sedan")){
            vehiclesurcharge=0;
        }
        else if(vehicletype.equals("SUV")){
            vehiclesurcharge=3;
        }
        else if(vehicletype.equals("Oversized")){
            vehiclesurcharge=5;
        }

        double rawfee=(basehours*(1+zonepremium*0.01)+vehiclesurcharge)*parkinghours;
        if(membershipstatus.equals("None")){
            membershipdiscount=0;
        }
        else if(membershipstatus.equals("Monthly")){
            membershipdiscount=20;
        }
        else if(membershipstatus.equals("Annual")){
            membershipdiscount=25;
        }
        else if(membershipstatus.equals("VIP")){
            membershipdiscount=30;
        }

        double finalfee=(rawfee*(1-membershipdiscount*0.01));

        System.out.printf("Location Zone: %s\n",locationzone);
        System.out.printf("Parking Duration: %.1f hours\n",parkinghours);
        System.out.printf("Vehicale Type: %s\n",vehicletype);
        System.out.printf("Membership Status: %s\n",membershipstatus);
        System.out.printf("Base Hourly Rate: $%.1f\n",basehours);
        System.out.printf("Zone Premium: %d%%\n",zonepremium);
        System.out.printf("Vehicle Size Surcharge: $%.1f\n",vehiclesurcharge);
        System.out.printf("Membership Discount: %d%%\n",membershipdiscount);
        // System.out.printf("Total Parking Fee: $%.1f\n",rawfee);
        System.out.printf("Total Parking Fee: %.1f\n",finalfee);
        System.out.printf("Daily Cap Applied: %s\n",dailycap);
        System.out.printf("Rate Category: %s\n",ratecategory);
        sc.close();
    }
}
