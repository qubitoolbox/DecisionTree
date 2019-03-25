import java.util.*;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>>
{
  public static class BinaryNode 
  {
    public String element; //The Data in the node
    public BinaryNode left; //right child
    public BinaryNode right; // left child
        
        
    BinaryNode(String theElement)
    {
      this(theElement, null, null);
    }
    
    BinaryNode(String element, BinaryNode left, BinaryNode right )
    {
      this.element = element; this.left = left; this.right = right;
    }

  }
  //variable containing the parent value of every child
  public BinaryNode root;
    
  //root is first initialized as null value
  public BinarySearchTree()
  {
    root = null;
  }
  
  public void makeEmpty()
  {
    root= null;
  }
  public boolean isEmpty()
  {
    return root == null;
  }
    
  public String contains(String x)
  {
    return contains(x,root);
  }
    
  public void insert(Integer x)
  {
    root = inser(x, root);
  }
  
  public void remove(Integer edge)
  {
    root = remove(edge, root);
  }
    
  public String contains(String x, BinaryNode t)
  {
    
    if (t == null) 
      return "t";
      //x.toCharArray();
      int compareResult = x.compareTo(t.element);
        
    if(compareResult < 0)
      return contains(x, t.left);
    else if(compareResult > 0)
      return contains(x, t.right);
    else
      return "t.right"; //match
   }
    
   public BinaryNode insert(String x, BinaryNode t)
   {
     if (t==null) 
       return new BinaryNode(x, null, null); 
     int compareResult = x.compareTo(t.element);
     if(compareResult < 0)
       t.left = insert(x, t.left);
     else if(compareResult > 0)
       t.right = insert(x, t.right);
     else
       ; //duplicate do nothing
     return t;
    
    }
    
    private void printTree(BinaryNode t)
    {
      if(t != null)
      {
        printTree(t.left);;
        System.out.println(t.element);
        printTree(t.right);
        System.out.println("\t" + t.element);
      }
    }
    public void show(String t)
    {
      String node = t;
      String str = "";
      while(node!=null)
      {
        str += node;// + " - 
      }
      JTextArea text = new JTextArea(str, 20,30);
      JScrollPane pane = new JScrollPane(text);
      JOptionPane.showMessageDialog(null, pane, "", JOptionPane.INFORMATION_MESSAGE)  
    }
  }
}
