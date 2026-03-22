import java.util.Scanner;

public class array2d04 {
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
        System.out.println("Sales Data:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Product-wise Total Sales:");
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<r;i++){
            int total=0;
            for(int j=0;j<c;j++){
                total=total+arr[i][j];
                if(total>max){
                    max=total;
                    index=i;
                }
            }
            System.out.printf("Product %d: %d\n",i+1,total);
        }
        System.out.println();
        System.out.printf("Best-Selling Product: Product %d with %d units\n",index+1,max);
        sc.close();
    }   
}
