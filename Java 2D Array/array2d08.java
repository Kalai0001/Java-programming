import java.util.Scanner;

public class array2d08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int brightness=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Image:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Adjusted Image:");
        for(int i=0;i<r;i++){
            int newpixel=0;
            for(int j=0;j<c;j++){
                newpixel=brightness+arr[i][j];
                if(newpixel>255){
                    newpixel=255;
                }
                System.out.printf("%d ",newpixel);
            }
            System.out.println();
        }
        sc.close();
    }
}
