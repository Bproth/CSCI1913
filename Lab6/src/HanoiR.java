import java.util.Scanner;

public class HanoiR 
{
	public static Stack1Gen<HanoiRecord> h = new Stack1Gen<HanoiRecord>();
	
	public static void main(String[] args) 
	{
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How large of a tower would you like to solve? ");
		n = input.nextInt();
		System.out.println("\nTower of Hanoi Solution for " + n + " disks:"); 
		h.push(new HanoiRecord(n, 'a', 'b', 'c'));
		while(!h.isEmpty())
		{
			h.top().run();
		}
		System.out.println("\nSolution complete in " + HanoiRecord.count + " moves");
		input.close();
		HanoiRecord.count = 0;
	}
}