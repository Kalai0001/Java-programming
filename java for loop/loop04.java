import java.util.Scanner;

public class loop04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String repname="0";
        double salesamount=0;   
        double max=0;
        String topperformer="0";
        double totalsales=0;
        double totalcommission=0;
        for(int i=1;i<=n;i++){
            repname=sc.next();
            salesamount=sc.nextDouble();

            int commissionrate=0;
            double bonus=0;
            // double totalsales=0;
            // double totalcommission=0;
            if(salesamount>=0 && salesamount<=40000){
                commissionrate=5;
            }
            else if(salesamount>40000 && salesamount<=80000){
                commissionrate=8;
            }
            else if(salesamount>80000 && salesamount<=100000){
                commissionrate=10;
            }
            else if(salesamount>10000 && salesamount<=150000){
                commissionrate=12;
            }
            else if(salesamount>150000){
                commissionrate=15;
            }

            double commissionearned=salesamount*(commissionrate*0.01);
            if(salesamount>=100000 && salesamount<=149000){
                bonus=2000;
            }
            else if(salesamount>=1500000){
                bonus=3000;
            }

            if(salesamount>max){
                max=salesamount;
                topperformer=repname;
            }
            double totalpayout=commissionearned+bonus;
            totalsales=totalsales+salesamount;
            totalcommission=totalcommission+commissionearned;
            System.out.printf("Sales Rep: %s\n",repname);
            System.out.printf("Sales Amount: $%.1f\n",salesamount);
            System.out.printf("Commission Rate: %d%%\n",commissionrate);
            System.out.printf("Commission Earned: $%.1f\n",commissionearned);
            System.out.printf("Bonus: $%.1f\n",bonus);
            System.out.printf("Total Payout: $%.1f\n",totalpayout);
        }
        int totalsalesreps=n;
        System.out.printf("Total Sales Reps: %d\n",totalsalesreps);
        System.out.printf("Total Sales: $%.1f\n",totalsales);
        System.out.printf("Total Commissions: $%.1f\n",totalcommission);
        System.out.printf("Top Performer: %s\n",topperformer);
        sc.close();
    }
}
