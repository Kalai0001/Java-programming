import java.util.Scanner;

public class loop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String seattype="0";
        String customertype="0";
        double baseprice=0;
        int discount=0;
        double finalprice=0;
        double totalbaseprice=0;
        int totaldiscount=0;
        double finaltotal=0;
        String groupdiscount="0";
        int totaltickets=0;
        double totaltotaldiscount=0;
        for(int i=1;i<=n;i++){
            seattype=sc.next();
            customertype=sc.next();
            if(seattype.equals("Regular")){
                baseprice=12;
            }
            else if(seattype.equals("Premium")){
                baseprice=18;
            }
            else if(seattype.equals("Recliner")){
                baseprice=25;
            }

            if(customertype.equals("Adult")){
                discount=0;
            }
            else if(customertype.equals("Child")){
                discount=30;
            }
            else if(customertype.equals("Senior")){
                discount=25;
            }
            finalprice=baseprice*(1-(discount*0.01));
            totaltickets=n;
            totalbaseprice=totalbaseprice+baseprice;
            totaldiscount=totaldiscount+discount;
            finaltotal=finaltotal+finalprice;
            // if(n>=5){
            //     finaltotal=finaltotal-(0.1*finaltotal);
            //     groupdiscount="Yes";
            // }
            // else{
            //     groupdiscount="No";
            // }
            // totaltotaldiscount=totalbaseprice-finaltotal;
            
            System.out.printf("Ticket %d: %s - %s\n",i,seattype,customertype);
            System.out.printf("Base Price: $%.1f\n",baseprice);
            System.out.printf("Discount: $%d%%\n",discount);
            System.out.printf("Final Price: $%.1f\n",finalprice);
        }
        if(n>=5){
            finaltotal=finaltotal-(0.1*finaltotal);
            groupdiscount="Yes";
        }
        else{
            groupdiscount="No";
        }
        totaltotaldiscount=totalbaseprice-finaltotal;
        System.out.printf("Total Tickets: $%d\n",totaltickets);
        System.out.printf("Original Total: $%.1f\n",totalbaseprice);
        System.out.printf("Total Discount: $%.1f\n",totaltotaldiscount);
        System.out.printf("Final Total: $%.1f\n",finaltotal);
        System.out.printf("Group Discount Applied: %s\n",groupdiscount);
        sc.close();
    }
}
