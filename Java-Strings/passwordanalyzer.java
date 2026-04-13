import java.util.Scanner;

public class passwordanalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Password Analysis:");
        for(int i=1;i<=n;i++){
            String password=sc.nextLine();
            boolean hasUpper=false;
            boolean hasLower=false;
            boolean hasDigit=false;
            boolean hasSpecial=false;
            for(int j=0;j<password.length();j++){
                char ch=password.charAt(j);
                if(Character.isUpperCase(ch)){
                    hasUpper=true;
                }
                else if(Character.isLowerCase(ch)){
                    hasLower=true;
                }
                else if(Character.isDigit(ch)){
                    hasDigit=true;
                }
                else if(ch=='@'||ch=='!'||ch=='&'||ch=='^'||ch=='$'||ch=='%'){
                    hasSpecial=true;
                }
            }
            if(password.length()>=8 && hasUpper && hasLower && hasDigit && hasSpecial){
                System.out.println(i+". "+ password + "-Strong");
            }
            else{
                System.out.println(i+". "+ password + "-Weak");
            }
        }
        sc.close();
    }
}
