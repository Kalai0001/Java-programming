import java.util.Scanner;

public class array2d03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int m1[][]=new int[r][c];
        int m2[][]=new int[r][c];
        int sum[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix 2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf(m2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
