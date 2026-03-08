import java.util.Scanner;

public class while23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int vcount=0;
        int i=0;
        do{
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||
               s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'){
                vcount++;
            }
            i++;
        }while(i<s1.length());
        System.out.printf("Text: %s\n",s1);
        System.out.printf("Vowel count: %d",vcount);
        sc.close();
    }
}
