import java.util.Scanner;

public class array23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        int max=Integer.MIN_VALUE;
        int index1=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
                index1=i;
            }
        }
        double average=(double)total/(double)n;
        double threshold=average*0.9;
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                count1++;
            }
        }

        System.out.printf("Production Lines: %d\n",n);
        System.out.printf("Total Output: %d units\n",total);
        System.out.printf("Average Output: %.2f units/hour\n",average);
        System.out.printf("Top Producer: Line %d (%d units)\n",index1+1,max);
        System.out.printf("Underperforming Lines: %d\n",count1);
        System.out.printf("Performance Threshold: %.2f units\n",threshold);

        System.out.print("Priority Lines: [");
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
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
