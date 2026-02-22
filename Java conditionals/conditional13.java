import java.util.Scanner;
public class conditional13{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String studentstatus=sc.nextLine();
        int credithours=sc.nextInt();
        sc.nextLine();
        String programtype=sc.nextLine();
        String residency=sc.nextLine();

        double basetutionpercredit=0;
        double residencymultiplier=0;
        double programfee=0;
        double activityfee=0;
        String feecategory="0";

        if(programtype.equals("Undergraduate")){
            basetutionpercredit=350;
        }
        else if(programtype.equals("Graduate")){
            basetutionpercredit=550;
        }
        else if(programtype.equals("Professional")){
            basetutionpercredit=800;
        }

        if(residency.equals("In-State")){
            residencymultiplier=1.0;
            if(studentstatus.equals("Full-Time")){
                feecategory="Standard";
            }
        }
        else if(residency.equals("Out-of-State")){
            residencymultiplier=2.5;
            feecategory="Premium";
        }
        else if(residency.equals("International")){
            residencymultiplier=3.0;
            feecategory="Premium";
        }

        if(studentstatus.equals("Full-Time")){
            activityfee=200;
            if(programtype.equals("Undergraduate")){
                programfee=500;
            }
            else if(programtype.equals("Graduate")){
                programfee=750;
            }
            else if(programtype.equals("Professional")){
                programfee=1200;
            }
        }
        else if(studentstatus.equals("Part-Time")){
            activityfee=100;
            if(programtype.equals("Undergraduate")){
                programfee=300;
            }
            else if(programtype.equals("Graduate")){
                programfee=750;
            }
            else if(programtype.equals("Professional")){
                programfee=900;
            }
        }
        else if(studentstatus.equals("Continuing-Education")){
            activityfee=50;
            programfee=150;
            feecategory="Reduced";
        } 

        double tutioncost=credithours*basetutionpercredit*residencymultiplier;
        double totalfee=tutioncost+programfee+activityfee;

        System.out.printf("Student Status: %s\n",studentstatus);
        System.out.printf("Credit Hours: %d\n",credithours);
        System.out.printf("Program Type: %s\n",programtype);
        System.out.printf("Residency: %s\n",residency);
        System.out.printf("Base Tuition Per Credit: $%.1f\n",basetutionpercredit);
        System.out.printf("Residency Multiplier: %.1fx\n",residencymultiplier);
        System.out.printf("Program Fee: $%.1f\n",programfee);
        System.out.printf("Student Activity: $%.1f\n",activityfee);
        System.out.printf("Total Registration Fee: $%.1f\n",totalfee);
        System.out.printf("Fee Category: %s\n",feecategory);
        sc.close();
    }
}
