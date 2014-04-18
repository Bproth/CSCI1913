
public class MaxHeap<T extends Comparable<T>> extends BinaryTree<T>
{
	private TreeNode<T> root;

	@Override
	public boolean add(T obj)
	{
		if (root.getData().compareTo(obj) < 0)
		{
			
			return true;
		}
		else
		{
			return super.add(obj);
		}
	}
	
	public void heapify()
	{
		if (root.getData().compareTo(root.getLeft().getData()) < 0)
		{
			
		}
	}
}
