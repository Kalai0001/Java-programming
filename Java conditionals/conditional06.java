import java.util.*;
public class conditional06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String booking=sc.nextLine();
        int days=sc.nextInt();
        double seat=sc.nextDouble();
        sc.nextLine();
        String route=sc.nextLine();
        double baseprice=0;
        double demandmultiplier=0;
        sc.nextLine();
        String pricecategory="";
        double finalprice=0;
        if(booking.equals("Economy")){
            if(route.equals("Domestic")){
                baseprice=200;
            }
            else if(route.equals("International-Short")){
                baseprice=500;
            }
            else if(route.equals("International-Long")){
                baseprice=800;
            }
        }
        else if(booking.equals("Business")){
            if(route.equals("Domestic")){
                baseprice=600;
            }
            else if(route.equals("International-Short")){
                baseprice=1500;
            }
            else if(route.equals("International-Long")){
                baseprice=2500;
            }
        }
        else if(booking.equals("First")){
            if(route.equals("Domestic")){
                baseprice=1000;
            }
            else if(route.equals("International-Short")){
                baseprice=3000;
            }
            else if(route.equals("International-Long")){
                baseprice=5000;
            }
        }
        //demand multiplier//
        if(seat<30 && days<14){
            demandmultiplier=1.8;
            pricecategory="High Demand";
        }
        else if(seat<50 && days<30){
            demandmultiplier=1.5;
            pricecategory="High Demand";
        }
        else if((seat<60)||(days>30&&days<60)){
            demandmultiplier=1.0;
            pricecategory="Moderate";
        }
        else if(seat>=60 && days>60){
            demandmultiplier=0.8;
            pricecategory="Low Demand";
        }
        finalprice=baseprice*demandmultiplier;
        System.out.printf("Booking Class: %s\n",booking);
        System.out.printf("Days Until Departure: %d\n",days);
        System.out.printf("Seat Availability: %.1f%%\n",seat);
        System.out.printf("Route Type: %s\n",route);
        System.out.printf("Base Price: $%.1f\n",baseprice);
        System.out.printf("Demand Multiplier: %.1fx\n",demandmultiplier);
        System.out.printf("Final Ticket Price: $%.1f\n",finalprice);
        System.out.printf("Pricing Category: %s\n",pricecategory);
        sc.close();
    }
}
