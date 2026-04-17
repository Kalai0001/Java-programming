import java.util.*;
class arraynexthalf{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=arr.length/2;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.printf("Sum of next half: %d",sum);
        sc.close();
    }
}