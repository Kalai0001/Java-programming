import java.util.Scanner;

public class array09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double total=0;
        double max=0;
        double min=1000000000;
        int indices1=0;
        int indices2=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
                indices1=i+1;
            }
            if(arr[i]<min){
                min=arr[i];
                indices2=i+1;
            }
        }
        double average=total/(double)n;
        System.out.printf("Total Stores: %d\n",n);
        System.out.printf("Highest Sales: $%.2f (Store %d)\n",max,indices1);
        System.out.printf("Lowest Sales: $%.2f (Store %d)\n",min,indices2);
        System.out.printf("Total Sales: $%.2f\n",total);
        System.out.printf("Average Sales: $%.2f",average);
        sc.close();
    }
}
