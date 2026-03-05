import java.util.Scanner;

public class loop17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String membername="0";
        String membershiptype="0";
        int daysunitexpire=0;

        double renewalfees=0;
        int discount=0;
        String priority="0";
        double finalfee=0;
        int urgentcount=0;
        double totalrevenue=0;
        for(int i=1;i<=n;i++){
            membername=sc.next();
            membershiptype=sc.next();
            daysunitexpire=sc.nextInt();
            if(membershiptype.equals("Basic")){
                renewalfees=50;
            }
            else if(membershiptype.equals("Premium")){
                renewalfees=100;
            }
            else if(membershiptype.equals("VIP")){
                renewalfees=200;
            }
            
            if(daysunitexpire<15){
                discount=0;
            }
            else if(daysunitexpire>=15 && daysunitexpire<=29){
                discount=10;
            }
            else if(daysunitexpire>=30 && daysunitexpire<=44){
                discount=15;
            }
            else if(daysunitexpire>=45){
                discount=20;
            }

            if(daysunitexpire<10){
                priority="Urgent";
                urgentcount++;
            }
            else if(daysunitexpire>=10 && daysunitexpire<=30){
                priority="High";
            }
            else if(daysunitexpire>30){
                priority="Normal";
            }
            finalfee=renewalfees*(1-((double)discount*0.01));
            totalrevenue=totalrevenue+finalfee;
            System.out.printf("Member: %s\n",membername);
            System.out.printf("Membership: %s\n",membershiptype);
            System.out.printf("Days Until Expiry: %d\n",daysunitexpire);
            System.out.printf("Renewal Fee: $%.1f\n",renewalfees);
            System.out.printf("Discount: %d%%\n",discount);
            System.out.printf("Final Fee: $%.1f\n",finalfee);
            System.out.printf("Priority: %s\n",priority);
            System.out.println();
        
        }
        double average=totalrevenue/n;
        System.out.printf("Total Members: %d\n",n);
        System.out.printf("Urgent Renewals: %d\n",urgentcount);
        System.out.printf("Total Renewal Revenue: $%.1f\n",totalrevenue);
        System.out.printf("Average Renewal Fee: $%.1f\n",average);
        sc.close();
    }
}
