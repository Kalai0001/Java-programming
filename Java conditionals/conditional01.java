import java.util.Scanner;
class conditional01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rating=sc.nextInt();
        int years=sc.nextInt();
        sc.nextLine();
        String depart=sc.nextLine();
        int salary=sc.nextInt();
        int bonuspercent;
        float bonusamount;
        System.out.printf("Performance Rating : %d\n",rating);
        System.out.printf("Years of Service : %d\n",years);
        System.out.printf("Department : %s\n",depart);
        if(rating>=3){
            if(depart.equals("Critical")){
                if(rating==5 && years>=5){
                    bonuspercent=25;
                    System.out.printf("Bonus Percentage : %d%%\n",bonuspercent);
                    bonusamount=(salary*bonuspercent)/100;
                    System.out.printf("Bonus Amount: $%.1f\n",bonusamount);
                    System.out.println("Status : Eligible\n");
                }
                else if(rating==4 && years>=10){
                    bonuspercent=22;
                    System.out.printf("Bonus Percentage : %d%%\n",bonuspercent);
                    bonusamount=(salary*bonuspercent)/100;
                    System.out.printf("Bonus Amount: $%.1f\n",bonusamount);
                    System.out.println("Status : Eligible\n");
                }
                else if(rating==4){
                    bonuspercent=15;
                    System.out.printf("Bonus Percentage : %d%%\n",bonuspercent);
                    bonusamount=(salary*bonuspercent)/100;
                    System.out.printf("Bonus Amount: $%.1f\n",bonusamount);
                    System.out.println("Status : Eligible\n");
                }
                else if(rating==3){
                    bonuspercent=10;
                    System.out.printf("Bonus Percentage : %d%%\n",bonuspercent);
                    bonusamount=(salary*bonuspercent)/100;
                    System.out.printf("Bonus Amount: $%.1f\n",bonusamount);
                    System.out.println("Status : Eligible\n");
                }
            }
            if(depart.equals("Non-Critical")){
                if(rating==5){
                    bonuspercent=18;
                    System.out.printf("Bonus Percentage : %d%%\n",bonuspercent);
                    bonusamount=(salary*bonuspercent)/100;
                    System.out.printf("Bonus Amount: $%.1f\n",bonusamount);
                    System.out.println("Status : Eligible\n");
                }
                else if(rating==4){
                    bonuspercent=12;
                    System.out.printf("Bonus Percentage : %d%%\n",bonuspercent);
                    bonusamount=(salary*bonuspercent)/100;
                    System.out.printf("Bonus Amount: $%.1f\n",bonusamount);
                    System.out.println("Status : Eligible\n");
                }
                else if(rating==3){
                    bonuspercent=8;
                    System.out.printf("Bonus Percentage : %d%%\n",bonuspercent);
                    bonusamount=((int)salary*bonuspercent)/100;
                    System.out.printf("Bonus Amount: $%.1f\n",bonusamount);
                    System.out.println("Status : Eligible\n");
                }
            }
        }
    
        if(rating<3){
            System.out.printf("Bonus Percentage : 0%%\n");
            System.out.printf("Bonus Amount: $0.0\n");
            System.out.println("Status : Not Eligible\n");
        }
        sc.close();
    }
}