import java.util.Scanner;

public class while21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int range=sc.nextInt();
        int value=0;
        
        int i=1;
        System.out.println("Multiplication table of num:");
        do{
            for(i=1;i<=range;i++){
                value=num*i;
                System.out.println(+num+" x "+i+" = "+value);
            }

        }while(i<=range);
        // System.out.printf("%d",value);
        sc.close();
        // System.out.printf("%d",value);
    }
}
