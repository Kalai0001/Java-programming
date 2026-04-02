import java.util.Scanner;

public class nested08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int days=sc.nextInt();
        int perfect=0;
    
        System.out.println("Attendance Matrix:");
        System.out.print("Student"+" ");
        for(int i=1;i<=days;i++){
            System.out.printf("Day %d ",i);
        }
        System.out.print("Attendance");
        System.out.println();
        for(int i=1;i<=students;i++){
            String sname=sc.next();
            System.out.printf("%s ",sname," ");
            int count=0;
            for(int j=1;j<=days;j++){
                String status=sc.next();
                System.out.printf("%s ",status);
                if(status.equals("P")){
                    count++;
                }
                if(count==days){
                    perfect++;
                }
                
            }
            double percentage=((double)count/(double)days)*100;
            System.out.printf("%.2f%%",percentage);
            System.out.println();
        }
        System.out.println();
        System.out.printf("Perfect Atttendance: %d",perfect);

        sc.close();
        }
        
    }

