import java.util.Scanner;
public class operator13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int connectionvalue=sc.nextInt();
        int appliancemask=sc.nextInt();
        int result=connectionvalue & appliancemask ;
        if(result!=0){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
        sc.close();
    }
}
