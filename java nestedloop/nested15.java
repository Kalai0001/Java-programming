import java.util.Scanner;

public class nested15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int products=sc.nextInt();
        double totalrating=0;
        System.out.println("Star Rating Matrix:");
        System.out.println("Product Rating Stars");
        for(int i=1;i<=products;i++){
            String productname=sc.next();
            System.out.printf("%s",productname);
            double rating=sc.nextDouble();
            System.out.printf(" %.1f",rating);
            int fullstars=(int)rating;
            totalrating=totalrating+rating;
            for(int j=1;j<=5;j++){
                if(j<=fullstars){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" -");
                }
            }
            System.out.println();
        }
        double total=totalrating/products;
        System.out.println();
        System.out.printf("Average Rating: %.2f",total);
        sc.close();
    }
}
