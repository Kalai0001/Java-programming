import java.util.Scanner;

public class array02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int threshold=sc.nextInt();
        int currentstock[]=new int[n];
        for(int i=0;i<n;i++){
            currentstock[i]=sc.nextInt();
        }
        int count=0;
        
        for(int i=0;i<n;i++){
            if(currentstock[i]<threshold){
                count++;
            }
        }
        System.out.printf("Total Products: %d\n",n);
        System.out.printf("Minimum Threshold: %d\n",threshold);
        System.out.printf("Low Stock Products: %d\n",count);
        
        System.out.print("Product indices: [");
        int printed = 0;
        for (int i=0; i<n;i++) {
            if(currentstock[i]<threshold){
                System.out.print(i);
                printed++;
                if (printed < count) {
                    System.out.print(",");
                }
            }
        }
        System.out.println("]");
        sc.close();
    }
}
