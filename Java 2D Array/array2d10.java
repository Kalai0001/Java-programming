import java.util.Scanner;

public class array2d10 {
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
        System.out.println("Sales Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Representative Totals:");
        int index1=0;
        for(int i=0;i<r;i++){
            int total=0;
            for(int j=0;j<c;j++){
                total=total+arr[i][j];
                index1=i;
            }
            System.out.printf("Rep %d: %d\n",index1+1,total);
        }
        System.out.println();
        System.out.println("Territory Totals:");
        int index2=0;
        for(int j=0;j<c;j++){
            int total=0;
            for(int i=0;i<r;i++){
                total=total+arr[i][j];
                index2=j;
            }
            System.out.printf("Territory %d: %d\n",index2+1,total);
        }
        sc.close();
    }
}
