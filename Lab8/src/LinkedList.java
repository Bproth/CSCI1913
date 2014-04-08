public class LinkedList<T extends Comparable<T>> implements List<T> 
{

	private SortKind sort;
	private boolean dup;
	private ListNode<T> head;
	
	public LinkedList()
	{
		this.head = new ListNode<T>(null, null);
		this.dup = false;
		this.sort = SortKind.Unsorted;
	}
	
	public LinkedList(T[] input, SortKind sorting, boolean duplicate)
	{
		dup = duplicate;
		sort = sorting;
		ListNode <T> currentNode = new ListNode<T>(input[0], null);
		this.head = new ListNode<T>(null, currentNode);
		for (int i = 1; i < input.length; i++)
		{
			this.add(input[i]);
		}
	}
	
	public LinkedList(SortKind sorting, boolean duplicate)
	{
		sort = sorting;
		dup = duplicate;
		this.head = new ListNode<T>(null, null);
	}
	
	public int length() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public T first() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public T last() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public boolean lookup(T obj) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	public T find(int n) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public int find(T obj) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(T obj) 
	{
		// TODO Auto-generated method stub
		
	}

	public void deleteIndex(int n) 
	{
		// TODO Auto-generated method stub
		
	}

	public void add(T obj) 
	{
		ListNode<T> newNode = new ListNode<T>(obj, null);
		int dir;
		switch(sort)
		{
			case Increasing:
				dir = -1;
				break;
			case Decreasing:
				dir = 1;
				break;
			case Unsorted:
				dir = 2;
				break;
			default:
				dir = 2;
				break;
		}
		ListNode.addTo(newNode, head, dir, dup);		
	}

	public T getNext() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public T getPrevious() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void reset() 

	{
		// TODO Auto-generated method stub
		
	}

	public void print()
	{
		head.printList();
	}
	
	public static void main (String args[])
	{
		Integer[] tst = {0,3,6,3,5,8,2};
		System.out.println("Using array: {0,3,6,3,5,8,2}");
		System.out.println("Unsorted, duplicates allowed");
		LinkedList chk1 = new LinkedList(tst, SortKind.Unsorted, true);
		chk1.print();
		System.out.println("Increasing, duplicates allowed");
		LinkedList chk2 = new LinkedList(tst, SortKind.Increasing, true);
		chk2.print();
		System.out.println("Decreasing, duplicates not allowed");
		LinkedList chk3 = new LinkedList(tst, SortKind.Decreasing, false);
		chk3.print();
	}
}
