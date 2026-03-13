import java.util.Scanner;

public class nested09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.printf("%d",k);
            }
            for(int l=i-1;l>=1;l--){
                System.out.printf("%d",l);
            }
            System.out.println();
        }
        sc.close();
    }
    
}
