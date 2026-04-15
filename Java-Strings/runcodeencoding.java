import java.util.Scanner;

public class runcodeencoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int len=s1.length();
        char []arr=s1.toCharArray();
        String res="";
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;//count=3
            }
            else{
                res=res+arr[i-1];   //res=""+A;
                res=res+count;      //res=A+3=A3 now res=A3
                count=1;
            }
        }
        res=res+arr[arr.length-1];
        res=res+count;
        int reslen=res.length();

        float compressed=(((float)len-(float)reslen));
        float ratio=(compressed/(float)len)*100;
        System.out.printf("Original: %s\n",s1);
        System.out.printf("Compressed: %s\n",res);
        if(ratio>0){
            System.out.printf("Compression Ratio: %.2f%%",ratio);
        }
        else{
            System.out.println("Compression Ratio: 0.00% (Actually negative gain or same)");
        }
        sc.close();
    }
}
