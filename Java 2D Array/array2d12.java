import java.util.Scanner;

public class array2d12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=4;
        int c=7;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Rainfall Data:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Weekly Totals:");
        int index1=0;
        int monthlytotal=0;

        int min=Integer.MAX_VALUE;
        int index2=0;

        for(int i=0;i<r;i++){
            int total=0;
            for(int j=0;j<c;j++){
                total=total+arr[i][j];
                index1=i;
                if(total<min){
                    min=total;
                    index2=i;
                }
            }
            monthlytotal=monthlytotal+total;
            System.out.printf("Week %d: %d mm\n",index1+1,total);
        }
        System.out.println();
        
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if(arr[i][j]<min){
        //             min=arr[i][j];
        //             index2=i;
        //         }
        //     }
        // }
        System.out.printf("Monthly Total: %d mm\n",monthlytotal);
        System.out.printf("Driest Week: Week %d (%d mm)",index2+1,min);
        sc.close();
    }
}
