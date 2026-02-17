import java.util.Scanner;
class basic04{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tutionfees=sc.nextInt();
        int scholarship=sc.nextInt();
        int examfee=sc.nextInt();
        int libraryfees=sc.nextInt();

        int percent=(tutionfees*scholarship)/100;
        int pay=tutionfees-percent+examfee+libraryfees;

        System.out.printf("Final Payable Fee = %d",pay);
        sc.close();
    }
}
