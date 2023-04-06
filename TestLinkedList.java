/*package main;
 * import linkedlist.Node;
 * import linkedlist.LinkedList;
 * 
 * @author rkelley/njohnson and Brandon Esarey
 * Programming Project 1 Start Project
 * CS131ON
*/
public class TestLinkedList {

	public static void main(String[] args) {
		
		GenericLinkedList myList=new GenericLinkedList();
		
		GenericNode aNode=new GenericNode();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		GenericLinkedList<Integer> IntegerLink = new GenericLinkedList<Integer>();
		GenericLinkedList<Double> DoubleLink = new GenericLinkedList<Double>();
		GenericLinkedList<String> StringLink = new GenericLinkedList<String>();
	}//end main

}//end class
