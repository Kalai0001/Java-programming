import java.util.Scanner;
public class loop01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String name;
        double basesalary=0;
        int rating=0;
        double payroll=0;
        for(int i=1;i<=n;i++){
            
            name=sc.next();
            basesalary=sc.nextDouble();
            rating=sc.nextInt();

            int increment=0;
            double finalsalary=0;
            if(rating==5){
                increment=15;
            }
            else if(rating==4){
                increment=10;
            }
            else if(rating==3){
                increment=5;
            }
            else if(rating==2){
                increment=2;
            }
            else if(rating==1){
                increment=0;
            }
            finalsalary=basesalary*(1+increment*0.01);
            payroll=payroll+finalsalary;
            System.out.printf("Name: %s\n",name);
            System.out.printf("Base salary: $%.1f\n",basesalary);
            System.out.printf("Rating: %d\n",rating);
            System.out.printf("Increment: %d%%\n",increment);
            System.out.printf("Final Salary: $%.1f\n",finalsalary);
        
        }
        int totalemploy=n;
        double average=payroll/n;
        System.out.printf("Total Employees Processed: %d\n",totalemploy);
        System.out.printf("Total Payroll: $%.1f\n",payroll);
        System.out.printf("Average Salary: $%.2f\n",average);
        sc.close();
    }


}
