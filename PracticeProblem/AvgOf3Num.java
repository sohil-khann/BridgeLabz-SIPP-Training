import java.util.Scanner;
public class AvgOf3Num
{
	public static void main(String[] agrs)
{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Average is :"+( a+b+c )/3);
	}
	
}