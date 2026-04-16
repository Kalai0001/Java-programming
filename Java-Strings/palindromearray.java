import java.util.Scanner;

public class palindromearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println("DNA Sequence Analysis:");
        for (int j = 1; j <= n; j++) {
            String s1 = sc.nextLine();
            char arr1[] = s1.toCharArray();
            char arr2[] = new char[arr1.length];
            int k = 0;
            for (int i = arr1.length - 1; i >= 0; i--) {
                arr2[k] = arr1[i];
                k++;
            }
            String s2 = new String(arr2); // to convert char to again string
            if (s1.equals(s2)) {
                System.out.println(s1 + "-" + "Palindrome");
            } else {
                System.out.println(s1 + "-" + "Not an Palindrome");
            }
        }
        sc.close();
    }
}