import java.util.Scanner;
class conditional22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unitsconsumed=sc.nextInt();
        sc.nextLine();
        String customertype=sc.nextLine();
        String season=sc.nextLine();
        String paymentmethod=sc.nextLine();
        // double tiercost=0;
        double t1cost=0;
        double t2cost=0;
        double t3cost=0;
        double t4cost=0;

        double tier1cost=0;
        double tier2cost=0;
        double tier3cost=0;
        double tier4cost=0;
        int seasonaladjustment=0;
        int paymentdiscount=0;
        double a=0;
        double b=0;
        double c=0;
        

        if(customertype.equals("Residential")){
            if(unitsconsumed<=100 || unitsconsumed>100){
                t1cost=0.10;
                a=unitsconsumed-100;
                tier1cost=(unitsconsumed-a)*t1cost;
            }
            if(unitsconsumed>=101 || unitsconsumed>=300){
                t2cost=0.15;
                b=a-200;
                tier2cost=(a-b)*t2cost;
            }
            if(unitsconsumed>=301){
                t3cost=0.25;
                c=b-200;
                tier3cost=(b-c)*t3cost;
            }
            if(unitsconsumed>500){
                t4cost=0.30;
                tier4cost=c*t4cost;
            }
        }
        else if(customertype.equals("Commercial")){
            if(unitsconsumed<=100 || unitsconsumed>100){
                t1cost=0.12;
                tier1cost=(unitsconsumed-(unitsconsumed-100))*t1cost;
            }
            if(unitsconsumed>=101 || unitsconsumed>=300){
                t2cost=0.18;
                tier2cost=(unitsconsumed-(unitsconsumed-200))*t2cost;
            }
            if(unitsconsumed>=301){
                t3cost=0.25;
                tier3cost=(unitsconsumed-(unitsconsumed-200))*t3cost;
            }
            if(unitsconsumed>500){
                t4cost=0.25;
                tier4cost=(unitsconsumed-(unitsconsumed-100))*t4cost;
            }
        }
        else if(customertype.equals("Industrial")){
            if(unitsconsumed<=100 || unitsconsumed>100){
                t1cost=0.08;
                tier1cost=(unitsconsumed-(unitsconsumed-100))*t1cost;
            }
            if(unitsconsumed>=101 || unitsconsumed>=300){
                t2cost=0.12;
                tier2cost=(unitsconsumed-(unitsconsumed-200))*t2cost;
            }
            if(unitsconsumed>=301){
                t3cost=0.20;
                tier3cost=(unitsconsumed-(unitsconsumed-200))*t3cost;
            }
            if(unitsconsumed>500){
                t4cost=0.20;
                tier4cost=(unitsconsumed-(unitsconsumed-100))*t4cost;
            }
        }
        if(season.equals("Summer")){
            seasonaladjustment=15;
        }
        else if(season.equals("Winter")){
            seasonaladjustment=-10;
        }
        else if(season.equals("Regular")){
            seasonaladjustment=0;
        }

        if(paymentmethod.equals("Auto-Pay")){
            paymentdiscount=5;
        }
        else if(paymentmethod.equals("Online")){
            paymentdiscount=3;
        }
        else if(paymentmethod.equals("Manual")){
            paymentdiscount=0;
        }
        double totalbill=tier1cost+tier2cost+tier3cost+tier4cost;
        double average=totalbill/unitsconsumed;

        System.out.printf("Units Consumed: %d kWh\n",unitsconsumed);
        System.out.printf("Customer Type: %s\n",customertype);
        System.out.printf("Season: %s\n",season);
        System.out.printf("Payment Method: %s\n",paymentmethod);
        System.out.printf("Tier 1 Cost(0-100): $%.1f\n",tier1cost);
        System.out.printf("Tier 2 Cost(101-300): $%.1f\n",tier2cost);
        System.out.printf("Tier 3 Cost(301-500): $%.1f\n",tier3cost);
        System.out.printf("Tier 4 Cost(501+): $%.1f\n",tier4cost);
        System.out.printf("Seasonal Adjustment: %d%%\n",seasonaladjustment);
        System.out.printf("Payment Discount: $%d%%\n",paymentdiscount);
        System.out.printf("Total Bill: $%.2f\n",totalbill);
        System.out.printf("Average Rate: $%.2f kWh\n",average);
        sc.close();
    }
}
