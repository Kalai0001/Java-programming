import java.util.Scanner;
class operator01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theory=sc.nextInt();
        int practical=sc.nextInt();
        int average=(theory+practical)/2;
        
        if(average>=60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}