import java.util.Scanner;

public class nested04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int student=sc.nextInt();
        int subjects=sc.nextInt();
        
        String s1="0";
        int subjectscore=0;
        System.out.println("Grade Sheet:");
        System.out.printf("Student ");

        for(int i=1;i<=subjects;i++){
            System.out.printf("Sub"+i+" ");
        }
        System.out.print("Average");
        System.out.println();

        for(int i=1;i<=student;i++){
            s1=sc.next();
            System.out.printf("%s ",s1);
            double average=0;
            for(int j=1;j<=subjects;j++){ 
                subjectscore=sc.nextInt();
                System.out.printf("%d ",subjectscore);
                average=subjectscore+average;
                
            }
            double total=average/(double)subjects;
            System.out.printf("%.2f",total);
            System.out.println();
        }
        sc.close();
    }
}
