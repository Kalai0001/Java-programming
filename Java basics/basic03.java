import java.util.Scanner;
public class basic03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sales=sc.nextInt();
        int discount=sc.nextInt();
        int gst=sc.nextInt();

        float discountprice=(sales*discount)/100;
        float salesprice=sales-discountprice;
        float gstprice=(salesprice*gst)/100;

        float revenue=salesprice+gstprice;
        System.out.printf("Final Revenue = %.1f",revenue);

        sc.close();
    }
}
