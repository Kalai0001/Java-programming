import java.util.Scanner;

public class loop10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String itemname="0";
        double price=0;
        int quantity=0;
        double subtotal=0;
        int totalitems=0;
        double totalsubtotal=0;
        for(int i=1;i<=n;i++){
            itemname=sc.next();
            price=sc.nextDouble();
            quantity=sc.nextInt();

            subtotal=price*quantity;
            totalitems=totalitems+quantity;
            totalsubtotal=totalsubtotal+subtotal;
            System.out.printf("Item: %s\n",itemname);
            System.out.printf("Price: $%.1f x %d\n",price,quantity);
            System.out.printf("Subtotal: $%.1f\n",subtotal);
        }
        double tax=totalsubtotal*0.08;
        double servicecharge=totalsubtotal*0.10;
        double grandtotal=totalsubtotal+tax+servicecharge;
        System.out.printf("Total Items: %d\n",totalitems);
        System.out.printf("Subtotal: $%.1f\n",totalsubtotal);
        System.out.printf("Tax(8%%): $%.2f\n",tax);
        System.out.printf("Service Charge(10%%): $%.2f\n",servicecharge);
        System.out.printf("Grand Total: $%.2f\n",grandtotal);
        sc.close();
    }
}
