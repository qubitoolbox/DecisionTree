public class BinaryCreateTest
{

  public static void main(String[] args)
  {

    BinarySearch bsearch = new BinarySearchTree();
    
    Integer root_ = 25; //resembling age
    Integer income_high = 5;
    Integer income_medium = 3;
    Integer income_low = 0;   
    Integer student_yes = 0;
    Integer student_no = 1;
    Integer credit_fair = 0;
    Integer credit_excellent = 1;
    Integer class_label_n = 0;
    Integer class_label_y = 1;
    sctr.insert(root_)
    //while loop stopper
    boolean checker = false;
    for (int i = 0; i < 100; i++)
    {
      while (!checker)
      {
        System.out.println("Still printing " + " 'i' is equal to " + i);
        if(i % 100 == 0)
        {
          sctr.insert(income_low - 1);
        } else
          sctr.insert(income_low + 1);  
        
        if(i % 100 == 0)
        {
          sctr.insert(student_yes - 1);
        }else
          sctr.insert(student_yes + 1);
        if(i % 100 == 0)
        {
          sctr.insert(credit_excellent - 1);
        }else
          sctr.insert(credit_excellent + 1);  
        if(i % 100 == 0)
        {
          sctr.insert(class_label_y - 1);
         }else
          sctr.insert(class_label_y + 1);
        
          if (i==99)
          {checker = true;}
        
          i += 1;
        }
        
        }
    }
    

  }


}
