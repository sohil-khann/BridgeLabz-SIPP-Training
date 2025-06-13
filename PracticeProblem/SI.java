import java.util.*;
public class SI{
       public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
           System.out.print("Enter the Principal:");
         int principal=sc.nextInt();
          System.out.print("Enter the Rate:");
         int Rate=sc.nextInt();
          System.out.print("Enter the Time:");
         int Time=sc.nextInt();
          double SI = (principal * Rate * Time) / 100;
         System.out.println("interest is : "+SI);
}
}