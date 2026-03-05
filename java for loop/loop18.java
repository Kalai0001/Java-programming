import java.util.Scanner;
public class loop18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hour=0;
        double temperature=0;
        String status="0";
        double hightemp=0;
        double lowtemp=100;
        int hotcount=0;
        int coldcount=0;
        double totaltemperature=0;
        int hr1=0;
        int hr2=0;
        for(int i=1;i<=n;i++){
            hour=sc.nextInt();
            temperature=sc.nextDouble();
            if(temperature>40 || temperature<0){
                status="Extreme";
            }
            else if(temperature>=32 && temperature <=40){
                status="Hot";
                hotcount++;
            }
            else if(temperature>=0 && temperature <=10){
                status="Cold";
                coldcount++;
            }
            else if(temperature>=10 && temperature<32){
                status="Normal";
            }
            if(temperature>hightemp){
                hightemp=temperature;
                hr1=hour;
            }
            if(temperature<lowtemp){
                lowtemp=temperature;
                hr2=hour;
            }
            totaltemperature=totaltemperature+temperature;

            System.out.printf("Hour %d: %.1fC\n",hour,temperature);
            System.out.printf("Status: %s\n",status);
            System.out.println();
        }
        double average=totaltemperature/n;
        System.out.printf("Total Readings: %d\n",n);
        System.out.printf("Average Temperature: %.2fC\n",average);
        System.out.printf("Highest Temperature: %.1fC at Hour %d\n",hightemp,hr1);
        System.out.printf("Lowest Temperature: %.1fC at Hour %d\n",lowtemp,hr2);
        System.out.printf("Hot Hours: %d\n",hotcount);
        System.out.printf("Cold Hours: %d\n",coldcount);
        sc.close();
    }
}
