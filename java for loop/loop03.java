import java.util.Scanner;

public class loop03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String product="0";
        int currentstock=0;
        int minimumstock=0;
        int lowcount=0;
        int criticalcount=0;
        int totalreorderquantity=0;
        for(int i=1;i<=n;i++){
            product=sc.next();
            currentstock=sc.nextInt();
            minimumstock=sc.nextInt();

            String status="0";
            double reorder=0;
            //status//
            if(currentstock>=minimumstock){
                status="Adequate";
            }
            else if(currentstock<minimumstock && currentstock>=minimumstock/2){
                status="Low Stock";
                lowcount++;
            }
            else if(currentstock<minimumstock/2){
                status="Critical";
                criticalcount++;
            }
            //reorder//
            if(status.equals("Adequate")){
                reorder=0;
            }
            else if(status.equals("Low Stock")){
                reorder=(minimumstock-currentstock)+minimumstock/2;
            }
            else if(status.equals("Critical")){
                reorder=(minimumstock-currentstock)+(minimumstock*(1.5));
            }
            totalreorderquantity=totalreorderquantity+(int)reorder;

            System.out.printf("Product: %s\n",product);
            System.out.printf("Current Stock: %d\n",currentstock);
            System.out.printf("Minimum Stock: %s\n",minimumstock);
            System.out.printf("Status: %s\n",status);
            System.out.printf("Reorder Quantity: %d\n",(int)reorder);
        }
        int totalproducts=n;
        System.out.printf("Total Products: %d\n",totalproducts);
        System.out.printf("Low Stock Items: %d\n",lowcount);
        System.out.printf("Critical Items: %d\n",criticalcount);
        System.out.printf("Total Reorder Quantity: %d\n",totalreorderquantity);
        sc.close();
    }
}
