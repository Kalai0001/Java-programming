import java.util.Scanner;

public class array17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        double total=0;
        double max=0;
        double min=Double.MAX_VALUE;
        int unsafecount=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]<6.5||arr[i]>8.5){
                unsafecount++;
            }
        }
        double average=total/(double)n;
        double compilance=(((double)n-(double)unsafecount)/(double)n)*100.00;

        System.out.printf("Total Samples: %d\n",n);
        System.out.printf("Average pH: %.2f\n",average);
        System.out.printf("Minimum pH: %.2f\n",min);
        System.out.printf("Maximum pH: %.2f\n",max);
        System.out.printf("Unsafe Samples: %d\n",unsafecount);
        System.out.printf("Safety Compilance: %.2f%%\n",compilance);

        System.out.printf("Critical Alerts: [");
        int count2=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]<6.5||arr[i]>8.5){
                System.out.print(i+1);
                count2++;
                if(count2<unsafecount){
                System.out.print(", ");
                }
            }
        }
        System.out.printf("]");
        sc.close();
    }
}
