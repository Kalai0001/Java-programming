import java.util.Scanner;

public class loop20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String transactiontype="0";
        double amount=0;
        String category="0";
        double totaldeposit=0;
        double totalwithdrawals=0;
        double totaltransfers=0;
        double totalpayments=0;
        for(int i=1;i<=n;i++){
            transactiontype=sc.next();
            amount=sc.nextDouble();
            if(transactiontype.equals("Deposit")){
                category="Credit";
                totaldeposit=totaldeposit+amount;
            }
            else if(transactiontype.equals("Withdrawal")){
                category="Debit";
                totalwithdrawals=totalwithdrawals+amount;
            }
            else if(transactiontype.equals("Transfer")){
                category="Debit";
                totaltransfers=totaltransfers+amount;
            }
            else if(transactiontype.equals("Payment")){
                category="Debit";
                totalpayments=totalpayments+amount;
            }
            System.out.printf("Transaction %d: %s\n",i,transactiontype);
            System.out.printf("Amount : $%.1f\n",amount);
            System.out.printf("Category : $%s\n",category);
            System.out.println();
        }
        double netbalance=totaldeposit-(totalwithdrawals+totaltransfers+totalpayments);
        System.out.printf("Total Transactions: %d\n",n);
        System.out.printf("Total Deposists: $%.1f\n",totaldeposit);
        System.out.printf("Total Withdrawals: $%.1f\n",totalwithdrawals);
        System.out.printf("Total Transfers: $%.1f\n",totaltransfers);
        System.out.printf("Total Payments: $%.1f\n",totalpayments);
        System.out.printf("Net Balance Change: $%.1f\n",netbalance);
        sc.close();
    }
}
