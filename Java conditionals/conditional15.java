import java.util.Scanner;
public class conditional15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int usercount=sc.nextInt();
        sc.nextLine();
        String licensetype=sc.nextLine();
        String supportlevel=sc.nextLine();
        int contractyears=sc.nextInt();

        double baseprice=0;
        int volumediscount=0;
        double supportfee=0;
        int multiyeardiscount=0;
        String pricetier="0";

        if(licensetype.equals("Standard")){
            baseprice=60;
        }
        else if(licensetype.equals("Professional")){
            baseprice=120;
        }
        else if(licensetype.equals("Enterprise")){
            baseprice=200;
        }

        if(usercount>=1 && usercount<=50){
            volumediscount=0;
        }
        else if(usercount>=51 && usercount<=200){
            volumediscount=15;
        }
        else if(usercount>=201 && usercount<=500){
            volumediscount=20;
        }
        else if(usercount>=501 && usercount<=1000){
            volumediscount=25;
        }
        else if(usercount>=1001){
            volumediscount=35;
        }
        
        if(supportlevel.equals("Basic")){
            supportfee=10;
        }
        else if(supportlevel.equals("Priority")){
            supportfee=30;
        }
        else if(supportlevel.equals("Premium")){
            supportfee=80;
        }

        if(contractyears==1){
            multiyeardiscount=0;
        }
        else if(contractyears==2){
            multiyeardiscount=5;
        }
        else if(contractyears==3){
            multiyeardiscount=10;
        }
        else if(contractyears==5){
            multiyeardiscount=20;
        }

        double discountedbase=baseprice*(1-volumediscount*0.01);
        double annualperuser=(discountedbase+supportfee)*(1-multiyeardiscount*0.01);
        double totalannual=annualperuser*usercount;
        double contractvalue=totalannual*contractyears;

        if(usercount<200){
            pricetier="Small Business";
        }
        else if(usercount>=200 && usercount<1000){
            pricetier="Mid-Market";
        }
        else if (usercount>=1000){
            pricetier="Enterprise";
        }
        System.out.printf("User Count: %d\n",usercount);
        System.out.printf("License Type: %s\n",licensetype);
        System.out.printf("Support Level: %s\n",supportlevel);
        System.out.printf("Contract Duration: %d years\n",contractyears);
        System.out.printf("Base Price Per User: $%.1f\n",baseprice);
        System.out.printf("Volume Discount: %d%%\n",volumediscount);
        System.out.printf("Support Fee Per User: $%.1f\n",supportfee);
        System.out.printf("Multi-Year Discount: %d%%\n",multiyeardiscount);
        System.out.printf("Annual Cost Per User: $%.1f\n",annualperuser);
        System.out.printf("Total Annual Cost: $%.1f\n",totalannual);
        System.out.printf("Total Contract Value: $%.1f\n",contractvalue);
        System.out.printf("Pricing Tier: %s\n",pricetier);
        sc.close();
    }
}
