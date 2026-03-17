import java.util.Scanner;

public class array07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxdefects=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxdefects){
                count++;
            }
        }
        System.out.printf("Production Lines: %d\n",n);
        System.out.printf("Acceptable Threshold: %d\n",maxdefects);
        System.out.printf("Lines Exceeding Threshold: %d\n",count);

        System.out.printf("Critical Lines: [");
        int printed=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxdefects){
                System.out.print(i+1);
                printed++;
                if(printed<count){
                    System.out.printf(",");
                }
            }
        }
        System.out.printf("]\n");

        double compilance=n-count;
        double rate=(compilance/(double)n)*100;
        System.out.printf("Compliance Rate: %.2f%%\n",rate);
        sc.close();
    }
}