import javax.swing.JOptionPane;
//wrapper class to parse values.
public class GetData 
{
    
    public static double getDouble(String s)
    {
        
        return Double.parseDouble(getString(s));
    }
    
    public static int getInt(String s)
    {
        
        return Integer.parseInt(getString(s));
    }
    
    public static String getString(String s)
    {
        
        return JOptionPane.showInputDialog(s);
    }
    
    
}
