import java.util.*;
public class operator12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int filesize=sc.nextInt();
        int compressioncycle=sc.nextInt();
        int size=filesize>>compressioncycle;
        System.out.printf("Compressed size = %d",size);
        sc.close();
    }
}
