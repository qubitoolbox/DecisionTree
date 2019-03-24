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
    
    public void insert(Integer x)
    {
      root = inser(x, root);
    
    
    }
    
    public void remove(Integer edge)
      
      root = remove(edge, root);
    }
    
    public BinaryNode insert(Integer edge, BinaryNode leaf)
    {
      if (edge==null) 
          return new BinaryNode(edge, null, null);
        
      int compareResult = edge.compareTo(leaf.rootElement);
        
      if(compareResult < 0)
          t.left = insert(edge, leaf.left);
      else if(compareResult > 0)
          t.right = insert(edge, leaf.right);
      else
          ; //duplicate do nothing
      return leaf;
    
    }
    
    private void printTree(BinaryNode t)
    {
      if(t != null)
      {
        System.out.println("root" + t.element + " ");
          printTree(t.left);
        System.out.print("left leaf" + t.element + " ");
          printTree(t.right);
        System.out.println("right leaf"+ t.element + " ");
      
      
      }
    }
    public void show(String t){
    
      String node = t;
      String str = "";
      while(node!=null)
      {
      
        str += node;// + " - 
       }
        JTextArea text = new JTextArea(str, 20,30);
        JScrollPane pane = new JScrollPane(text);
        JOptionPane.showMessageDialog(null, pane, "", JOptionPane.INFORMATION_MESSAGE);
        
    }

  }
}
