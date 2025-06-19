import java.util.Scanner;

public class SumOfNaturaNum {
    protected static int naturalSum(int n) {
        int result=0;
        for(int i=1;i<=n;i++) {
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.print(" sum is : "+naturalSum(n));

    }

}
