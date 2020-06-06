package verticalOrder;
//https://www.techiedelight.com/vertical-traversal-binary-tree/   for tutorial 
import java.util.*;

//Data Structure to store a binary tree node
class Node
{
	int data;
	Node left,right;

	Node(int data) {
		this.data = data;
		left=right=null;
	}
}

//Pair class for storing 
class Pair
{
	Node first;   //store node
	int second;   //store height
	Pair(Node first,int second)//intialization
	{
		this.first=first;
		this.second=second;
	}
}

class vertical_order
{
	// Utility function to add an element to List corresponding to the
	// given key in a Map<Integer,List<Integer>>.
	public static void insertIntoMultiMap(TreeMap<Integer,List<Integer>> map,Integer key, Integer value) {
		if (!map.containsKey(key)) {
			ArrayList al= new ArrayList<>();//create empty array list
			map.put(key,al);//put key value corresponds empty arraylist
		}
		map.get(key).add(value);//get key from map and add  value in its list corresponding key
	}

	// Function to perform vertical traversal of a given binary tree
	public static void printVertical(Node root)
	{
		// base case
		if (root == null) {
			return;
		}

		// Create a TreeMap to store vertical order of binary tree nodes
		TreeMap<Integer, List<Integer>> map = new TreeMap<>();

		// create an empty queue for level order traversal
		// It stores binary tree nodes and their horizontal distance from root
		Queue<Pair> q = new LinkedList<>();

		// enqueue root node with horizontal distance as 0
		Pair p=new Pair(root,0);
		q.add(p);

		// run till queue is not empty
		while (!q.isEmpty())
		{
			// pop front node from the queue
			Node node = q.peek().first;
			int dist = q.peek().second;
            q.remove();
			// insert front node value to the map using its horizontal distance
			// as the key
//			add hd=0 to hash table initlally.
			insertIntoMultiMap(map, dist, node.data);

			// enqueue non-empty left and right child of front node
			// with their corresponding horizontal distance
			if (node.left != null) {
				Pair s=new Pair(node.left, dist - 1);
				q.add(s);
			}

			if (node.right != null) {
				Pair t=new Pair(node.right, dist + 1);
				q.add(t);
			}
		}

		// print the TreeMap
		for (List<Integer> list: map.values()) {
			
		     for(int i:list)
		     {
		    	 System.out.print(i+" ");	
		     }
		}
	}

	public static void main(String[] args)
	{
		
//       BT creation
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(8);
		root.right.left.right.left = new Node(9);
		root.right.left.right.right = new Node(10);
//
		printVertical(root);
	}
}