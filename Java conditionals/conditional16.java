import java.util.Scanner;
public class conditional16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String roomcategory=sc.nextLine();
        String season=sc.nextLine();
        int nightbooked=sc.nextInt();
        sc.nextLine();
        String loyaltytier=sc.nextLine();
        
        double basepernight=0;
        double seasonalmultiplier=0;
        int extendedstaydiscount=0;
        int loyaltydiscount=0;
        String upgrade="0";

        if(roomcategory.equals("Standard")){
            basepernight=150;
        }
        else if(roomcategory.equals("Deluxe")){
            basepernight=300;
            if(loyaltytier.equals("Gold")){
                upgrade="Free breakfast and spa access";
            }
        }
        else if(roomcategory.equals("Suite")){
            basepernight=500;
            if(loyaltytier.equals("Member")){
                upgrade="Free breakfast";
            }
        }
        else if(roomcategory.equals("Presidential")){
            basepernight=1000;
            if(loyaltytier.equals("Platinum")){
                upgrade="Concierge service,airport transfer,and fine dining";
            }
        }
        if(loyaltytier.equals("None")){
            upgrade="None";
        }

        if(season.equals("Off-Peak")){
            seasonalmultiplier=0.7;
        }
        else if(season.equals("Regular")){
            seasonalmultiplier=1.0;
        }
        else if(season.equals("Peak")){
            seasonalmultiplier=1.5;
        }
        else if(season.equals("Holiday")){
            seasonalmultiplier=2.0;
        }

        if(nightbooked>=1 && nightbooked<5){
            extendedstaydiscount=0;
        }
        else if(nightbooked>=5 && nightbooked<7){
            extendedstaydiscount=5;
        }
        else if(nightbooked>=7 && nightbooked<14){
            extendedstaydiscount=10;
        }
        else if(nightbooked>=14){
            extendedstaydiscount=20;
        }

        if(loyaltytier.equals("None")){
            loyaltydiscount=0;
        }
        else if(loyaltytier.equals("Member")){
            loyaltydiscount=10;
        }
        else if(loyaltytier.equals("Gold")){
            loyaltydiscount=15;
        }
        else if(loyaltytier.equals("Platinum")){
            loyaltydiscount=20;
        }

        double seasonalrate=basepernight*seasonalmultiplier;
        double discountedrate=seasonalrate*(1-extendedstaydiscount*0.01)*(1-loyaltydiscount*0.01);
        double totalcost=discountedrate*nightbooked;

        System.out.printf("Room Category: %s\n",roomcategory);
        System.out.printf("Season: %s\n",season);
        System.out.printf("Nights Booked: %d\n",nightbooked);
        System.out.printf("Loyalty Tier: %s\n",loyaltytier);
        System.out.printf("Base Rate Per Night: $%.1f\n",basepernight);
        System.out.printf("Seasonal Multilpier: %.1fx\n",seasonalmultiplier);
        System.out.printf("Extended Stay Discount: %d%%\n",extendedstaydiscount);
        System.out.printf("Loyalty Discount: %d%%\n",loyaltydiscount);
        System.out.printf("Nightly Rate: $%.2f\n",discountedrate);
        System.out.printf("Total Booking Cost: $%.2f\n",totalcost);
        System.out.printf("Complimentary Upgrades: %s\n",upgrade);
        sc.close();
    }
}
