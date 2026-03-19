import java.util.Scanner;

public class array14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double tons[]=new double[n];
        for(int i=0;i<n;i++){
            tons[i]=sc.nextDouble();
        }
        double sum=0;
        double max=0;
        int indices1=0;
        for(int i=0;i<n;i++){
            sum=sum+tons[i];
            if(tons[i]>max){
                max=tons[i];
                indices1=i;
            }
        }
        double average=sum/(double)n;
        int underperforming=0;

        double performace=average*0.8;
        for(int i=0;i<n;i++){
            if(tons[i]<performace){
                underperforming++;
            }
        }

        System.out.printf("Total Plots: %d\n",n);
        System.out.printf("Total Harvest: %.2f tons\n",sum);
        System.out.printf("Average Yield: %.2f tons/acre\n",average);
        System.out.printf("Highest Yield: %.2f tons/acre (Plot %d)\n",max,indices1+1);
        System.out.printf("Underperforming Plots: %d\n",underperforming);
        System.out.printf("Performance Threshold: %.2f tons/acre\n",performace);
        sc.close();
    }
}
