import java.util.Scanner;

public class array04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double temp[]=new double[n];
        for(int i=0;i<n;i++){
            temp[i]=sc.nextDouble();
        }
        double max=-100000000;
        double min=1000000000;
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+temp[i];
            if(temp[i]>max){
                max=temp[i];
            }
            if(temp[i]<min){
                min=temp[i];
            }
        }
        
        double range=max-min;
        double Average=sum/(double)n;
        System.out.printf("Number of Readings: %d\n",n);
        System.out.printf("Maximum Temperature: : %.2f C\n",max);
        System.out.printf("Minimum Temperature: : %.2f C\n",min);
        System.out.printf("Temperature Range: %.2f C\n",range);
        System.out.printf("Average Temperature: %.2f C\n",Average);

        sc.close();
    }
}
