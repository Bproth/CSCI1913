
public class HanoiR 
{
	public static Stack1Gen<HanoiRecord> h = new Stack1Gen<HanoiRecord>();
	
	public static void main(String[] args) 
	{
		System.out.println("\nTower of Hanoi Solution for " + 3 + " disks:"); 
		h.push(new HanoiRecord(3, 'a', 'b', 'c'));
		while(!h.isEmpty())
		{
			h.top().run();
		}
	}
}
