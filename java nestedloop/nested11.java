import java.util.Scanner;

public class nested11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pr=0;
        System.out.println("Pascal's Triangle:");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==0||j==0){
                    pr=1;
                }
                else{
                    pr=pr*(i-j+1)/j;
                }
                System.out.printf("%d ",pr);
            }
            System.out.println();
        }
        sc.close();
    }
}
