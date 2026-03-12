import java.util.Scanner;

public class nested03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();

        if(s1.equals("star")){
            System.out.println("Right Triangle Pattern:");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(s1.equals("number")){
            System.out.println("Right Triangle Pattern:");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
