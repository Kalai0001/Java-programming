import java.util.Scanner;

public class array2d14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Rotated Matrix (90 deg clockwise):");
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[n-j-1][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}