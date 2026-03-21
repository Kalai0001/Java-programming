import java.util.Scanner;

public class array21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double total=0;

        double max=arr[0];
        int index1=0;
        double min=Double.MAX_VALUE;
        int index2=0;
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
        double average=(double)total/(double)n;
        double threshold=average*0.8;
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                count1++;
            }
        }
        
        System.out.printf("Fleet Size: %d\n",n);
        System.out.printf("Average Fuel Efficiency: %.2f MPG\n",average);
        System.out.printf("Most Efficient: %.2f MPG (Vehicle %d)\n",max,index1+1);
        System.out.printf("Least Efficient: %.2f MPG (Vehicle %d)\n",min,index2+1);
        System.out.printf("Underperforming Vehicles: %d\n",count1);
        System.out.printf("Efficiency Threshold: %.2f MPG\n",threshold);

        System.out.printf("Maintenance Priority: [");
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                System.out.print(i+1);
                count2++;
                if(count2<count1){
                    System.out.printf(", ");
                }
            }
        }
        System.out.printf("]");
        sc.close();
    }
}
