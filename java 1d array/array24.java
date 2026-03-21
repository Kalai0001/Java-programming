import java.util.Scanner;

public class array24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double total=0;
        double max=Double.MIN_VALUE;int index1=0;
        double min=Double.MAX_VALUE;int index2=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
                index1=i;
            }
            if(arr[i]<min){
                min=arr[i];
                index2=i;
            }
        }
        double average=total/(double)n;
        double bargain=average*0.7;
        int count1=0;
        double premium=average*1.5;
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]<bargain){
                count1++;
            }
            if(arr[i]>premium){
                count2++;
            }
        }

        System.out.printf("Total Properties: %d\n",n);
        System.out.printf("Portfolio Value: $%.2f\n",total);
        System.out.printf("Average Property Value: $%.2f\n",average);
        System.out.printf("Most Valuable: $%.2f (Property %d)\n",max,index1+1);
        System.out.printf("Least Valuable: $%.2f (Property %d)\n",min,index2+1);
        System.out.printf("Bargain Properties (<70%% avg): %d\n",count1);
        System.out.printf("Premium Properties (>150%% avg): %d\n",count2);
        sc.close();
    }
}
