import java.util.Scanner;

public class array03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int grades[]=new int[n];
        for(int i=0;i<n;i++){
            grades[i]=sc.nextInt();
        }
        int max=0;
        int min=500;
        for(int i=0;i<n;i++){
            if(grades[i]>max){
                max=grades[i];
            }
            if(grades[i]<min){
                min=grades[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(grades[i]<40){
                count++;
            }
        }
        int z=n-count;
        double percent=((double)z/(double)n)*100;

        System.out.printf("Total Students: %d\n",n);
        System.out.printf("Higest Score: %d\n",max);
        System.out.printf("Lowest Score: %d\n",min);
        System.out.printf("Failed Students: %d\n",count);
        System.out.printf("Pass Percentage: %.2f%%\n",percent);
        sc.close();
    }
}
