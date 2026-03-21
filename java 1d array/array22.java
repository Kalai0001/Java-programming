import java.util.Scanner;

public class array22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double total=0;
        double max=Double.MIN_VALUE;
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
        double average=total/(double)n;
        double viralpost=average*2.0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]>viralpost){
                count1++;
            }
        }

        System.out.printf("Total Posts: %d\n",n);
        System.out.printf("Average Engagement: %.2f\n",average);
        System.out.printf("Peak Engagement: %.2f%% (Post %d)\n",max,index1+1);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)\n",min,index2+1);
        System.out.printf("Viral Posts (>200%% avg): %d\n",count1);
        System.out.printf("Viral Threshold: %.2f%%\n",viralpost);


        System.out.print("Top Performers: [");
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]>viralpost){
                System.out.print(i+1);
                count2++;
                if(count2<count1){
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");
        sc.close();
    }
}
