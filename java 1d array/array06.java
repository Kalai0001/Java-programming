import java.util.Scanner;

public class array06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double transaction[]=new double[n];
        for(int i=0;i<n;i++){
            transaction[i]=sc.nextDouble();
        }
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+transaction[i];
        }
        double average=sum/(double)n;
        int count=0;
        for(int i=0;i<n;i++){
            if(transaction[i]>average){
                count++;
            }
        }
        System.out.printf("Total Transactions: %d\n",n);
        System.out.printf("Average Transaction: $%.2f\n",average);
        System.out.printf("Suspicious Transactions: %d\n",count);

        System.out.printf("Fraud Alert Indices: [");
        int printed=0;
        for(int i=0;i<n;i++){
            if(transaction[i]>average){
                System.out.print(i);
                printed++;
                if(printed<count){
                    System.out.printf(",");
                }
            }
        }
        System.out.printf("]");
        sc.close();
    }
}
