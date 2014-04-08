public class HanoiRecord extends ActivationRecord 
{
	private int line;
	private int n;
	private char src;
	private char dst;	
	private char tmp;
	public static int count = 0;
	
	public HanoiRecord(int newN, char source, char dest, char temp)
	{
		n = newN;
		src = source;
		dst = dest;
		tmp = temp;
	}
	
	public void run()
	{
		switch (line) 
		{
			case 0:	count++;
					if (n == 1) 
					{ 
						System.out.println("Move disk 1 from " + src + " to " + dst);
						HanoiR.h.pop();
						return;
					}
					HanoiR.h.push(new HanoiRecord(n-1, src, tmp, dst));
					line = 1;
					return;
			case 1: System.out.println("Move disk " + n + " from " + src + " to " + dst);
					line = 2;
					HanoiR.h.push(new HanoiRecord(n-1, tmp, dst, src));
					return;
			case 2: HanoiR.h.pop();
					return;
			default: System.out.println("\nWe should not get here.");
		}
	}
}