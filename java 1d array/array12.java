import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double consumption[]=new double[n];
        for(int i=0;i<n;i++){
            consumption[i]=sc.nextDouble();
        }
        double sum=0;
        double limit=sc.nextDouble();
        for(int i=0;i<n;i++){
            sum=sum+consumption[i];
        }
        double average=sum/n;
        double max=0;
        int indices=0;
        for(int i=0;i<n;i++){
            if(consumption[i]>max){
                max=consumption[i];
                indices=i;
            }
        }
        System.out.printf("Hours Monitored: %d\n",n);
        System.out.printf("Total Daily Consumption: %.2f kWh\n",sum);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)\n",indices+1,max);
        System.out.printf("Average Hourly: %.2f kWh\n",average);
        System.out.printf("Daily Limit: %.2f\n",limit);
        double difference=0;
        if(sum>limit){
            difference=sum-limit;
            System.out.printf("Status: Exceeded by %.2f kWh",difference);
        }
        else{
            System.out.println("Status: Within Limit");
        }
        sc.close();
    }
}
