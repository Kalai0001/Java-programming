import java.util.Scanner;

public class array2d06 {
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
        System.out.println("Traffic Data:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",arr[i][j]);     
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Traffic Per Lane:");
        for(int i=0;i<r;i++){
            int total=0;
            for(int j=0;j<c;j++){
                total=total+arr[i][j];
            }
            System.out.printf("Lane %d: %d\n",i+1,total);
        }
        System.out.println();
        int max=0;
        int index=0;
        for(int j=0;j<c;j++){
            int total=0;
            for(int i=0;i<r;i++){
                total=total+arr[i][j];
                if(total>max){
                    max=total;
                    index=i;
                }
            }
        }
        System.out.printf("Busiest Hour: Hour %d with %d vehicles\n",index+1,max);
        
sc.close();
    }
}
