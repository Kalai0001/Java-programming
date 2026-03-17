import java.util.Scanner;

public class array05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double price[]=new double[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextDouble();
        }
        double max=-100000000;
        double min=1000000000;
        
        for(int i=0;i<n;i++){
            if(price[i]>max){
                max=price[i];
            }
            if(price[i]<min){
                min=price[i];
            }
        }
        
        double range=max-min;
        double Average=(range/max)*100;
        System.out.printf("Number of Sellers: %d\n",n);
        System.out.printf("Lowest Price: $%.2f\n",min);
        System.out.printf("Highest Price: : $%.2f\n",max);
        System.out.printf("Price Difference: $%.2f\n",range);
        System.out.printf("Savings: %.2f%%\n",Average);
        sc.close();
    }
}
