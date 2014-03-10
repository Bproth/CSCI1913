public class HanoiRecord extends ActivationRecord 
{
	private int line;
	
	private int n;
	
	private char src;
	
	private char dst;
	
	private char tmp;
	
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
			case 0:	if (n == 1) 
					{ 
						System.out.println("Move disk 1 from " + src + " to " + dst);
						HanoiR.h.pop();
						return;
					}
					else
					{
					HanoiR.h.push(new HanoiRecord(n - 1, src, tmp, dst));
					line = 1; 
					return;
					}
			case 1: 
					HanoiR.h.push(new HanoiRecord(n-1, src, tmp, dst));
					HanoiR.h.pop();
					System.out.println("Move disk " + n + " from " + src + " to " + dst);
					HanoiR.h.push(new HanoiRecord(n-1, tmp, dst, src));
					return;
			default: System.out.println("\nWe should not get here.");
		}
	}
}
