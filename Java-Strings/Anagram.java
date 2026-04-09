import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int len1=s1.length();
        String s2=sc.nextLine();
        int len2=s2.length();
        if(len1==len2){
            char st1[]=s1.toLowerCase().toCharArray();
            char st2[]=s2.toLowerCase().toCharArray();
            Arrays.sort(st1);
            Arrays.sort(st2);
            if(Arrays.equals(st1,st2)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not an Anagram");
            }
            // int flag=0;
            // for(int i=0;i<s1.length();i++){
            //     for(int j=0;j<s2.length();j++){
            //         if(s1.charAt(i)==s2.charAt(j)){
            //             flag=1;
            //         }
            //     }
            // }
            // if(flag==1){
            //     System.out.println("Anagram");
            // }
            // else{
            //     System.out.println("Not an Anagram");
            // }

            
        }
        else{
            System.out.println("Not an Anagram");
        }
        sc.close();
    }
}
