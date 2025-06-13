import java.util.*;
public class Vol_cyl{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print("Enter the radius:");
int radius=sc.nextInt();
System.out.print("Enter the height:");
int height=sc.nextInt();
double Volume = 3.14 * radius*radius * height;
System.out.println("Volume is : "+Volume);
}
}