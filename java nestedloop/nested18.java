import java.util.Scanner;

public class nested18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int periods=sc.nextInt();

        String[]dayname={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        System.out.println("Class Time Table:");
        System.out.printf("Day ");
        
        for(int i=1;i<=periods;i++){
            System.out.printf("Period %d ",i);
        }

        System.out.println();
        for(int i=0;i<days;i++){
            System.out.print(dayname[i]+" ");
            for(int j=0;j<periods;j++){
                String subname=sc.next();
                System.out.print(subname+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
