import java.util.Scanner;

public class loop16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String studentname="0";
        int correctans=0;
        int wrongans=0;
        int unattempted=0;
        String result="0";
        int score=0;
        int passcount=0;
        int failcount=0;
        int maxscore=0;
        int totalscore=0;
        for(int i=1;i<=n;i++){
            studentname=sc.next();
            correctans=sc.nextInt();
            wrongans=sc.nextInt();
            unattempted=sc.nextInt();

            score=(correctans*4)-(wrongans*3)+(unattempted*0);
            if(score>=32){
                result="Pass";
                passcount++;
            }
            else{
                result="Fail";
                failcount++;
            }
            if(score>maxscore){
                maxscore=score;
            }
            totalscore=totalscore+score;
            System.out.printf("Student: %s\n",studentname);
            System.out.printf("Correct: %d\n",correctans);
            System.out.printf("Wrong: %d\n",wrongans);
            System.out.printf("Unattempted: %d\n",unattempted);
            System.out.printf("Score: %d\n",score);
            System.out.printf("Result: %s\n",result);
        }
        double average=totalscore/n;
        System.out.printf("Total Students: %s\n",n);
        System.out.printf("Pass Count: %d\n",passcount);
        System.out.printf("Fail Count: %d\n",failcount);
        System.out.printf("Class Average: %.1f\n",average);
        System.out.printf("Highest Score: %d\n",maxscore);
        sc.close();
    }
}
