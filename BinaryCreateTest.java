import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
      else if(s==2)
      {      
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
        sctr.insert(root_);
        sctr.insert(income_high);
        sctr.insert(income_medium);
        sctr.insert(income_low);
        sctr.insert(student_yes);
        sctr.insert(student_yes);
        sctr.insert(student_no);
        sctr.insert(student_no);
        sctr.insert(credit_fair);
        sctr.insert(credit_excellent);
        sctr.insert(class_label_n);
        sctr.insert(class_label_y);
        done = true;
       }
       else if(s == 1)
       {
                
         root_ = GetData.getString("What is the name of root");                
         Integer tuple_size = GetData.getInt("What is the size of \n"
                        + " the DecisionTree?");
                
         sctr.insert(root_);
         
         for (int i = 0; i <= tuple_size;) {
           //test with four inputs
           if (tuple_size == 4)
           {
             String name = GetData.getString("What is the A leaf");
             sctr.insert(name); 
             i+=1;
             String age = GetData.getString("What is the B leaf");
             sctr.insert(age);
             i+=2;
             String married = GetData.getString("What is the C leaf");
             sctr.insert(married);
             i+=3;
             String money = GetData.getString("What is the D leaf");
             sctr.insert(money);
             i+= 4;
            }
            else;
           }
           sctr.insert(student_yes);
           sctr.insert(credit_fair);
           sctr.insert(credit_excellent);
           sctr.insert(class_label_n);
           sctr.insert(class_label_y);
           done = true;
           }
       }
       while (!done);
        
  }
}
