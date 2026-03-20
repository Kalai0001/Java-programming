import java.util.Scanner;

public class array18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        int max=0;
        int indice=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
                indice=i;
            }
        }
        double average=(double)total/(double)n;
        double threshold=average*0.5;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                count++;
            }
        }

        System.out.printf("Total Products: %d\n",n);
        System.out.printf("Total Units Sold: %d\n",total);
        System.out.printf("Average Monthly Sales: %.2f\n",average);
        System.out.printf("Better Seller: Product %d (%d units)\n",indice+1,max);
        System.out.printf("Slow-Moving Products: %d\n",count);
        System.out.printf("Turnover Threshold: %.2f units\n",threshold);

        System.out.printf("Clearance Candidates: [");
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                System.out.print(i+1);
                count2++;
                if(count2<count){
                System.out.print(", ");
                }
            }
        }
        System.out.printf("]");
        sc.close();
    }
}
