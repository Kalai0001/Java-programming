import java.util.Scanner;
public class conditional19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String movieformat=sc.nextLine();
        String showtime=sc.nextLine();
        String seatcategory=sc.nextLine();
        String customertype=sc.nextLine();
        double baseticketprice=12.0;
        double formatsurcharge=0;
        double seatupgradefee=0;
        int timebasedadjustment=0;
        int customerdiscount=0;
        String voucher="0";
        String pricecategory="0";
        if(movieformat.equals("2D")){
            formatsurcharge=8.0;
        }
        else if(movieformat.equals("3D")){
            formatsurcharge=5.0;
        }
        else if(movieformat.equals("IMAX")){
            formatsurcharge=8.0;
        }
        else if(movieformat.equals("4DX")){
            formatsurcharge=10.0;
        }
        if(seatcategory.equals("Standard")){
            seatupgradefee=0;
        }
        else if(seatcategory.equals("Premium")){
            seatupgradefee=4;
        }
        else if(seatcategory.equals("Recliner")){
            seatupgradefee=7;
        }

        if(showtime.equals("Matinee")){
            timebasedadjustment=-30;
            voucher="Yes";
        }
        else if(showtime.equals("Evening")){
            timebasedadjustment=0;
        }
        else if(showtime.equals("Prime-Time")){
            timebasedadjustment=+20;
        }
        else if(showtime.equals("Late-Night")){
            timebasedadjustment=-20;
        }

        if(customertype.equals("Adult")){
            customerdiscount=0;
            voucher="No";
        }
        else if(customertype.equals("Senior")){
            customerdiscount=25;
            voucher="Yes";
        }
        else if(customertype.equals("Student")){
            customerdiscount=15;
            voucher="Yes";
        }
        else if(customertype.equals("Child")){
            customerdiscount=30;
            voucher="No";
        }

        double basewithsurcharge=baseticketprice+formatsurcharge+seatupgradefee;
        double adjustedprice=basewithsurcharge*(1+timebasedadjustment*0.01);
        double finalprice=adjustedprice*(1-customerdiscount*0.01);


        if(finalprice<20){
            pricecategory="Value";
        }
        else if(finalprice>=20){
            pricecategory="Premium";
        }
        if(finalprice>=30){
            pricecategory="Luxury";
        }

        System.out.printf("Movie Format: %s\n",movieformat);
        System.out.printf("Show Time: %s\n",showtime);
        System.out.printf("Seat Category: %s\n",seatcategory);
        System.out.printf("Customer Type: %s\n",customertype);
        System.out.printf("Base TicketPrice: $%.1f\n",baseticketprice);
        System.out.printf("Format Surcharge: $%.1f\n",formatsurcharge);
        System.out.printf("Seat Upgrade Fee: $%.1f\n",seatupgradefee);
        System.out.printf("Time-Based Adjustment: %d%%\n",timebasedadjustment);
        System.out.printf("Customer Discount: %d%%\n",customerdiscount);
        System.out.printf("Final Ticket Price: $%.2f\n",finalprice);
        System.out.printf("Concession Voucher: %s\n",voucher);
        System.out.printf("Pricing Category: %s\n",pricecategory);
        sc.close();
    }

}