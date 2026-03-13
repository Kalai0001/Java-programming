import java.util.Scanner;

public class nested10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int products=sc.nextInt();
        int vendor=sc.nextInt();
        
    
        System.out.println("Price Comparison Matrix:");
        System.out.print("Product"+" ");
        for(int i=1;i<=vendor;i++){
            System.out.printf("Vendor %d ",i);
        }
        System.out.print("BestPrice");
        System.out.println();
        // double min=0;
        for(int i=1;i<=products;i++){
            String productname=sc.next();
            System.out.printf("%s ",productname," ");
            double min=100000000;
            for(int j=1;j<=vendor;j++){
                double price=sc.nextDouble();
                System.out.printf("%.2f ",price);
                if(price<min){
                    min=price;
                }
                
            }
            System.out.printf("%.2f",min);
            System.out.println();
        }
        sc.close();
        }
        
    }