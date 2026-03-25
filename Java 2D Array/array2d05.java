import java.util.Scanner;

public class array2d05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Temperature Grid:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int max=Integer.MIN_VALUE;
        int index1=0;int index2=0;
        int min=Integer.MAX_VALUE;
        int index3=0;int index4=0;
        int total=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                total=total+arr[i][j];
                if(arr[i][j]>max){
                    max=arr[i][j];
                    index1=i;
                    index2=j;
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                    index3=i;
                    index4=j;
                }
            }
        }
        int n=r*c;
        double average=((double)total/(double)n)*100.00;
        System.out.printf("Maximum Temperature: %d C at position (%d, %d)\n",max,index1,index2);
        System.out.printf("Minimum Temperature: %d C at position (%d, %d)\n",min,index3,index4);
        System.out.printf("Average Temperature: %d C\n",(int)average);
        
sc.close();
    }
}
