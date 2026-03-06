import java.util.Scanner;

public class while07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Calculator Menu:");
            System.out.println("1.Add:");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            // System.out.printf("Choice: %d\n", choice);
            if(choice==5){
                System.out.printf("Choice: %d\n", choice);
                System.out.printf("Goodbye!\n");
            }

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = 0;
            System.out.printf("Choice: %d\n", choice);
            switch (choice) {
                case 1:
                    System.out.printf("Enter two numbers:%d %d\n", num1, num2);
                    result = num1 + num2;
                    System.out.printf("Result: %d\n", result);
                    break;
                case 2:
                    System.out.printf("Enter two numbers:%d %d\n", num1, num2);
                    result = num1 - num2;
                    System.out.printf("Result: %d\n", result);
                    break;
                case 3:
                    System.out.printf("Enter two numbers:%d %d\n", num1, num2);
                    result = num1 * num2;
                    System.out.printf("Result: %d\n", result);
                    break;
                case 4:
                    System.out.printf("Enter two numbers:%d %d\n", num1, num2);
                    result = num1 / num2;
                    System.out.printf("Result: %d\n", result);
                    break;
                // case 5:
                //     System.out.printf("Goodbye!\n");
                //     break;

                default:
                    break;

            }
        } while (choice != 5);
        sc.close();
    }
}
