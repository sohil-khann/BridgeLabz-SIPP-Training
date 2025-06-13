import java.util.*;
public class  Power_calc{ 
   public static void main(String[] args) {   
     Scanner sc = new Scanner(System.in);       
      double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        double ans = Math.pow(base, exponent);
        System.out.println(ans);
  }
}