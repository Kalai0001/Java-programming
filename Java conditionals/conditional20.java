import java.util.Scanner;

public class conditional20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int storagegb=sc.nextInt();
        int usercount=sc.nextInt();
        sc.nextLine();
        String backupfrequency=sc.nextLine();
        String supporttier=sc.nextLine();
        double basestoragecost=0;
        double userfee=0;
        double backuppremium=0;
        double supportfee=0;
        String includedfeatures="0";

        if(storagegb<=100){
            basestoragecost=0.05*storagegb;
        }
        else if(storagegb>=101 && storagegb<=500){
            basestoragecost=(100*0.05)+(storagegb-100)*0.04;
        }
        else if(storagegb>=501 && storagegb<=2000){
            basestoragecost=(100*0.05)+(400)*0.04+(storagegb-500)*0.03;
        }
        else if(storagegb>=2001){
            basestoragecost=(100*0.05)+(400)*0.04+(1500)*0.03+(storagegb-2000)*0.02;
        }

        if(usercount>=1 && usercount<=10){
            userfee=5*usercount;
        }
        else if(usercount>=11 && usercount<=50){
            userfee=4*usercount;
        }
        else if(usercount>=51){
            userfee=3*usercount;
        }

        if(backupfrequency.equals("Daily")){
            backuppremium=0;
        }
        else if(backupfrequency.equals("Hourly")){
            backuppremium=15+(0.50*usercount);
        }
        else if(backupfrequency.equals("Real-Time")){
            backuppremium=50+(1*usercount);
        }

        if(supporttier.equals("Community")){
            supportfee=0;
        }
        else if(supporttier.equals("Standard")){
            supportfee=20;
        }
        else if(supporttier.equals("Priority")){
            supportfee=75;
        }
        else if(supporttier.equals("Enterprise")){
            supportfee=200;
        }

        double monthlytotal=basestoragecost+userfee+backuppremium+supportfee;
        double annual=(monthlytotal*12*0.9);
        String recomenndedplan="0";
        if(usercount==1){
            recomenndedplan="Personal";
            includedfeatures="Basic Storage,file sync";
        }
        else if(usercount>=2 && usercount<=20){
            recomenndedplan="Team";
            includedfeatures="Version history,file sharing,basic analytics";
        }
        else if(usercount>=21 && usercount<100){
            recomenndedplan="Business";
            includedfeatures="Advanced sharing,team analytics,priority support";
        }
        else if(usercount>=100){
            recomenndedplan="Enterprise";
            includedfeatures="Advanced security,compliance tools,dedicated support,API access";
        }

        System.out.printf("Storage Capacity: %d GB\n",storagegb);
        System.out.printf("User Count: %d\n",usercount);
        System.out.printf("Backup Frequency: %s\n",backupfrequency);
        System.out.printf("Support Tier: %s\n",supporttier);
        System.out.printf("Base Storage Cost: $%.1f\n",basestoragecost);
        System.out.printf("Per-User Fee: $%.1f\n",userfee);
        System.out.printf("Backup Premium: $%.1f\n",backuppremium);
        System.out.printf("Support Fee: $%.1f\n",supportfee);
        System.out.printf("Monthly Subscription: $%.1f\n",monthlytotal);
        System.out.printf("Annual Subscription: $%.1f(save 10%%)\n",annual);
        System.out.printf("Recommended Plan: %s\n",recomenndedplan);
        System.out.printf("Included Features: %s\n",includedfeatures);
        sc.close();
    }
}



