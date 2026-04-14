import java.util.*;

public class emailvalidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println("Email Validation Results:");
        for(int i=0;i<n;i++){
            String s1=sc.nextLine();
            char arr[]=s1.toCharArray();
            boolean isvalid=true;
            boolean isOkat=false;
            boolean isDot=false;
            if(arr[0]=='@'||arr[0]=='.'||
               arr[arr.length-1]=='@'||arr[arr.length-1]=='.'){
                isvalid=false;
            }
            int count=0;
            for(int j=0;j<arr.length;j++){
                char temp=s1.charAt(j);
                if(temp=='@'){
                    count++;
                }
            }
            if(count==1){
                isOkat=true;
            }
            else{
                isOkat=false;
            }
            int dotcount=0;
            for(int k=0;k<arr.length;k++){
                char dottemp=s1.charAt(k);
                if(dottemp=='.'){
                    dotcount++;
                }
            }
            if(dotcount>=1){
                isDot=true;
            }
            else{
                isDot=false;
            }
            //To combine if all are true means isvalid return true.
            isvalid=isvalid && isOkat && isDot;
            if(isvalid){
                System.out.printf("%s-Valid\n",s1);
            }
            else{
                System.out.printf("%s-Invalid\n",s1);
            }
        }
        sc.close();
    }
}
