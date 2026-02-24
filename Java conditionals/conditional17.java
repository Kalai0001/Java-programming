import java.util.*;
public class conditional17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cardtier=sc.nextLine();
        String purchasecategory=sc.nextLine();
        double transactionamount=sc.nextDouble();
        sc.nextLine();
        String promotionstatus=sc.nextLine();
        double basepointrate=1.0;

        double categorybonus=0;
        double tiermultiplier=0;
        double promotionmultiplier=0;
        String rewardstier="0";
        if(purchasecategory.equals("Groceries")){
            categorybonus=2.0;
        }
        else if(purchasecategory.equals("Dining")){
            categorybonus=2.5;
        }
        else if(purchasecategory.equals("Travel")){
            categorybonus=3.0;
        }
        else if(purchasecategory.equals("Gas")){
            categorybonus=2.0;
        }
        else if(purchasecategory.equals("Other")){
            categorybonus=1.0;
        }

        if(cardtier.equals("Basic")){
            tiermultiplier=1.0;
            rewardstier="Standard";
        }
        else if(cardtier.equals("Gold")){
            tiermultiplier=1.25;
            rewardstier="Enhanced";
        }
        else if(cardtier.equals("Platinum")){
            tiermultiplier=1.5;
            rewardstier="Premium";
        }
        else if(cardtier.equals("Black")){
            tiermultiplier=2.0;
            rewardstier="Elite";
        }
        if(promotionstatus.equals("None")){
            promotionmultiplier=1.0;
        }
        else if(promotionstatus.equals("Double-Points")){
            promotionmultiplier=2.0;
        }
        else if(promotionstatus.equals("Triple-Points")){
            promotionmultiplier=3.0;
        }

        double pointsearned=transactionamount*basepointrate*categorybonus*tiermultiplier*promotionmultiplier;
        double cashvalue=pointsearned*0.01;

        System.out.printf("Card Tier: %s\n",cardtier);
        System.out.printf("Purchase Category: %s\n",purchasecategory);
        System.out.printf("Transaction Amount: $%.1f\n",transactionamount);
        System.out.printf("Promotional Status: %s\n",promotionstatus);
        System.out.printf("Base Points Rate: %.1f points per dollar\n",basepointrate);
        System.out.printf("Category Bonus: %.1fx\n",categorybonus);
        System.out.printf("Tier Multiplier: %.1fx\n",tiermultiplier);
        System.out.printf("Promotional Multiplier: %.1f\n",promotionmultiplier);
        System.out.printf("Points Earned: %.1f\n",pointsearned);
        System.out.printf("Equivalent Cash Value: $%.1f\n",cashvalue);
        System.out.printf("Rewards Tier: %s\n",rewardstier);
        sc.close();
    }
}
