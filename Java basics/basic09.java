import java.util.Scanner;
public class basic09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int roomcharge=sc.nextInt();
        int days=sc.nextInt();
        int medicinecost=sc.nextInt();
        int labfees=sc.nextInt();
        int insurancecoverage=sc.nextInt();

        int finalbill=(roomcharge*days)+medicinecost+labfees-insurancecoverage;
        System.out.printf("Payable Amount = %d",finalbill);
        sc.close();
    }
}
