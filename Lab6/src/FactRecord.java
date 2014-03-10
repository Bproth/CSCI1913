public class FactRecord extends ActivationRecord 
{
	private int line = 0;
	private int n;
	
	public FactRecord(int newN) 
	{
		n = newN;
	}
	
	public void run() 
	{
		switch (line) 
		{
			case 0:	if (n == 0) 
					{
						FactR.returnedValue = 1; 
						FactR.s.pop();
						return;
					}
					FactR.s.push(new FactRecord(n - 1));
					line = 1; 
					return;
			case 1: FactR.returnedValue = n * FactR.returnedValue; 
					FactR.s.pop();
					return;
			default: System.out.println("\nWe should not get here.");
		}
	}
}