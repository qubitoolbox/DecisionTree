public class BinaryCreateTest
{

  public static void main(String[] args)
  {
    //create object from BinarySearch class
    BinarySearch bsearch = new BinarySearchTree();
    //Although not random, nodes can be based off this data
    Integer root_ = 21; //resembling age
    Integer income_high = 7;
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
    //iterate up to 100 times, although
    //values can be set randomly.
    for (int i = 0; i < 100; i++)
    {
      while (!checker)
      {
        //print message only to know that app is running
        System.out.println("Still printing " + " 'i' is equal to " + i);
        //for even values, set nodes to 0
        //otherwise set nodes to 1
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
          //when iterations reach 99, program will stop
          //value is custom
          if (i==99)
          {checker = true;}
        
          i += 1;
        }
        
        }
    }
  }


}
