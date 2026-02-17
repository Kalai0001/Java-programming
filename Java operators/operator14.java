import java.util.*;
public class operator14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int permissionA=sc.nextInt();
        int permissionB=sc.nextInt();
        int result=permissionA | permissionB;
        System.out.printf("Merged Permission Code = %d",result);
        sc.close();
    }
}
