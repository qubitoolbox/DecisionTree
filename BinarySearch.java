import java.util.*;
import java.io.IOException;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>>
{
  public static class BinaryNode
  {
  
    /*
    /*
    /*
    /*
    */
    */
    public Integer elem;
    public BinaryNode leftNode;
    public BinaryNode rightNode;
    
    
    BinaryNode(Integer rootElement)
    {
      this(rootElement, null, null);
    
    }
    
    BinaryNode(Integer element, BinaryNode left, BinaryNode right)
    {
      this.rootElement = element; leftNode = left; rightNode = right;
    
    }
    
    public BinaryNode root;
    
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
        
      int compareResult = x.compareTo(edge.element);
        
      if(compareResult < 0)
          t.left = insert(edge, leaf.left);
      else if(compareResult > 0)
          t.right = insert(edge, leaf.right);
      else
          ; //duplicate do nothing
      return t;
    
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
  
  
  }



}
