import java.util.Scanner;

public class loop06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double initialbalance=sc.nextDouble();
        int n=sc.nextInt();
        double withdrawamount=0;
        double transaction=0;
        String status="0";
        String reason="0";
        double remainingbalance=0;
        int successfulwithdraccount=0;
        int failedwithdrawount=0;
    
        double transactionapproved=0;
        for(int i=1;i<=n;i++){
            withdrawamount=sc.nextDouble();
            transaction=withdrawamount;
            if(withdrawamount<=initialbalance){
                status="Approved";
                remainingbalance=initialbalance-withdrawamount;
                successfulwithdraccount++;
                transactionapproved=transaction+transactionapproved;
            }
            else{
                status="Denied";
                remainingbalance=initialbalance;
                reason="Insufficient funds";
                failedwithdrawount++;
            }

            initialbalance=remainingbalance;
            
            System.out.printf("Transaction %d: $%.1f\n",i,transaction);
            System.out.printf("Status: %s\n",status);
            if(status.equals("Denied")){
                System.out.printf("Reason: %s\n",reason);
            }
            System.out.printf("Remaining Balance: $%.1f\n",remainingbalance);
        }
        int totaltransaction=n;
        double finalbalance=initialbalance;
        System.out.printf("Total Transaction: %d\n",totaltransaction);
        System.out.printf("Successful Withdrawals: %d\n",successfulwithdraccount);
        System.out.printf("Failed Withdrawals: %d\n",failedwithdrawount);
        System.out.printf("Final Balance: $%.1f\n",finalbalance);
        System.out.printf("Total Withdrawn: $%.1f\n",transactionapproved);

        sc.close();
    }
}
