import java.util.*;
public class conditional09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double annualrevenue=sc.nextDouble();
        sc.nextLine();
        String business=sc.nextLine();
        double deductibleexpense=sc.nextDouble();
        double taxcredits=sc.nextDouble();
        int taxrate=0;
        double grosstax=0;
        double nettax=0;
        double effectiverate=0;
        double taxableincome=annualrevenue-deductibleexpense;
        if(business.equals("LLC")){
            business="LLC";
            if(taxableincome<=200000){
                taxrate=15;
            }
            else if(taxableincome>200000 && taxableincome<=500000){
                taxrate=18;
            }
            else if(taxableincome>500000){
                taxrate=22;
            }
        }
        else if(business.equals("S-Corp")){
            business="S-Corp";
            if(taxableincome<500000){
                taxrate=20;
            }
            else if(taxableincome>500000 && taxableincome<=1000000){
                taxrate=25;
            }
            else if(taxableincome>1000000){
                taxrate=28;
            }
        }
        else if(business.equals("C-Corp")){
            business="C-Corp";
            if(taxableincome<=500000){
                taxrate=21;
            }
            else if(taxableincome>500000 && taxableincome<=1000000){
                taxrate=24;
            }
            else if(taxableincome>1000000 && taxableincome<=2000000){
                taxrate=28;
            }
            else if(taxableincome>2000000){
                taxrate=30;
            }
        }
        else if(business.equals("Partnership")){
            business="Partnership";
            if(taxableincome<=300000){
                taxrate=18;
            }
            else if(taxableincome>300000 && taxableincome<=800000){
                taxrate=22;
            }
            else if(taxableincome>800000){
                taxrate=26;
            }
        }
    
        grosstax=taxableincome*(taxrate*0.01);
        nettax=grosstax-taxcredits;
        effectiverate=(nettax/annualrevenue)*100;

        System.out.printf("Annual Revenue: $%.1f\n",annualrevenue);
        System.out.printf("Business Type: %s\n",business);
        System.out.printf("Deductible Expenses: $%.1f\n",deductibleexpense);
        System.out.printf("Tax Credits: $%.1f\n",taxcredits);
        System.out.printf("Taxable Income: $%.1f\n",taxableincome);
        System.out.printf("Tax Rate: %d%%\n",taxrate);
        System.out.printf("Gross Tax: $%.1f\n",grosstax);
        System.out.printf("Net Tax After Credits: $%.1f\n",nettax);
        System.out.printf("Effective Tax Rate: %.2f%%\n",effectiverate);
        sc.close();
    }
}
