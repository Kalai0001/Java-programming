import java.util.Scanner;

public class nested05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int daysinmonth=sc.nextInt();
        int startday=sc.nextInt();
        int totalcells=startday-1+daysinmonth;
        System.out.println("Calendar Grid:");
        System.out.printf("Mon Tue Wed Thu Fri Sat Sun");
        System.out.println();



        for(int k=1;k<startday;k++){
            System.out.printf("  ");
        }
        for(int i=1;i<=totalcells;i++){
            for(int j=1;j<=daysinmonth;j++){
                if(startday==1){
                    System.out.printf("%-4d",j);
                    if(j%7==0){
                        System.out.println();
                    }
                }
                
                else if(startday==2){
                    System.out.printf("%-4d ",j);
                    if((j+1)%7==0){
                        System.out.println();
                    }
                }

                else if(startday==3){
                    System.out.printf("%-4d ",j);
                    if((j+2)%7==0){
                        System.out.println();
                    }
                }
                else if(startday==4){
                    System.out.printf("%-4d ",j);
                    if((j+3)%7==0){
                        System.out.println();
                    }
                }
                else if(startday==5){
                    System.out.printf("%-4d ",j);
                    if((j+4)%7==0){
                        System.out.println();
                    }
                }
                else if(startday==6){
                    System.out.printf("%-4d ",j);
                    if((j+5)%7==0){
                        System.out.println();
                    }
                }
                else if(startday==7){
                    System.out.printf("%-4d ",j);
                    if((j+6)%7==0){
                        System.out.println();
                    }
                }
            }
            break;
        }
        sc.close();
    }
}
