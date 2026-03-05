import java.util.Scanner;

public class loop19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String productid="0";
        String producttype="0";
        int monthsincepurchase=0;
        int warantyperiods=0;
        int remaining=0;
        String status="0";
        int activewarranties=0;
        int expiresoon=0;
        int expired=0;
        for(int i=1;i<=n;i++){
            productid=sc.next();
            producttype=sc.next();
            monthsincepurchase=sc.nextInt();

            if(producttype.equals("Electronics")){
                warantyperiods=12;
            }
            else if(producttype.equals("Appliance")){
                warantyperiods=24;
            }
            else if(producttype.equals("Computer")){
                warantyperiods=36;
            }
            if(warantyperiods>monthsincepurchase){
                remaining=warantyperiods-monthsincepurchase;
            }else{
                remaining=0;
            }
            if(remaining==0){
                status="Expired";
                expired++;
            }
            else if(remaining>=1 && remaining<=3){
                status="Expiring Soon";
                expiresoon++;
            }
            if(remaining>3){
                status="Active";
                activewarranties++;
            }
            System.out.printf("Product ID: %s\n",productid);
            System.out.printf("Type: %s\n",producttype);
            System.out.printf("Warranty Periods: %d months\n",warantyperiods);
            System.out.printf("Months Used: %d\n",monthsincepurchase);
            System.out.printf("Remaining: %d months\n",remaining);
            System.out.printf("Status: %s\n",status);
            System.out.println();
        }
        System.out.printf("Total Products: %d\n",n);
        System.out.printf("Active Warranties: %d\n",activewarranties);
        System.out.printf("Expiring Soon: %d\n",expiresoon);
        System.out.printf("Expired Warranties: %d\n",expired);
        sc.close();
    }
}
