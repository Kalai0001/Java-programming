import java.util.Scanner;

public class conditional07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int heartrate=sc.nextInt();
        int bloodpressure=sc.nextInt();
        double temp=sc.nextDouble();
        sc.nextLine();
        String symptoms=sc.nextLine();


        // String symptomseverity="0";
        String triagepriority="0";
        int waittime=0;
        String action="0";
        if(symptoms.equals("Mild")){
           triagepriority="Non-Urgent";
           waittime=90;
           action="Routine Check-up";
        }
        else if(symptoms.equals("Severe")){
            triagepriority="Urgent";
            waittime=20;
            action="Priority Medical Attention";
            
        }
        else if(symptoms.equals("Moderate")){
            triagepriority="Standard";
            waittime=45;
            action="Standard Examination";
        }
        else if(symptoms.equals("Life-Threatening")){
            triagepriority="Critical";
            waittime=0;
            action="Immediate Emergency Care";
        }
        System.out.printf("Heart Rate: %d bpm\n",heartrate);
        System.out.printf("Blood Pressure: %d\n",bloodpressure);
        System.out.printf("Temperature: %.1fF\n",temp);
        System.out.printf("Symptom Severity: %s\n",symptoms);
        System.out.printf("Triage Priority: %s\n",triagepriority);
        System.out.printf("Estimated Wait Time: %d minutes\n",waittime);
        System.out.printf("Recommended Action: %s\n",action);
        sc.close();
    }
}
