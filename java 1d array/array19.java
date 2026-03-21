import java.util.Scanner;

public class array19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int count=0;
        int total=0;
        int max=arr[0];
        int index=0;
        for(int i=0;i<n;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
            if(arr[i]<target){
                count++;
            }
        }
        double average=(double)total/(double)n;
        double goal=(((double)n-(double)count)/(double)n)*100.00;

        System.out.printf("Days Tracked: %d\n",n);
        System.out.printf("Total Calories Burned: %d\n",total);
        System.out.printf("Average Daily Burn: %.2f\n",average);
        System.out.printf("Peak Burn Day: Day %d (%d calories)\n",index+1,max);
        System.out.printf("Days Below Target: %d\n",count);
        System.out.printf("Goal Achievement: %.2f%%\n",goal);
        sc.close();
    }
}
