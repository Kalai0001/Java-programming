import java.util.Scanner;

public class array08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int total=0;
        int count=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>60){
                count++;
            }
        }
        double average=total/(double)n;
        double percent=n-count;
        double servicelevel=(percent/(double)n)*100;

        System.out.printf("Total Patients: %d\n",n);
        System.out.printf("Longest Wait Time: %d minutes\n",max);
        System.out.printf("Average Wait Time: %.2f minutes\n",average);
        System.out.printf("Patients Waiting >60 min: %d\n",count);
        System.out.printf("Service Level: %.2f%%\n",servicelevel);
        sc.close();
    }
}
