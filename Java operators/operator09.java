import java.util.Scanner;
public class operator09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int usernamematch=sc.nextInt();
        int passwordmatch=sc.nextInt();
        int accountlocked=sc.nextInt();
        if(usernamematch==1 && passwordmatch==1 && accountlocked==0){
            System.out.println("Success");
        }
        else{
            System.out.println("Failed");
        }
        sc.close();
    }
}
