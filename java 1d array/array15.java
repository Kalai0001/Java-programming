import java.util.Scanner;

public class array15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double total=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>300){
                count++;
            }
        }
        double average=total/(double)n;
        int target=n-count;
        double compilance=((double)target/(double)n)*100.00;

        System.out.printf("Total Calls: %d\n",n);
        System.out.printf("Average Handling Time: %.2f seconds\n",average);
        System.out.printf("Shortest Call: %d seconds\n",min);
        System.out.printf("Longest Call: %d seconds\n",max);
        System.out.printf("Calls Exceeding Target (300s): %d\n",count);
        System.out.printf("Target Compilance: %.2f%%\n",compilance);
        sc.close();
    }
}
