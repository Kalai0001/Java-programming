import java.util.Scanner;

public class nested01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("Multiplication Table (%d x %d):\n", num1, num2);
        if(num1==num2){
            for(int r=1;r<=num1;r++) {
                System.out.print(r+" ");
            }
            for(int c=1;c<=num2;c++) {
                System.out.printf("\n%d", c);
                for(int i=1;i<=num2;i++){
                    System.out.print(" "+c*i);
                }
            }
        }
        else{
            for(int r=1;r<=num2;r++) {
                System.out.print(r+" ");
            }
            for(int c=1;c<=num1;c++) {
                System.out.printf("\n%d",c);
                for (int i=1;i<=num2;i++){
                    System.out.print(" "+c*i);
                }
            }
        }
        sc.close();
    }
}
