import java.util.Scanner;

public class array2d13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Seating Map:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int count1=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    count1++;
                }
            }
        }
        int n=r*c;
        double average=((double)count1/(double)n)*100.00;

        System.out.printf("Total Occupied: %d\n",count1);
        System.out.printf("Occupancy Rate: %.2f%%\n",average);

        System.out.print("Empty rows: [");
        
        
        int printed=0;
        for(int i=0;i<r;i++){
            int count2=0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    count2++;
                }
            }
            if(count2==0){
                if(printed > 0){
                    System.out.print(", ");
                }
            System.out.print(i);
            printed++;
            }
        }
        System.out.print("]");
        sc.close();
    }
}
