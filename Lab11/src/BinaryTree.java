
public class BinaryTree<T extends Comparable<T>> 
{
//Variables
	private TreeNode<T> root;
	
//Constructors
	public BinaryTree()
	{
		root = null;
	}
	
	public BinaryTree(T data)
	{
		root = new TreeNode<T>(data, null, null);
	}
	
//Helper Methods
	protected Queue<TreeNode<T>> breadthQueue()
	{
		Queue<TreeNode<T>> q = new Queue<TreeNode<T>>();
		Queue<TreeNode<T>> out = new Queue<TreeNode<T>>();
		TreeNode<T> cur = new TreeNode<T>();
		
		if (root == null)
		{
			out.add(root);
			return out;
		}
		else
		{
			out.add(root);
			q.add(root.getLeft());
			q.add(root.getRight());
			cur = q.remove();
			out.add(cur);
			while (cur != null)
			{
				q.add(cur.getLeft());
				q.add(cur.getRight());
				cur = q.remove();
				out.add(cur);
			}
		}
		return out;
	}
	
//Public Methods
	public boolean add(T input)
	{	
		Queue<TreeNode<T>> q = new Queue<TreeNode<T>>();
		TreeNode<T> cur = new TreeNode<T>();
		TreeNode<T> in = new TreeNode<T>(input);
		
		if (root == null)
		{
			root = in;
			return true;
		}
		else if (findDFS(input))
		{
			return false;
		}
		else
		{
			cur = root;
			while (true)
			{
				if (cur.getLeft() == null)
				{
					cur.setLeft(in);
					return true;
				}
				q.add(cur.getLeft());
				if (cur.getRight() == null)
				{
					cur.setRight(in);
					return true;
				}
				q.add(cur.getRight());
				cur = q.remove();
			}
		}
	}
	
	public String toString()
	{
		String out = "";
		Queue<TreeNode<T>> q = breadthQueue();
		if (q.length() == 0)
		{
			return out;
		}
		out += q.remove().toString();
		while (q.front() != null)
		{
			out += "," + q.remove().toString();
		}
		return out;
	}
	
	public void print()
	{
		System.out.println(toString());
	}
	
	public boolean findDFS(T data)
	{
		if (root == null)
		{
			return false;
		}
		return root.dfs(data);
	}

	public static void main(String Args[])
	{
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		Integer[] unit = {1,3,5,7,9};
		
		for (int i = 0; i < unit.length; i++)
		{
			tree.add(unit[i]);
		}
		tree.print();
		
		System.out.println(tree.findDFS(5));
		System.out.println(tree.findDFS(7));
		System.out.println(tree.findDFS(9));
		System.out.println(tree.findDFS(10));
	}
}