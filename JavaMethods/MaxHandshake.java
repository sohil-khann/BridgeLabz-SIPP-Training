import java.util.Scanner;

public class MaxHandshake {
    
    public static int print(int n) {
        int combination = (n * (n - 1)) / 2;
        return combination;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of students : ");
        int numberOfStudents=sc.nextInt();
        System.out.print(" number of handshake is : "+print(numberOfStudents));
        

    }

}
