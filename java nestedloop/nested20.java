import java.util.Scanner;

public class nested20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        int transposematrix[][]=new int [c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix"+" "+"("+r+"x"+c+")");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transposed matrix"+" "+"("+c+"x"+r+")");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transposematrix[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(transposematrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
