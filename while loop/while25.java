import java.util.Scanner;

public class while25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do{
            for(i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.printf("%d ",i);
                }
                System.out.println(" ");
            }
        }while(i<=n);
        sc.close();
    }
}
