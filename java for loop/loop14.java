import java.util.Scanner;

public class loop14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String booktype="0";
        int dayslate=0;
        double dailyfine=0;
        double calculatedfine=0;
        double actualfine=0;
        String capapplied="0";
        int bookoverdue=0;
        double totalfines=0;
        for(int i=1;i<=n;i++){
            booktype=sc.next();
            dayslate=sc.nextInt();
            if(booktype.equals("Regular")){
                dailyfine=0.50;
            }
            else if(booktype.equals("Reference")){
                dailyfine=1.00;
            }
            else if(booktype.equals("Magazine")){
                dailyfine=0.25;
            }
            calculatedfine=dayslate*dailyfine;
            if(booktype.equals("Regular")){
                if(calculatedfine>10){
                    actualfine=10;
                    // calculatedfine=actualfine;
                    capapplied="Yes";
                }
                else{
                    actualfine=calculatedfine;
                    capapplied="No";
                }
            }
            else if(booktype.equals("Reference")){
                if(calculatedfine>20){
                    actualfine=20;
                    capapplied="Yes";
                }
                else{
                    actualfine=calculatedfine;
                    capapplied="No";
                }
            }
            else if(booktype.equals("Magazine")){
                if(calculatedfine>5){
                    actualfine=5;
                    capapplied="Yes";
                }
                else{
                    actualfine=calculatedfine;
                    capapplied="No";
                }
            }
            if(dayslate>0){
                bookoverdue++;
            }
            totalfines=totalfines+actualfine;
            System.out.printf("Book %d: %s\n",i,booktype);
            System.out.printf("Days Late: %d\n",dayslate);
            System.out.printf("Daily Fine: $%.2f\n",dailyfine);
            System.out.printf("Calculated Fine: $%.2f\n",calculatedfine);
            System.out.printf("Actual Fine: $%.2f\n",actualfine);
            System.out.printf("Cap Applied: %s\n",capapplied);
        }
        double averagefine=totalfines/(double)n;
        System.out.printf("Total Books: %d\n",n);
        System.out.printf("Total Fines Collected: $%.2f\n",totalfines);
        System.out.printf("Books Overdue: %d\n",bookoverdue);
        System.out.printf("Average Fine: $%.2f\n",averagefine);
        sc.close();

    }
}
