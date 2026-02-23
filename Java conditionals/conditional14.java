import java.util.Scanner;
public class conditional14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String membershiptier=sc.nextLine();
        int contactmonths=sc.nextInt();
        sc.nextLine();
        String accesslevel=sc.nextLine();
        String addons=sc.nextLine();
        double basemonthlyfee=0;
        int contractdiscount=0;
        double accessfee=0;
        double addonfee=0;
        if(membershiptier.equals("Basic")){
            basemonthlyfee=40;
        }
        else if(membershiptier.equals("Premium")){
            basemonthlyfee=80;
        }
        else if(membershiptier.equals("Elite")){
            basemonthlyfee=120;
        }
        else if(membershiptier.equals("VIP")){
            basemonthlyfee=150;
        }
        if(contactmonths==1){
            contractdiscount=0;
        }
        else if(contactmonths==6){
            contractdiscount=10;
        }
        else if(contactmonths==12){
            contractdiscount=15;
        }
        else if(contactmonths==24){
            contractdiscount=25;
        }
        if(accesslevel.equals("Single-Location")){
            accessfee=0;
        }
        else if(accesslevel.equals("Regional")){
            accessfee=20;
        }
        else if(accesslevel.equals("Nationwide")){
            accessfee=50;
        }
        if(addons.equals("None")){
            addonfee=0;
        }
        else if(addons.equals("Personal-Training")){
            addonfee=100;
        }
        else if(addons.equals("Classes")){
            addonfee=50;
        }
        else if(addons.equals("Full-Package")){
            addonfee=200;
        }
        double discountedbase=basemonthlyfee*(1-contractdiscount*0.01);
        double monthlytotal=discountedbase+accessfee+addonfee;
        double contracttotal=monthlytotal*contactmonths;
        double savings=(basemonthlyfee+accessfee+addonfee)*contactmonths-contracttotal;
        String membershipcategory="0";
        if(membershiptier.equals("Premium")){
            if(monthlytotal>=150.0){
                membershipcategory="Premium";
            }
            else if(monthlytotal<150.0){
                membershipcategory="Standard";
            }
        }
        else if(membershiptier.equals("Basic")){
            membershipcategory="Budget";
        }
        else if(membershiptier.equals("VIP")){
            membershipcategory="Luxury";
        }
        else if(membershiptier.equals("Elite")){
            membershipcategory="Premium";
        }
        System.out.printf("Membership Tier: %s\n",membershiptier);
        System.out.printf("Contract Length: %d months\n",contactmonths);
        System.out.printf("Access Level: %s\n",accesslevel);
        System.out.printf("Add-Ons: %s\n",addons);
        System.out.printf("Base Monthly Fee: $%.1f\n",basemonthlyfee);
        System.out.printf("Contract Discount: %d%%\n",contractdiscount);
        System.out.printf("Access Fee: $%.1f\n",accessfee);
        System.out.printf("Add-On Fee: $%.1f\n",addonfee);
        System.out.printf("Monthly Total: $%.1f\n",monthlytotal);
        System.out.printf("Contract Total: $%.1f\n",contracttotal);
        System.out.printf("Savings vs Month-to-Month: $%.1f\n",savings);
        System.out.printf("Membership Category: %s\n",membershipcategory);
        sc.close();
    }
}
