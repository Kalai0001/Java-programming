import java.util.*;
class arraycopy{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr1[]=new int[size];
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.printf("%d ",arr2[i]);
        }
        sc.close();
    }
}