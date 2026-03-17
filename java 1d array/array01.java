import java.util.Scanner;

public class array01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double salary[]=new double[n];
        for(int i=0;i<n;i++){
            salary[i]=sc.nextDouble();
        }
        double total=0;
        for(int i=0;i<n;i++){
            total=total+salary[i];
        }
        int count=0;
        double averagesalary=total/n;
        for(int i=0;i<n;i++){
            if(salary[i]>averagesalary){
                count++;
            }
        }
        double percent=((double)count/(double)n)*(double)100;
        System.out.printf("Total Employee: %d\n",n);
        System.out.printf("Average Salary: %.2f\n",averagesalary);
        System.out.printf("Employees Above Average: %d\n",count);
        System.out.printf("Percentage: %.2f%%\n",percent);
        sc.close();
    }
}
