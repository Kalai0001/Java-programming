import java.util.Scanner;
public class conditional25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double datagb=sc.nextDouble();
        int callminutes=sc.nextInt();
        sc.nextLine();
        String internationalusage=sc.nextLine();
        String devicetype=sc.nextLine();

        String recommendedplan="0";
        double baseplancost=0;
        double devicefee=0;
        double internationalfee=0;
        double dataoverage=0;
        double calloverage=0;
        String plancategory="0";
        if(datagb<=5){
            recommendedplan="Basic 2GB";
            baseplancost=25;
            plancategory="Budget";
        }
        else if(datagb>=6 && datagb<=10){
            recommendedplan="Standard 5GB";
            baseplancost=40;
            plancategory="Standard";
        }
        else if(datagb>=11 && datagb<=30){
            recommendedplan="Premium Unlimited";
            baseplancost=70;
            plancategory="Premium";
        }
        else if(datagb>30){
            recommendedplan="Unlimited Max";
            baseplancost=90;
            plancategory="Unlimited";
        }

        if(internationalusage.equals("Light")){
            internationalfee=5;
        }
        else if(internationalusage.equals("Moderate")){
            internationalfee=15;
        }
        else if(internationalusage.equals("Heavy")){
            internationalfee=30;
        }
        else if(internationalusage.equals("None")){
            internationalfee=0;
        }

        if(devicetype.equals("Basic")){
            devicefee=0;
        }
        else if(devicetype.equals("Smartphone")||devicetype.equals("Tablet")){
            devicefee=10;
        }
        else if(devicetype.equals("Hotspot")){
            devicefee=20;
        }

        double totalmonthlycost=baseplancost+dataoverage+internationalfee+devicefee;
        double potentialsavings=0;

        System.out.printf("Data Usage: %.1f GB\n",datagb);
        System.out.printf("Call Minutes: %d minutes\n",callminutes);
        System.out.printf("International Usage: %s\n",internationalusage);
        System.out.printf("Device Type: %s\n",devicetype);
        System.out.printf("Recommended Plan: %s\n",recommendedplan);
        System.out.printf("Best Plan Cost: $%.1f\n",baseplancost);
        System.out.printf("Data Overage: $%.1f\n",dataoverage);
        System.out.printf("Call Usage: $%.1f\n",calloverage);
        System.out.printf("International Fee: $%.1f\n",internationalfee);
        System.out.printf("Device Fee: $%.1f\n",devicefee);
        System.out.printf("Total Monthly Cost: $%.1f GB\n",totalmonthlycost);
        System.out.printf("Potential Savings: $%.1f\n",potentialsavings);
        System.out.printf("Plan Category: %s\n",plancategory);
        sc.close();
    }
}
