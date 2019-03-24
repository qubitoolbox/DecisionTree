public class BinaryCreateTest
{

  public static void main(String[] args)
  {
    //create object from BinarySearch class
    BinarySearch bsearch = new BinarySearchTree();
    
    String root_ = null;
    String student_yes = "student_yes";
    String credit_excellent = "credit_excellent";
    String class_label_n = "No";
    String class_label_y = "Yes";
    
    boolean done = false;
    do
    {
      int s = GetData.getInt(""
               + "********************************\n"
               + "This Program has Two options.\n"
               + "\n"
               + "\t 1. Press 2 to type Tuples manually\n"
               + "\t 2. Press 2 Create Random DecisionTree\n"
               + "\t 3. Press 3 to quit"
               + ""
               + ""
               + ""
               + ""
               + "");
        if(s==3)
          done = true;
        else if(s==2){
            
        root_ = "Age";
        //root_.toString(0b1);
        String income_high = "high";
        String income_medium = "medium_income";
        String income_low = "low_income"; // currently only values 0 and 1
        student_yes = "student_yes";
        String student_no = "student_no";
        credit_fair = "credit_fair";
        credit_excellent = "credit_excellent";
        class_label_n = "No";
        class_label_y = "Yes";
    

    }
  }


}
