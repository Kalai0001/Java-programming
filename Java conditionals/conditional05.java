import java.util.Scanner;
public class conditional05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double income=sc.nextDouble();
        int extraactivity=sc.nextInt();
        sc.nextLine();
        String scholarship=sc.nextLine();
        double amount=0;
    
        String award="0";
        String status="0";
        
        if(gpa>=2.5){
            if(scholarship.equals("Merit")){
                if(gpa>=3.8 && extraactivity>=80){
                    status="Eligible";
                    amount=25000;
                    award="Full";
                }
                else if(gpa>=3.5 && extraactivity>=70){
                    status="Eligible";
                    amount=15000;
                    award="Partial";
                }
                else if(gpa>=3.0 && extraactivity>=60){
                    status="Eligible";
                    amount=8000;
                    award="Minimal";
                }
                else{
                    status="Not Eligible";
                    amount=0;
                    award="None";
                }
            }
            else if(scholarship.equals("Need-Based")){
                if(income<=30000 && gpa>=3.5){
                    status="Eligible";
                    amount=30000;
                    award="Full";
                }
                else if(income<=50000 && gpa>=3.0){
                    status="Eligible";
                    amount=18000;
                    award="Partial";
                }
                else if(income<=70000 && gpa>=2.8){
                    status="Eligible";
                    amount=10000;
                    award="Minimal";
                }
                else{
                    status="Not Eligible";
                    amount=0;
                    award="None";
                }
            }
            else if(scholarship.equals("Sports")){
                if(extraactivity>=75 && gpa>=2.8){
                    status="Eligible";
                    amount=22000;
                    award="Full";
                }
                else if(extraactivity>=85 && gpa>=3.0){
                    status="Eligible";
                    amount=20000;
                    award="Partial";
                }
                else if(extraactivity>=65 && gpa>=2.5){
                    status="Eligible";
                    amount=12000;
                    award="Minimal";
                }
                else{
                    status="Non Eligible";
                    amount=0;
                    award="None";
                }
            }  
        }
        else{
            System.err.println("Enter gpa above 2.5");
        }
        System.out.printf("GPA:%.1f\n",gpa);
        System.out.printf("Family Income:$%.1f\n",income);
        System.out.printf("Extracurricular Score: %d\n",extraactivity);
        System.out.printf("Scholarship Type: %s\n",scholarship);
        System.out.printf("Eligibility: %s\n",status);
        System.out.printf("Award Amount: $%.1f\n",amount);
        System.out.printf("Award Category: %s\n",award);
        sc.close();
    }
}
