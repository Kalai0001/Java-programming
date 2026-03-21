import java.util.Scanner;

public class array25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        int max=Integer.MIN_VALUE;int index1=0;
        int min=Integer.MAX_VALUE;int index2=0;
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
        double threats=average*2.0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]>threats){
                count1++;
            }
        }

        System.out.printf("Security Events Analyzed: %d\n",n);
        System.out.printf("Average Risk Score: %.2f\n",average);
        System.out.printf("Highest Risk Event: %d (Events %d)\n",max,index1+1);
        System.out.printf("Lowest Risk Event: %d (Events %d)\n",min,index2+1);
        System.out.printf("Critical Threats (>200%% avg): %d\n",count1);
        System.out.printf("Threat Threshold: %.2f\n",threats);

        System.out.print("Alert Events: [");
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]>threats){
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
