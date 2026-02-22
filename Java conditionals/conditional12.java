import java.util.*;
public class conditional12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int driverage=sc.nextInt();
        sc.nextLine();
        String vehicletype=sc.nextLine();
        String drivingrecord=sc.nextLine();
        String coveragelevel=sc.nextLine();

        double basepremium=0;
        double agefactor=0;
        double vehicleriskfactor=0;
        int recordadjustment=0;
        String riskcategory="0";
        if(coveragelevel.equals("Basic")){
            basepremium=500;
        }
        else if(coveragelevel.equals("Standard")){
            basepremium=800;
        }
        else if(coveragelevel.equals("Comprehensive")){
            basepremium=1500;
        }

        if(driverage>=16 && driverage<=21){
            agefactor=1.8;
            riskcategory="Very High";
        }
        else if(driverage>=22 && driverage<=25){
            agefactor=1.5;
            riskcategory="High";
        }
        else if(driverage>=26 && driverage<=40){
            agefactor=1.0;
            riskcategory="Low";
        }
        else if(driverage>=41 && driverage<=60){
            agefactor=0.9;
            riskcategory="Low";
        }
        else if(driverage>=61){
            agefactor=1.1;
            riskcategory="Medium";
        }

        if(vehicletype.equals("Sedan")){
            vehicleriskfactor=1.0;
        }
        else if(vehicletype.equals("SUV")){
            vehicleriskfactor=1.2;
        }
        else if(vehicletype.equals("Sports")){
            vehicleriskfactor=1.5;
        }
        else if(vehicletype.equals("Truck")){
            vehicleriskfactor=1.1;
        }

        if(drivingrecord.equals("Clean")){
            recordadjustment=-10;
        }
        else if(drivingrecord.equals("Minor-Violations")){
            recordadjustment=25;
        }
        else if(drivingrecord.equals("Major-Violations")){
            recordadjustment=50;
        }

        double adjustedpremium=basepremium*agefactor*vehicleriskfactor;
        double finalpremium=adjustedpremium*(1+recordadjustment*(0.01));
        double monthlypremium=finalpremium/12;
        double annualpremium=monthlypremium*12;


        System.out.printf("Driver Age: %d\n",driverage);
        System.out.printf("Vehicle Type: %s\n",vehicletype);
        System.out.printf("Driving Record: %s\n",drivingrecord);
        System.out.printf("Coverage Level: %s\n",coveragelevel);
        System.out.printf("Base Premium: $%.1f\n",basepremium);
        System.out.printf("Age Factor: %.1fx\n",agefactor);
        System.out.printf("Vehicle Risk Factor: %.1fx\n",vehicleriskfactor);
        System.out.printf("Record Adjustment: %d%%\n",recordadjustment);
        System.out.printf("Monthly Premium: $%.2f\n",monthlypremium);
        System.out.printf("Annual Premium: %.1f\n",annualpremium);
        System.out.printf("Risk Category: %s\n",riskcategory);
        sc.close();

    }
}
