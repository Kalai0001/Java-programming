import java.util.Scanner;

public class loop08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String productname="0";
        double price=0;
        int quantity=0;
        int discount=0;
        double subtotal=0;
        int totalitems=0;
        double originaltotal=0;
        double total=0;
        double sumoforiginaltotal=0;
        for(int i=1;i<=n;i++){
            productname=sc.next();
            price=sc.nextDouble();
            quantity=sc.nextInt();


            
            if(quantity==1){
                discount=0;
            }
            else if(quantity>=2 && quantity<=4){
                discount=10;
            }
            else if(quantity>=5 && quantity<=9){
                discount=15;
            }
            else if(quantity>=10){
                discount=20;
            }

            subtotal=price*(double)quantity*(1-(discount*0.01));
            totalitems=totalitems+quantity;
            total=total+subtotal;
            ////////
            originaltotal=price*quantity;
            sumoforiginaltotal=sumoforiginaltotal+originaltotal;
            originaltotal=0;
            //////////////////
            System.out.printf("Product: %s\n",productname);
            System.out.printf("Unit Price: $%.1f\n",price);
            System.out.printf("Quantity: %d\n",quantity);
            System.out.printf("Discount: %d%%\n",discount);
            System.out.printf("Subtotal: $%.1f\n",subtotal);
        }
        
        double totaldiscount=sumoforiginaltotal-total;
        double savings=(totaldiscount/sumoforiginaltotal)*100;
        /////////////////////////
        System.out.printf("Total Items: %d\n",totalitems);
        System.out.printf("Original Total: $%.1f\n",sumoforiginaltotal);
        System.out.printf("Total Discount: $%.1f\n",totaldiscount);
        System.out.printf("Final Total: $%.2f\n",total);
        System.out.printf("Savings: %.2f%%\n",savings);
        sc.close();
    }
}
