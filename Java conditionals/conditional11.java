import java.util.Scanner;
public class conditional11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ordertype=sc.nextLine();
        String loyaltystatus=sc.nextLine();
        double ordervalue=sc.nextDouble();
        sc.nextLine();
        String timeslot=sc.nextLine();

        int basediscount=0;
        int timebasedadjustment=0;
        double servicefee=0;
        double discountvalue=0;
        double finalamount=0;
        String kitchenpriority="0";
        int estimatedpreptime=0;
        int preptime=estimatedpreptime;

        if(loyaltystatus.equals("Gold")){
            basediscount=15;
        }
        else if(loyaltystatus.equals("Silver")){
            basediscount=10;
        }
        else if(loyaltystatus.equals("Bronze")){
            basediscount=5;
        }
        else if(loyaltystatus.equals("None")){
            basediscount=0;
        }

        if(timeslot.equals("Peak")){
            timebasedadjustment=0;
            kitchenpriority="High";
        }
        else if(timeslot.equals("Regular")){
            timebasedadjustment=0;
            kitchenpriority="Medium";
        }
        else if(timeslot.equals("Late-Night")){
            timebasedadjustment=-5;
            kitchenpriority="Low";
        }

        if(ordertype.equals("Delivery")){
            servicefee=0.10*ordervalue;
        }
        else if(ordertype.equals("Takeout")){
            servicefee=0.03*ordervalue;
        }
        else if(ordertype.equals("Dine-In")){
            servicefee=0;
        }

        if(ordertype.equals("Delivery")){
            if(loyaltystatus.equals("Gold")){
                if(kitchenpriority.equals("High")){
                    preptime=25;
                }
            }
            else if(loyaltystatus.equals("Bronze")){
                if(kitchenpriority.equals("High")){
                    preptime=30;
                }
            }
        }
        else if(ordertype.equals("Takeout")){
            if(loyaltystatus.equals("Silver")){
                if(kitchenpriority.equals("Low")){
                    preptime=15;
                }
            }
        }
        else if(ordertype.equals("Dine-In")){
            if(loyaltystatus.equals("None")){
                if(kitchenpriority.equals("Medium")){
                    preptime=20;
                }
            }
            else if(loyaltystatus.equals("Gold")){
                if(kitchenpriority.equals("Medium")){
                    preptime=25;
                }
            }
        }


        int totaldiscount=basediscount+timebasedadjustment;
        discountvalue=ordervalue*(1-totaldiscount*(0.01));
        finalamount=discountvalue+servicefee;

        System.out.printf("Order Type: %s\n",ordertype);
        System.out.printf("Loyalty Status: %s\n",loyaltystatus);
        System.out.printf("Order Value: $%.1f\n",ordervalue);
        System.out.printf("Time Slot: %s\n",timeslot);
        System.out.printf("Base Discount: %d%%\n",basediscount);
        System.out.printf("Time-Based Adjustment: %d%%\n",timebasedadjustment);
        System.out.printf("Service Fee: $%.1f\n",servicefee);
        System.out.printf("Final Amount: $%.2f\n",finalamount);
        System.out.printf("Kitchen Priority: %s\n",kitchenpriority);
        System.out.printf("Estimated Prep Time: %d minutes\n",preptime);
        sc.close();
    }
}
