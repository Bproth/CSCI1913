
public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
	
	//Variables
	private TreeNode<T> root;
	
	//Constructors
	public BinarySearchTree()
	{
		root = null;
	}
	
	public BinarySearchTree(T data)
	{
		root = new TreeNode<T>(data, null, null);
	}
	
	@Override
	public boolean add(T input)
	{
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
				if (cur.getData().compareTo(input) > 0)
				{
					if (cur.getLeft() == null)
					{
						cur.setLeft(in);
						return true;
					}
					else
					{
						cur = cur.getLeft();
					}
				}
				else
				{
					if (cur.getRight() == null)
					{
						cur.setRight(in);
						return true;
					}
					else
					{
						cur = cur.getRight();
					}
				}
			}
		}
	}
	
	@Override
	public String toString()
	{
		String out = new String();
		
		out = root.toString();
		
		return out;
	}
	
	public boolean delete(T obj)
	{
		TreeNode<T> cur = root;
		TreeNode<T> trail = null;
		String dir = "";
		while (cur.getData() != obj)
		{
			if (cur.getLeft().dfs(obj))
			{
				trail = cur;
				cur = cur.getLeft();
				dir = "Left";
			}
			else 
			{
				trail = cur;
				cur = cur.getRight();
				dir = "Right";
			}
		}
		if (cur.getLeft() == null && cur.getRight() == null)
		{
			if (dir == "Right") trail.setRight(null);
			else trail.setLeft(null);
			return true;
		}
		else if (cur.getLeft() == null)
		{
			if (dir == "Right") trail.setRight(cur.getRight());
			else trail.setLeft(cur.getRight());
			return true;
		}
		else if (cur.getRight() == null)
		{
			if (dir == "Right") trail.setRight(cur.getLeft());
			else trail.setLeft(cur.getLeft());
			return true;
		}
		else
		{
			cur.setData(cur.getLeft().getRightMost());
			cur.getLeft().removeRightMost();
			return true;
		}
	}
	
	public static void main(String Args[])
	{
		BinarySearchTree<Integer> test = new BinarySearchTree<Integer>(5);
		Integer[] testA = {1,9,2,8,3,7,4,6};
		
		for (int i = 0; i < testA.length; i++)
		{
			test.add(testA[i]);
		}
		test.print();
	
		test.delete(1);
		test.print();
	}

}
