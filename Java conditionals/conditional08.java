import java.util.Scanner;
public class conditional08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String location=sc.nextLine();
        int squarefeet=sc.nextInt();
        int age=sc.nextInt();
        int amenityscore=sc.nextInt();
        int ageadjustment=0;
        double basevalue=0;
        double baseprice=0;
        double adjustedvalue=0;
        double finalvalue=0;
        sc.nextLine();
        String marketcategory="0";
        double abonus=0;
        //location//
        if(location.equals("Prime")){
            baseprice=400;
        }
        else if(location.equals("Urban")){
            baseprice=300;
        }
        else if(location.equals("Suburban")){
            baseprice=180;
        }
        else if(location.equals("Rural")){
            baseprice=100;
        }
        //age//
        if(age>=0 && age<=5){
            ageadjustment=0;
        }
        else if(age>=6 && age<=15){
            ageadjustment=-5;
        }
        else if(age>=16 && age<=30){
            ageadjustment=-15;
        }
        else if(age>=31){
            ageadjustment=-25;
        }
        //amenity bonus//
        basevalue=squarefeet*baseprice;

        if(amenityscore>=80 && amenityscore<=100){
            abonus=(10*basevalue)/100;
        }
        else if(amenityscore>=60 && amenityscore<=79){
            abonus=(5*basevalue)/100;
        }
        else if(amenityscore>=40 && amenityscore<=59){
            abonus=(2*basevalue)/100;
        }
        else if(amenityscore<40){
            abonus=(0*basevalue)/100;
        }

        adjustedvalue=basevalue*(1+ageadjustment/100);
        finalvalue=adjustedvalue+abonus;
        if(age<=15 && (location.equals("Prime"))|| (location.equals("Urban"))){
            marketcategory="Hot";
        }
        else if((age>15 && age<=30) && (location.equals("Suburban"))){
            marketcategory="Stable";
        }
        else if((age>30) && (location.equals("Rural"))){
            marketcategory="Slow";
        }
        System.out.printf("Location Tier: %s\n",location);
        System.out.printf("Square Footage: %d sq ft\n",squarefeet);
        System.out.printf("Property Age: %d years\n",age);
        System.out.printf("Amenity Score: %d\n",amenityscore);
        System.out.printf("Base Price Per Sq Ft: $%.1f\n",baseprice);
        System.out.printf("Age Adjustment: %d%%\n",ageadjustment);
        System.out.printf("Amenity Bonus: $%.1f\n",abonus);
        System.out.printf("Estimated Property Value: $%.1f\n",finalvalue);
        System.out.printf("Market Category: %s\n",marketcategory);
        sc.close();
    }
}
