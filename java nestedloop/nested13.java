import java.util.Scanner;

public class nested13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spiral[][] = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiral[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    spiral[bottom][j] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int k = bottom; k >= top; k--) {
                    spiral[k][left] = num++;
                }
                left++;
            }
        }
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
