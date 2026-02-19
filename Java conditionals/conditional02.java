import java.util.*;
public class conditional02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int creditscore=sc.nextInt();
        double annualincome=sc.nextDouble();
        double incomeratio=sc.nextDouble();
        sc.nextLine();
        String loantype=sc.nextLine();
        System.out.printf("Credit Score : %d\n",creditscore);
        System.out.printf("Annual Income : $%.1f\n",annualincome);
        System.out.printf("Debt-to-Income Ratio : %.1f%%\n",incomeratio);
        System.out.printf("Loan Type : %s\n",loantype);
        if((creditscore>=750) && (incomeratio<=30)){
            if(loantype.equals("Home")){
                double amount=annualincome*4;
                System.out.printf("Decision : Approved\n");
                System.out.printf("Maximum Loan Amount : $%.1f\n",amount);
            }
            else if(loantype.equals("Personal")){
                double amount=annualincome*1;
                System.out.printf("Decision : Approved\n");
                System.out.printf("Maximum Loan Amount : $%.1f\n",amount);
            }
        }
        else if((creditscore>=700 && creditscore<=749) && (incomeratio>=31 && incomeratio<=40)){
            if(loantype.equals("Home")){
                double amount=annualincome*3;
                System.out.printf("Decision : Needs Review\n");
                System.out.printf("Maximum Loan Amount : $%.1f\n",amount);
            }
            else if(loantype.equals("Business")){
                double amount=annualincome*3;
                System.out.printf("Decision : Approved\n");
                System.out.printf("Maximum Loan Amount : $%.1f\n",amount);
            }
        }
        else if((creditscore>=650 && creditscore<=699) && (incomeratio>=31 && incomeratio<=40)){
            if(loantype.equals("Home")){
                double amount=annualincome*3;
                System.out.printf("Decision : Needs Review\n");
                System.out.printf("Maximum Loan Amount : $%.1f\n",amount);
            }
            else if(loantype.equals("Personal")){
                double amount=annualincome*0.5;
                System.out.printf("Decision : Needs Review\n");
                System.out.printf("Maximum Loan Amount : $%.1f\n",amount);
            }
        }
        else if((creditscore>=750) && (incomeratio<=30)||(creditscore>=700 && creditscore<=749) && (incomeratio>=31 && incomeratio<=40)){
            if(loantype.equals("Bussiness")){
                double amount=annualincome*3;
                System.out.printf("Decision : Approved\n");
                System.out.printf("Maximum Loan Amount : $%.1f\n",amount);
            }
        }
        else if((creditscore<600)||(incomeratio>50)){
            System.out.printf("Decision : Rejected\n");
            System.out.printf("Maximum Loan Amount : $0.0");
        }
        sc.close();
    }
}

