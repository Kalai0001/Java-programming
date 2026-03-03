import java.util.Scanner;

public class loop02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String sname="0";
        int score=0;
        int average=0;
        double classaverage=0;
        int countpass=0;
        int countfail=0;
        int max=0;
        for(int i=1;i<=n;i++){
            sname=sc.next();
            score=sc.nextInt();
            String lettergrade="0";
            String status="0";

            //highscore//
            if(score>max){
                max=score;
            }
            //Grade//
            if(score>=85 && score<=100){
                lettergrade="A";
            }
            else if(score>=70 && score<=84){
                lettergrade="B";
            }
            else if(score>=60 && score<=69){
                lettergrade="C";
            }
            else if(score>=50 && score<=59){
                lettergrade="D";
            }
            else if(score>=0 && score<=49){
                lettergrade="F";
            }
            //status//
            if(score>=60){
                status="Pass";
                countpass++;
            }
            else{
                status="Fail";
                countfail++;
            }
            average=average+score;
            // classaverage=average/n;
            System.out.printf("Student: %s\n",sname);
            System.out.printf("Score: %d\n",score);
            System.out.printf("Letter Grade: %s\n",lettergrade);
            System.out.printf("Status: %s\n",status);
        }
        int totalstudents=n;
        classaverage=average/n;
        System.out.printf("Total Students: %d\n",totalstudents);
        System.out.printf("Class Average: %.2f\n",classaverage);
        System.out.printf("Highest Score: %d\n",max);
        System.out.printf("Students Passed: %d\n",countpass);
        System.out.printf("Students Failed: %d\n",countfail);
        sc.close();
    }
}
