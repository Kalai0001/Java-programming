import java.util.Scanner;
public class operator06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int percenr=sc.nextInt();
        if(income<200000 && percenr>=75){
            System.out.println("Granted");
        }
        else{
            System.out.println("Not Granted");
        }
        sc.close();
    }
}
