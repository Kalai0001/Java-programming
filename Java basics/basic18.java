import java.util.Scanner;
public class basic18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int register=sc.nextInt();
        int sponrship=sc.nextInt();
        int stall=sc.nextInt();
        int stage=sc.nextInt();
        int celebrity=sc.nextInt();
        int marketing=sc.nextInt();

        int remain=register+sponrship+stall-stage-celebrity-marketing;
        System.out.printf("Remaining Fund = %d",remain);
        sc.close();
    }
}
