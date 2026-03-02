import java.util.Scanner;

public class conditional24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double distancemiles=sc.nextDouble();
        double ordervalue=sc.nextDouble();
        sc.nextLine();
        String timeslot=sc.nextLine();
        String weathercondition=sc.nextLine();

        double basedeliveryfee=3.0;
        double distancesurcharge=distancemiles*1;
        double peaktimesurcharge=0;
        double weathersurcharge=0;
        double ordervaluediscount=0;
        if(timeslot.equals("Breakfast")){
            peaktimesurcharge=0;
        }
        else if(timeslot.equals("Lunch")){
            peaktimesurcharge=2.50;
        }
        else if(timeslot.equals("Dinner")){
            peaktimesurcharge=2.00;
        }
        else if(timeslot.equals("Late-Night")){
            peaktimesurcharge=1.50;
        }

        if(weathercondition.equals("clear")){
            weathersurcharge=0;
        }
        else if(weathercondition.equals("Rain")){
            weathersurcharge=2;
        }
        else if(weathercondition.equals("Snow")){
            weathersurcharge=3;
        }
        else if(weathercondition.equals("Storm")){
            weathersurcharge=5;
        }

        if(ordervalue>=30 && ordervalue<=49.99){
            ordervaluediscount=1;
        }
        else if(ordervalue>=50 && ordervalue<=74.99){
            ordervaluediscount=3;
        }
        else if(ordervalue>=75){
            ordervaluediscount=5;
        }

        double finalfee=basedeliveryfee+distancesurcharge+peaktimesurcharge-ordervaluediscount;
        double estimateddeliverytime=distancemiles*8;
        if(weathercondition.equals("Rain")){
            estimateddeliverytime+=5;
        }
        else if(weathercondition.equals("Snow")){
            estimateddeliverytime+=10;
        }
        else if(weathercondition.equals("Storm")){
            estimateddeliverytime+=15;
        }
        if(timeslot.equals("Lunch")||timeslot.equals("Dinner")){
            estimateddeliverytime+=10;
        }
        int z=(int)estimateddeliverytime;

        String servicepriority="0";
        if(ordervalue>60){
            servicepriority="Express";
        }
        else if(timeslot.equals("Lunch")||timeslot.equals("Dinner")){
            servicepriority="High";
        }
        else{
            servicepriority="Standard";
        }


        System.out.printf("Delivery Distance: %.1f miles\n",distancemiles);
        System.out.printf("Order Value: $%.1f\n",ordervalue);
        System.out.printf("Time Slot: %s\n",timeslot);
        System.out.printf("Weather Condition: %s\n",weathercondition);
        System.out.printf("Base Delivery Fee: $%.1f\n",basedeliveryfee);
        System.out.printf("Distance Surcharge: $%.1f\n",distancesurcharge);
        System.out.printf("Peak Time Surcharge: $%.1f\n",peaktimesurcharge);
        System.out.printf("Weather Surcharge: $%.1f\n",weathersurcharge);
        System.out.printf("Order Value Discount: $%.1f\n",ordervaluediscount);
        System.out.printf("Final Delivery Fee: $%.1f\n",finalfee);
        System.out.printf("Estimated Delivery Time: %d minutes\n",z);
        System.out.printf("Service Priority: %s\n",servicepriority);
        sc.close();

    }
}
