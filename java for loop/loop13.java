import java.util.Scanner;

public class loop13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String donorname="0";
        int age=0;
        double weight=0;
        double hemoglobin=0;
        String status="0";
        String reason="0";
        int counteligible=0;
        int rejectedeligible=0;
        for(int i=1;i<=n;i++){
            donorname=sc.next();
            age=sc.nextInt();
            weight=sc.nextDouble();
            hemoglobin=sc.nextDouble();

            // if(age>=18 && age<=65&&weight>=50&&hemoglobin>=12.5){
            //     status="Eligible";
            //     System.out.printf("Status: %s\n",status);
            //     counteligible++;
            // }
            System.out.printf("Donor: %s\n",donorname);
            System.out.printf("Age: %d years\n",age);
            System.out.printf("Weight: %.1f kg\n",weight);
            System.out.printf("Hemoglobin: %.1f g/dL\n",hemoglobin);
            // System.out.printf("Status: %s\n",status);
            // System.out.printf("Reason: %s\n",reason);
            if(age>=18 && age<=65&&weight>=50&&hemoglobin>=12.5){
                status="Eligible";
                System.out.printf("Status: %s\n",status);
                counteligible++;
            }
            // else if(age<18 && weight>=50 && hemoglobin>=12.5){
            //     status="Not Eligible";
            //     reason="Age below 18 years";
            //     System.out.printf("Status: %s\n",status);
            //     System.out.printf("Reason: %s\n",reason);
            // }
            // else if(age>65 && weight>=50 && hemoglobin>=12.5){
            //     status="Not Eligible";
            //     reason="Age above 65 years";
            //     System.out.printf("Status: %s\n",status);
            //     System.out.printf("Reason: %s\n",reason);
            // }
            // else if((age>=18 && age<=65) && weight<50 && hemoglobin>=12.5){
            //     status="Not Eligible";
            //     reason="Weight below 50 kg";
            //     System.out.printf("Status: %s\n",status);
            //     System.out.printf("Reason: %s\n",reason);
            // }
            // else if(age>65 && weight>=50 && hemoglobin<12.5){
            //     status="Not Eligible";
            //     reason="Hemoglobin below 12.5g/dl";
            //     System.out.printf("Status: %s\n",status);
            //     System.out.printf("Reason: %s\n",reason);
            // }
            else if(age<18){
                status="Not Eligible";
                reason="Age below 18 years";
                System.out.printf("Status: %s\n",status);
                System.out.printf("Reason: %s\n",reason);
            }
            else if(age>65){
                status="Not Eligible";
                reason="Age above 65 years";
                System.out.printf("Status: %s\n",status);
                System.out.printf("Reason: %s\n",reason);
            }
            else if(weight<50){
                status="Not Eligible";
                reason="Weight below 50 kg";
                System.out.printf("Status: %s\n",status);
                System.out.printf("Reason: %s\n",reason);
            }
            else if(hemoglobin<12.5){
                status="Not Eligible";
                reason="Hemoglobin below 12.5g/dl";
                System.out.printf("Status: %s\n",status);
                System.out.printf("Reason: %s\n",reason);
            }
        }
        rejectedeligible=n-counteligible;
        // int total=counteligible+rejectedeligible;
        double eligiblerate=((double)counteligible/(double)n)*100;
        System.out.printf("Total Donors: %d\n",n);
        System.out.printf("Eligible Donors: %d\n",counteligible);
        System.out.printf("Rejected Donors: %s\n",rejectedeligible);
        System.out.printf("Eligibility Rate: %.2f%%\n",eligiblerate);
        sc.close();
    }
}
