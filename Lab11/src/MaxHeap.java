
public class MaxHeap<T extends Comparable<T>> extends BinaryTree<T>
{
	private TreeNode<T> root;

	private void lSwap(TreeNode<T> cur, TreeNode<T> trail)
	{
		cur.getLeft().setRight(cur.getRight());
		cur.getLeft().setLeft(cur);
		cur = cur.getLeft();
		trail.setLeft(cur);
	}
	
	private void rSwap(TreeNode<T> cur, TreeNode<T> trail)
	{
		cur.getRight().setLeft(cur.getLeft());
		cur.getRight().setRight(cur);
		cur = cur.getRight();
		trail.setLeft(cur);
	}
	
	@Override
	public boolean add(T obj)
	{
		TreeNode<T> cur = root;
		while(cur.getLeft() != null)
		{
			cur = cur.getLeft();
		}
		cur.setLeft(new TreeNode<T>(obj));
		heapify();
		return true;
	}
	
	public void heapify()
	{
		TreeNode<T> cur = root;
		TreeNode<T> trail = new TreeNode<T>();
		while(cur.getLeft() != null)
		{
			trail = cur;
			cur = cur.getLeft();
		}
		if (cur.getLeft().getData().compareTo(cur.getData()) > 0)
		{
			swap(cur, trail);
		}
		if (cur.getRight().getData().compareTo(cur.getData()) > 0)
	}
}
