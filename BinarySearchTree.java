
import java.util.*;
public class BinarySearchTree {
	
	private ArrayList<ComputerParts> al;
	private treeNode root;
	public BinarySearchTree(){
		root = null;	
	}
	public boolean isEmpty(){	
		return (root == null);	
	}
	public void add (ComputerParts data){
		if (root ==null)
			root = new treeNode(data,null,null);
		else 
			add(data,root);	
	}
	
	private void add(ComputerParts data,treeNode cur){
		if (data.compareTo(cur.getData())<0){
			if (cur.getLeft()==null)
				cur.setLeft(new treeNode(data,null,null));
			else
				add(data,cur.getLeft());
		}
		else if (data.compareTo(cur.getData())>0){
			if (cur.getRight()==null)
				cur.setRight(new treeNode(data,null,null));
			else 
				add(data, cur.getRight());
		}
		else
			return;
		
	}
	public ArrayList displayInorder(){
		al = new ArrayList <ComputerParts>();
		if (root == null)
			System.out.println("tree is empty");
		else
			displayInorder(root);
		return al;
	}
	private void displayInorder(treeNode cur){
		if (cur!= null){
			displayInorder(cur.getLeft());
			al.add(cur.getData());
			displayInorder(cur.getRight());
		}
	}
	public ArrayList displayPreOrder(){
		al = new ArrayList <ComputerParts>();
		if (root == null)
			System.out.println("tree is empty");
		else
			displayPreOrder(root);
		return al;
	}	
	private void displayPreOrder(treeNode cur){
		if (cur !=null){
		al.add(cur.getData());
		displayPreOrder(cur.getLeft());
		displayPreOrder(cur.getRight());
		}
	}	
        public ArrayList displayPostOrder(){
		al = new ArrayList <ComputerParts>();
		if (root == null)
			System.out.println("tree is empty");
		else
			displayPostOrder(root);
		return al;
	}	
	private void displayPostOrder(treeNode cur){
		if (cur !=null){
		displayPostOrder(cur.getLeft());
		displayPostOrder(cur.getRight());
		al.add(cur.getData());
		}
	}
	public int count(){
		return count(root);
	}
	private int count (treeNode cur){
		if (cur==null)
			return 0;
		else
			return 1+ count(cur.getLeft())+ count(cur.getRight());	
	}
	public  ComputerParts searchForIt(ComputerParts part){
		if(root == null){
			return null;
		}
		else 
			return searchForIt(part,root);	
	}
	public ComputerParts searchForIt(ComputerParts p,treeNode cur){
		ComputerParts part = null;
		try{
		if (p.Eequals(cur.getData())){
			part = cur.getData();
			return part ;
		}
		else if (p.compareTo(cur.getData())<0)
			return searchForIt(p,cur.getLeft());
		else
			return searchForIt(p,cur.getRight());
				}
		catch (NullPointerException e0){
			return null;
			}
	}
	 public int depth (){
		 int dp=0;
		 if (root == null)
			 return -1;
		 else 
			 return depth(root, dp);	 
	 }
	 private int depth(treeNode cur, int depth){
		 int leftDepth = depth, rightDepth = depth;
		 if(cur.getLeft() != null)
			 leftDepth = depth(cur.getLeft(), depth+1);
		  if (cur.getRight() != null){
			 rightDepth = depth(cur.getRight(), depth+1);
		 }		 
			 if (leftDepth > rightDepth)
				 
				 return leftDepth;
			 
			 else 
				 return rightDepth;	 
	 }
	
	public static void main(String[] args) {
	
		BinarySearchTree myTree = new BinarySearchTree();
		
		ComputerParts l1 = new ComputerParts("A", "INTEL", "I7 2600K", 199.99, 1);
		ComputerParts l2 = new ComputerParts("B", "ASUS", "GTX1080", 500.99, 1);
		ComputerParts l3 = new ComputerParts("C", "CORSAIR", "2X4GB", 69.99, 1);
		ComputerParts l4 = new ComputerParts("D", "INTEL", "500GB", 149.99, 1);
		ComputerParts l7 = new ComputerParts("k", "gg", "500GB", 149.99, 1);
		ComputerParts l8 = new ComputerParts("T", "gg", "500GB", 149.99, 1);
		ComputerParts l9 = new ComputerParts("E", "gg", "500GB", 149.99, 1);
		ComputerParts l0 = new ComputerParts("F", "gg", "500GB", 149.99, 1);
		
		myTree.add(l1);
		myTree.add(l4);
		myTree.add(l7);
		myTree.add(l2);
		//myTree.add(l9);
		//myTree.add(l0);

		ArrayList listToDis = myTree.displayInorder();
		ArrayList listToDis2=myTree.displayPreOrder();
		ArrayList listToDis3=myTree.displayPostOrder();
		
		System.out.println(myTree.searchForIt(l2));
	}
}
