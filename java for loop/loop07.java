import java.util.Scanner;

public class loop07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String consumerid="0";
        int unitsconsumed=0;
        double unitperprice=0;
        String category="0";
        double totalrevenue=0;
        int totalunitsconsumed=0;
        for(int i=1;i<=n;i++){
            consumerid=sc.next();
            unitsconsumed=sc.nextInt();
            if(unitsconsumed>=0 && unitsconsumed<=100){
                unitperprice=unitsconsumed*0.10;
            }
            else if(unitsconsumed>=101 && unitsconsumed<=200){
                unitperprice=(100*0.10)+(unitsconsumed-100)*0.13;
            }
            else if(unitsconsumed>=201 && unitsconsumed<=300){
                unitperprice=(100*0.10)+(100*0.13)+(unitsconsumed-200)*0.16;
            }
            else if(unitsconsumed>300){
                unitperprice=(100*0.10)+(100*0.13)+(100*0.16)+(unitsconsumed-300)*0.20;
            }
            ///category///
            if(unitsconsumed<=200){
                category="Low Usage";
            }
            else if(unitsconsumed>=201 && unitsconsumed<=300){
                category="Medium Usage";
            }
            else if(unitsconsumed>300){
                category="High Usage";
            }
            ///
            totalrevenue=totalrevenue+unitperprice;
            totalunitsconsumed=totalunitsconsumed+unitsconsumed;
            System.out.printf("Consumer ID: %s\n",consumerid);
            System.out.printf("Units Consumed: %d\n",unitsconsumed);
            System.out.printf("Bill Amount: %.1f\n",unitperprice);
            System.out.printf("Category: %s\n",category);
        }
        int totalconsumers=n;
        
        double averagebill=totalrevenue/n;

        System.out.printf("Total Consumers: %d\n",totalconsumers);
        System.out.printf("Total Units Consumed: %d\n",totalunitsconsumed);
        System.out.printf("Total Revenue: $%.1f\n",totalrevenue);
        System.out.printf("Average Bill: $%.1f\n",averagebill);
        sc.close();
    }
}
