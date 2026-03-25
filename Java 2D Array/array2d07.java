import java.util.Scanner;

public class array2d07 {
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
        int total=0;
        int max=0;
        int index1=0;
        int index2=0;

        System.out.println("Inventory Grid:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                total=total+arr[i][j];
                if(arr[i][j]>max){
                    max=arr[i][j];
                    index1=i;
                    index2=j;
                }
            }
        }
        int z=r*c;
        double average=((double)total/(double)z)*100.00;

        System.out.printf("Total Inventory: %d\n",total);
        System.out.printf("Max Stock Zone: Row %d, Col %d (%d units)\n",index1,index2,max);
        System.out.printf("Average Stock per Zone: %d\n",(int)average);


sc.close();
    }
}
