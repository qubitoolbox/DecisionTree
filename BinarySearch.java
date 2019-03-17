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
  
  
  }



}
