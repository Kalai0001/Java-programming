import java.util.Scanner;

public class array16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long total=0;
        long max=0;
        int indices=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
                indices=i;
            }
        }
        long average=total/n;
        double threshold=average*1.5;
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                count1++;
            }
        }
        System.out.printf("Trading Days Analyzed: %d\n",n);
        System.out.printf("Total Volume: %d\n",total);
        System.out.printf("Average Daily Volume: %d\n",average);
        System.out.printf("Peak Volume Day: Day %d (%d)\n",indices+1,max);
        System.out.printf("High Volume Days (>150%% avg): %d\n",count1);
        System.out.printf("Breakout Signal Days: [");
        int count2=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                System.out.print(i+1);
                count2++;
                if(count2<count1){
                System.out.print(", ");
                }
            }
        }
        System.out.printf("]");
        sc.close();
    }
}
