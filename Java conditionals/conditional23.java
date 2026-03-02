import java.util.Scanner;

public class conditional23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stockpercent=sc.nextInt();
        int investmenthorizonyears=sc.nextInt();
        sc.nextLine();
        String risktolerance=sc.nextLine();
        String marketvolatility=sc.nextLine();

        int bondallocation=100-stockpercent;
        int portfolioriskscore=0;
        String riskcategory="0";
        String category="0";
        String recommendation="0";
        String sugestedrebalanc="0";
        


        if(investmenthorizonyears>=1 && investmenthorizonyears<=5){
            if(stockpercent>50){
                portfolioriskscore=portfolioriskscore+20;
            }
        }
        else if(investmenthorizonyears>=6 && investmenthorizonyears<=10){
            if(stockpercent>60){
                portfolioriskscore=portfolioriskscore+10;
            }
        }
        else if(investmenthorizonyears>=11 && investmenthorizonyears<=20){
            if(stockpercent>80){
                portfolioriskscore=portfolioriskscore+5;
            }
        }
        // else if(investmenthorizonyears>=21){
        //     portfolioriskscore=portfolioriskscore;
        // }


        if(investmenthorizonyears<=10){
            marketvolatility="Low";
        }
        else if(investmenthorizonyears>10 && investmenthorizonyears<=20){
            marketvolatility="Medium";
        }
        else if(investmenthorizonyears>20){
            marketvolatility="High";
        }


        if(investmenthorizonyears>=0 && investmenthorizonyears<=30){
            riskcategory="Low";
        }
        else if(investmenthorizonyears>=31 && investmenthorizonyears<=60){
            riskcategory="Moderate";
        }
        else if(investmenthorizonyears>=61 && investmenthorizonyears<=80){
            riskcategory="High";
        }
        else if(investmenthorizonyears>=81 && investmenthorizonyears<=100){
            riskcategory="Very High";
        }

        if(riskcategory.equals("Conservative")){
            if(investmenthorizonyears<=5){
                category="Misaligned";
                recommendation="Portfolio risk significantly exceeds tolerance level";
                sugestedrebalanc="Reduce stocks to 30-40%,increase bonds";
            }
            else if(investmenthorizonyears<=6 && investmenthorizonyears<=10){
                category="Well Aligned";
                recommendation="Portfolio is appropriately balanced for your profile";
                sugestedrebalanc="No action needed";
            }
            else if(investmenthorizonyears>10 && investmenthorizonyears<=20){
                category="Moderate";
                recommendation="High risk level acceptable given long horizon and tolerance";
                sugestedrebalanc="Monitor closely,consider slight reduction if volatility persists";
            }
            else if(investmenthorizonyears>20){
                category="Very High";
            }
        }
        else if(riskcategory.equals("Moderate")){
            if(investmenthorizonyears<=5){
                category="Misaligned";
                recommendation="Portfolio risk significantly exceeds tolerance level";
                sugestedrebalanc="Reduce stocks to 30-40%,increase bonds";
            }
            else if(investmenthorizonyears<=6 && investmenthorizonyears<=10){
                category="Well Aligned";
                recommendation="Portfolio is appropriately balanced for your profile";
                sugestedrebalanc="No action needed";
            }
            else if(investmenthorizonyears>10 && investmenthorizonyears<=20){
                category="Moderate";
                recommendation="High risk level acceptable given long horizon and tolerance";
                sugestedrebalanc="Monitor closely,consider slight reduction if volatility persists";
            }
            else if(investmenthorizonyears>20){
                category="Very High";
            }
        }
        else if(riskcategory.equals("Agressive")){
            if(investmenthorizonyears<=5){
                category="Misaligned";
                recommendation="Portfolio is to conservative for your risk tolerance";
                sugestedrebalanc="Increase stocks to 80-90% for better growth potential";
            }
            else if(investmenthorizonyears<=6 && investmenthorizonyears<=10){
                category="Well Aligned";
            }
            else if(investmenthorizonyears>10 && investmenthorizonyears<=20){
                category="Acceptable";
                recommendation="High risk level acceptable given long horizon and tolerance";
                sugestedrebalanc="Monitor closely,consider slight reduction if volatility persists";
            }
            else if(investmenthorizonyears>20){
                category="Very High";
            }
        }
        System.out.printf("Stock Allocation: %d%%\n",stockpercent);
        System.out.printf("Bond Allocation: %d%%\n",bondallocation);
        System.out.printf("Investment Horizon: %d years\n",investmenthorizonyears);
        System.out.printf("Risk Tolerance: %s\n",risktolerance);
        System.out.printf("Market Volatility: %s\n",marketvolatility);
        System.out.printf("Portfolio Risk Score: %d/100\n",portfolioriskscore);
        System.out.printf("Risk Category: %s\n",riskcategory);
        System.out.printf("Allignment Status: %s\n",category);
        System.out.printf("Recommendation: %s\n",recommendation);
        System.out.printf("Suggested Rebalancing: %s\n",sugestedrebalanc);
        sc.close();
    }
}
