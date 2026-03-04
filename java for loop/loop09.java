import java.util.Scanner;

public class loop09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String exercisetype="0";
        int durationminutes=0;
        int caloriesburned=0;
        int totalduration=0;
        int totalcalories=0;
        String intensity="0";
        String fitnesslevel="0";
        for(int i=1;i<=n;i++){
            exercisetype=sc.next();
            durationminutes=sc.nextInt();
            if(exercisetype.equals("Running")){
                caloriesburned=10*durationminutes;
                intensity="High";
            }
            else if(exercisetype.equals("Swimming")){
                caloriesburned=12*durationminutes;
                intensity="High";
            }
            else if(exercisetype.equals("Cycling")){
                caloriesburned=8*durationminutes;
                intensity="Moderate";
            }
            else if(exercisetype.equals("Gym")){
                caloriesburned=7*durationminutes;
                intensity="Moderate";
            }
            else if(exercisetype.equals("Walking")){
                caloriesburned=4*durationminutes;
                intensity="Low";
            }
            totalduration=totalduration+durationminutes;
            totalcalories=totalcalories+caloriesburned;

            System.out.printf("Session %d: %s\n",i,exercisetype);
            System.out.printf("Duration: %d minutes\n",durationminutes);
            System.out.printf("Calories Burned: %d\n",caloriesburned);
            System.out.printf("Intensity: %s\n",intensity);
        }
        double averagecalories=(double)totalcalories/n;
        if(totalcalories<300){
            fitnesslevel="Beginner";
        }
        else if(totalcalories>=300 && totalcalories<1000){
            fitnesslevel="Intermediate";
        }
        else if(totalcalories>1000){
            fitnesslevel="Advanced";
        }
        System.out.printf("Total Workouts: %d\n",n);
        System.out.printf("Total Duration: %d minutes\n",totalduration);
        System.out.printf("Total Calories Burned: %d\n",totalcalories);
        System.out.printf("Average Calories per Session: %.2f\n",averagecalories);
        System.out.printf("Fitness Level: %s\n",fitnesslevel);
        sc.close();
    }
}
