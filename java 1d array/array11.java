import java.util.Scanner;
class array11{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double quantity[]=new double[n];
        double price[]=new double[n];
        
        for(int i=0;i<n;i++){
            quantity[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            price[i]=sc.nextDouble();
        }
        int k=0;
        double value[]=new double[n];
        double max=0;
        double min=Double.MAX_VALUE;
        int indices1=0;
        int indices2=0;
        for(int i=0;i<n;i++){
            value[k]=quantity[i]*price[i];
            if(value[k]>max){
                max=value[k];
                indices1=i;
            }
            if(value[k]<min){
                min=value[k];
                indices2=i;
            }
            k++;
        }
        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+value[i];
        }
        System.out.printf("Number of Assets: %d\n",n);
        System.out.printf("Total Portfolio Value: $%.2f\n",sum);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)\n",indices1+1,max);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)\n",indices2+1,min);
        sc.close();
    }
}