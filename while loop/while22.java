import java.util.Scanner;

public class while22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=num;
        int range=sc.nextInt();
        int sum=0;
        
        while(i<=range){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
            
        }
        System.out.printf("Sum of even numbers from %d to %d: %d",num,range,sum);
        sc.close();
    }
}
