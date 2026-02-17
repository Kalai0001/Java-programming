import java.util.*;
public class operator15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int signalvalue=sc.nextInt();
        int togglemask=sc.nextInt();
        int result=signalvalue^togglemask;
        System.out.printf("Toggled Signal = %d",result);
        sc.close();
    }
}
