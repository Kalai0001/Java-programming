import java.util.Scanner;
public class operator03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int workinghours=sc.nextInt();
        int attendancepercent=sc.nextInt();
        if(workinghours>40 && attendancepercent>90){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
