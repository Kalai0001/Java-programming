import java.util.Scanner;
public class while03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int targetno=sc.nextInt();
        int guessno=-1;
        int attempt=0;
        while(guessno!=targetno){
            guessno=sc.nextInt();
            attempt++;
            if(guessno>targetno){
                System.out.printf("Guess the number (1100): %d\n",guessno);
                System.out.printf("Too high!\n");
            }
            else if(guessno<targetno){
                System.out.printf("Guess the number (1100): %d\n",guessno);
                System.out.printf("Too low!\n");
            }
            else{
                System.out.printf("Guess the number (1100): %d\n",guessno);
                System.out.printf("Correct!Attempts: %d\n",attempt);
                break;
            }
        }
        sc.close();
    }
}
