import java.util.Scanner;
public class KiloToMile
{
	public static void main(String[] agrs)
{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		
		double Miles = k * 0.621371;		
		System.out.println("Miles : "+Miles);
	}
	
}