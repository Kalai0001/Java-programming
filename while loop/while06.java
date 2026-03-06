import java.util.Scanner;

public class while06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        do{
            int withdraw=sc.nextInt();
            System.out.printf("Enter withdrawal amount: %d\n",withdraw);
            if(withdraw>balance){
                System.out.printf("Insufficient funds! Try again.\n");
            }
            else{
                int z=balance-withdraw;
                System.out.printf("Withdrawal successful! Remaining balance: %d\n",z);
            }
        }while(balance>0);
        sc.close();
    }
}
