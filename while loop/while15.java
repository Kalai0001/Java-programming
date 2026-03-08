import java.util.Scanner;

public class while15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int a1=0;
        // int a2=0;
        int count=0;
        System.out.printf("Collatz sequence starting from %d:\n",n);
        System.out.printf("%d ",n);
        do{
            if(n==1){
                break;
            }
            else if(n%2==0){
                n=n/2;
            }
            else{
                n=n*3+1;
            }
            count++;
            System.out.printf("%d ",n);
            
        }while(n!=1);
        System.out.printf("\nSteps: %d",count);
        sc.close();
        
    
    }
}

