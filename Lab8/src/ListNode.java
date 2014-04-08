public class ListNode<T extends Comparable<T>>
{
	private T data;
	
	private ListNode<T> next;
	
	public ListNode(T obj, ListNode<T> nxt)
	{
		data = obj;
		next = nxt;
	}
	
	public T getData()
	{
		return data;
	}
	
	public ListNode<T> getNext()
	{
		if (next!= null)
			return next;
		else
			return null;
	}
	
	public void setData(T value)
	{
		data = value;
	}
	
	public void setNext(ListNode<T> nxt)
	{
		next = nxt;
	}
	
	public void printList()
	{
		if (data != null)
			System.out.println(data);
		if (next != null)
		{
			next.printList();
		}
	}
	
	/* Direction is -1 for Increasing
	 * Direction is +1 for decreasing
	 * Direction is +2 for Unsorted
	 */
	public static void addTo(ListNode newNode, ListNode list, int direction, boolean dup)
	{
		ListNode current = list;
		ListNode last = null;
		
		if(list.getData() == null)
		{
			last =list;
			current =list.getNext();
		}
		
		while(current != null && 
				current.getData().compareTo(newNode.getData()) == direction)
		{
			last = current;
			current = current.getNext();
		}
		
		if (current == null ||
				dup || 
				current.getData().compareTo(newNode.getData()) != 0)
		{
			last.setNext(newNode);
			newNode.setNext(current);
		}
	}
}