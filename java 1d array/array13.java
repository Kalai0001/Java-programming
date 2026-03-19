import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int n=sc.nextInt();
        int minutes[]=new int[n];
        for(int i=0;i<n;i++){
            minutes[i]=sc.nextInt();
        }
        int sum=0;
        int maxdelay=0;
        int max=0;
        int compensation=0;
        for(int i=0;i<n;i++){
            sum=sum+minutes[i];
            if(minutes[i]>maxdelay){
                maxdelay=minutes[i];
            }
            if(minutes[i]<15){
                max++;
            }
            if(minutes[i]>180){
                compensation++;
            }
        }
        double average=sum/n;
        double rate=(double)max/(double)n;
        double performance=rate*100.00;
        System.out.printf("Total Flights: %d\n",n);
        System.out.printf("Average Delay: %.2f minutes\n",average);
        System.out.printf("Maximum Delay: %d minutes\n",maxdelay);
        System.out.printf("On-Time Flights: %d\n",max);
        System.out.printf("Compensation Required: %d\n",compensation);
        System.out.printf("On-Time Performance: %.2f%%\n",performance);
        sc.close();
    }
}
