import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double total=0;
        int max=0;
        int min=1000000000;
        int count=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>200){
                count++;
            }
        }
        double average=total/(double)n;
        double score=(double)n-(double)count;
        double performance=(score/(double)n)*100;
        System.out.printf("Total Servers: %d\n",n);
        System.out.printf("Fastest Response: %dms\n",min);
        System.out.printf("Slowest Response: %dms\n",max);
        System.out.printf("Average Response: %.2fms\n",average);
        System.out.printf("Slow Servers(>200ms): %d\n",count);
        System.out.printf("Performance Score: %.2f%%\n",performance);
        sc.close();
    }
}
