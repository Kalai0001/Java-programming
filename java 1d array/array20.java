import java.util.Scanner;

public class array20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;

        int max=arr[0];
        int index1=0;
        int min=Integer.MAX_VALUE;
        int index2=0;

        int count=0;
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
            if(arr[i]<60){
                count++;
            }
        }
        double average=(double)total/(double)n;
        double success_rate=(((double)n-(double)count)/(double)n)*100.00;

        System.out.printf("Total Students: %d\n",n);
        System.out.printf("Average Completion: %.2f%%\n",average);
        System.out.printf("Highest Completion: %d%% (Student %d)\n",max,index1+1);
        System.out.printf("Lowest Completion: %d%% (Student %d)\n",min,index2+1);
        System.out.printf("At-Risk Students (<60%%): %d\n",count);
        System.out.printf("Success Rate: %.2f%%\n",success_rate);
        sc.close();
    }
}
