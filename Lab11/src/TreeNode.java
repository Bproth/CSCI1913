public class TreeNode<T extends Comparable<T>>
{
	 private T data; 
	 private TreeNode<T> right = null; 
	 private TreeNode<T> left = null; 


	 public TreeNode()
	 {
		 data = null;
	 }
	 
	 public TreeNode(T d)
	 {
		 data = d;
	 }

	 public TreeNode(T d, TreeNode<T> l, TreeNode<T> r)
	 {
		 data = d;
		 left = l;
		 right = r;
	 }
	 
	 public T getData()
	 {
		 return data;
	 }
	 
	 public TreeNode<T> getLeft()
	 {
		 return left;
	 }
	 
	 public TreeNode<T> getRight()
	 {
		 return right;
	 }
	 
	 public void setData(T dat)
	 {
		 data = dat;
	 }
	 
	 public void setLeft(TreeNode<T> l)
	 {
		 left =l;
	 }
	 
	 public void setRight(TreeNode<T> r)
	 {
		 right =r;
	 }
	 
	 public String toString()
	 {
		 String out = "";
		 if (left != null)
		 {
			 out += left.toString();
		 }
		 if(out.length() != 0)
		 {
			 out += "," + data.toString();
		 }
		 else out+= data.toString();
		 if (right != null)
		 {
			 if (out.length() != 0){
				 out += "," + right.toString();
			 }
			 else out += right.toString();
		 }
		 return out; 
	 }

	 public boolean dfs(T obj)
	 {
		 if (data.equals(obj))
		 {
			 return true;
		 }
		 
		 boolean test = false;
		 
		 if (left != null)
		 {
			 test = left.dfs(obj);
		 }
		 
		 if (test)
		 {
			 return true;
		 }
		 else
		 {
			 if (right == null)
			 {
				 return false;
			 }
			 else
			 {
				 return right.dfs(obj);
			 }
		 }
	 }

	 public T getRightMost()
	 {
		 if (right != null)
		 {
			 return right.getRightMost();
		 }
		 else
		 {
			 return this.data;
		 }
	 }

	 public void removeRightMost()
	 {
		 if (right.getRight() != null)
		 {
			 right.getRightMost();
		 }
		 else
		 {
			 right = right.getLeft();
		 }
	 }
}