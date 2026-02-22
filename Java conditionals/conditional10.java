import java.util.*;
public class conditional10 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String timeofday=sc.nextLine();
    double powerconsumption=sc.nextDouble();
    double renewablepercentage=sc.nextDouble();
    sc.nextLine();
    String ratetier=sc.nextLine();
    
    double baserate=0;
    double ratemultiplier=0;
    double renewablecredit=0;
    double cost=0;
    String recomend="0";
    double potential=0;
    if(timeofday.equals("Peak")){
        if(ratetier.equals("Time-of-Use")){
            ratemultiplier=1.8;
        }
        else if(ratetier.equals("Premium-Green")){
            ratemultiplier=1.5;
        }
    }
    if(timeofday.equals("Off-Peak")){
        if(ratetier.equals("Basic")){
            ratemultiplier=1.0;
        }
        else if(ratetier.equals("Time-of-Use")){
            ratemultiplier=0.8;
        }
    }
    if(timeofday.equals("Super-Off-Peak")){
        if(ratetier.equals("Premium-Green")){
            ratemultiplier=0.6;
        }
    }

    if(ratetier.equals("Basic")){
        baserate=0.18;
    }
    else if(ratetier.equals("Time-of-Use")){
        baserate=0.15;
    }
    else if(ratetier.equals("Premium-Green")){
        baserate=0.12;
    }

    renewablecredit=(powerconsumption*renewablepercentage*0.01)*baserate;
    cost=(powerconsumption*baserate*ratemultiplier)-renewablecredit;

    if(timeofday.equals("Peak")){
        if(renewablepercentage<=15){
            recomend="Shift high-power appliances to Off-Peak hours";
            potential=4.05;
        }
        else if(renewablepercentage>15){
            recomend="Great renewable usage! Minor *peak reduction possible";
            potential=1.44;
        }
    }
    else if(timeofday.equals("Super-Off-Peak")){
        if(renewablepercentage>=60){
            recomend="Excellent! Maximize appliance use during this period";
            potential=0.0;
        }
    }
    else if(timeofday.equals("Off-Peak")){
        if(renewablepercentage>=35){
            recomend="Consider upgrading to Time-of-Use plan";
            potential=0.75;
        }
        else if(renewablepercentage<35){
            recomend="Good timing! Consider increasing renewable capacity";
            potential=0.0;
        }
    }
    

    System.out.printf("Time of Day: %s\n",timeofday);
    System.out.printf("Power Consumption: %.1f kWh\n",powerconsumption);
    System.out.printf("Renewable Energy: %.1f%%\n",renewablepercentage);
    System.out.printf("Rate Tier: %s\n",ratetier);
    System.out.printf("Base Rate: $%.2f/kWh\n",baserate);
    System.out.printf("Rate Multiplier: %.1fx\n",ratemultiplier);
    System.out.printf("Renewable Credit: $%.2f\n",renewablecredit);
    System.out.printf("Total Cost: $%.2f\n",cost);
    System.out.printf("Optimization Recommendation: %s\n",recomend);
    System.out.printf("potential Savings: $%.2f\n",potential);
    sc.close();
}
}
