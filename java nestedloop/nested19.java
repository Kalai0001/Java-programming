import java.util.Scanner;

public class nested19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        System.out.println("Floyd's Triangle:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",k);
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}
