package fundamentals;
import java.util.*;
public class p4 {
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n");
        n = s.nextInt();
        s.close();
		if(n>0)
		{
			System.out.println(n+" is positive");
		}
		else if(n<0)
		{
			System.out.println(n+" is negative");
		}
		else
		{
			System.out.println(n+" is neither positive nor negative");
		}
	}
}