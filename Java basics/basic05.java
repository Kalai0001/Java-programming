import java.util.Scanner;
public class basic05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalbill=sc.nextInt();
        int service=sc.nextInt();
        int gst=sc.nextInt();
        int people=sc.nextInt();

        double servicepercent=(totalbill*service)/100.0;
        double gstpercent=(totalbill*gst)/100.0;
        double eachpay=totalbill+servicepercent+gstpercent;
        double total=eachpay/people;

        System.out.printf("Amount per person = %.1f",total);
        sc.close();
    }
}
