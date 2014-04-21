
public class MaxHeap<T extends Comparable<T>> extends BinaryTree<T>
{
	private TreeNode<T> root;
	
	public MaxHeap() {
		root = new TreeNode<T>();
	}
	
	public MaxHeap(T obj) {
		root = new TreeNode<T>(obj);
	}

	private void swap(TreeNode<T> cur, TreeNode<T> trail)
	{
		T temp = trail.getData();
		trail.setData(cur.getData());
		cur.setData(temp);
	}
	
	private int compare(TreeNode<T> cur, TreeNode<T> trail){
		return cur.getData().compareTo(trail.getData());
	}

	@Override
	public boolean add(T input)
	{
		TreeNode<T> cur = new TreeNode<T>();
		TreeNode<T> trail = new TreeNode<T>();
		TreeNode<T> in = new TreeNode<T>(input);
		Queue<TreeNode<T>> q = new Queue<TreeNode<T>>();
		
		cur = root;
		while (true)
		{
			if (cur.getLeft() == null)
			{
				cur.setLeft(in);
				trail = cur;
				cur = cur.getLeft();
				break;
			}
			q.add(cur.getLeft());
			if (cur.getRight() == null)
			{
				cur.setRight(in);
				trail = cur;
				cur = cur.getRight();
				break;
			}
			q.add(cur.getRight());
			cur = q.remove();
		}
		if (compare(cur, trail) < 0)
		{
			return true;
		}
		else
		{

		}
		return true;
	}
	
	public void heapify(TreeNode<T> top)
	{
		if(top.getLeft() != null)
		{
			if (top.getLeft().getData().compareTo(top.getData()) > 0)
			{
				swap(top.getLeft(), top);
			}
			heapify(top.getLeft());
		}
		if(top.getRight() != null)
		{
			if (top.getRight().getData().compareTo(top.getData()) > 0)
			{
				swap(top.getRight(), top);
			}
			heapify(top.getRight());
		}
	}
}
