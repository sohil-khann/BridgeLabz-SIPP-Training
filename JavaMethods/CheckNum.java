import java.util.Scanner;

public class CheckNum {
    
    protected static int check(int n) {
        if(n<0) return -1;
        if(n>0) return 1;
        
        return 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.print(" number is : "+check(n));

    }

}
