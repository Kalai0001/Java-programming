import java.util.Scanner;

public class array2d01 {
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
        System.out.printf("Student Averages:\n");
    
        for(int i=0;i<r;i++){
            int total=0;
            for(int j=0;j<c;j++){
                total=total+arr[i][j];
                
            }
            double average=((double)total/(double)c)*100;
            System.out.printf("Student %d: %d\n",i+1,(int)average);
        }
        System.out.println();
        System.out.printf("Subject Averages:\n");
        for(int j=0;j<c;j++){
            int total=0;
            for(int i=0;i<r;i++){
                total=total+arr[i][j];
                
            }
            double average=((double)total/(double)r)*100;
            System.out.printf("Subject %d: %d\n",j+1,(int)average);
        }
        sc.close();
    }
}
