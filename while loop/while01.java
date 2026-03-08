import java.util.Scanner;

public class while01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctpassword = sc.nextLine();
        int attempt = 3;
        // int flag=1;
        while (attempt != 0) {
            int attemptcount = 1;
            int remain = attempt - attemptcount;
            System.out.println("Enter Password:");
            String password = sc.nextLine();
            if (password.equals(correctpassword)) {
                System.out.printf("Access granted!");
                // flag = 1;
                break;
            } else {
                if (remain == 0) {
                    System.out.println("Account Locked!");
                    break;
                }
                System.out.printf("Incorrect! Attempts remaining:%d\n", remain);
                // flag = 0;
                attemptcount++;
            }
            attempt--;
        }
        sc.close();
    }
}
