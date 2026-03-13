import java.util.Scanner;

public class nested06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrixA[][]=new int[r][c];
        int matrixB[][]=new int[r][c];
        

        ////matrix A
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrixA[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix A:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //////matrix B
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrixB[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix B:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrixB[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        /////sum(a+b)
        System.out.println("Sum(A+B");
        int sum[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=matrixA[i][j]+matrixB[i][j];
                // System.out.print(sum[i][j]);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
