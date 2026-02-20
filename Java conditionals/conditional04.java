import java.util.Scanner;
public class conditional04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String loyaltier=sc.nextLine();
        double cartvalue=sc.nextDouble();
        sc.nextLine();
        String product=sc.nextLine();
        String membership=sc.nextLine();
        int basediscount=0;
        int discount=0,additionaldiscount=0;
        if(loyaltier.equals("Bronze")&&cartvalue<500){
            basediscount=5;
        }
        else if(loyaltier.equals("Bronze")){
            basediscount=15;
        }
        else if(loyaltier.equals("Silver")){
            basediscount=8;
        }
        else if(loyaltier.equals("Gold")){
            basediscount=12;
        }
        else if(loyaltier.equals("Platinum")){
            basediscount=15;
        }
        //additional discount;
        if(cartvalue>=500&&cartvalue<=999){
            discount=3;
        }
        else if(cartvalue>=1000 && cartvalue<=1999){
            discount=5;
        }
        else if(cartvalue>=2000){
            discount=7;
        }
        //bonus discount
        if(membership.equals("Prime")&&product.equals("Electronics")){
            additionaldiscount=discount+5;
        }
        else if(product.equals("Fashion")){
            additionaldiscount=discount+3;
        }
        else if(membership.equals("Prime")&&product.equals("Books")){
            additionaldiscount=discount+5;
        }
        else if(product.equals("Groceries")&&cartvalue>300){
            additionaldiscount=discount+2;
        }
        ///////////////////
        int totaldiscount=basediscount+additionaldiscount;
        double price=(cartvalue*totaldiscount)/100;
        double finalprice=cartvalue-price;
        

        System.out.printf("Loyalty Tier: %s\n",loyaltier);
        System.out.printf("Cart Value: %.1f\n",cartvalue);
        System.out.printf("Product Category: %s\n",product);
        System.out.printf("Membership: %s\n",membership);
        System.out.printf("Base Discount: %d%%\n",basediscount);
        System.out.printf("Additional Discount: %d%%\n",additionaldiscount);
        System.out.printf("Total Discount: %d%%\n",totaldiscount);
        System.out.printf("Final Price: $%.1f\n",finalprice);
        System.out.printf("Savings: $%.1f\n",price);
        sc.close();
    }
}
