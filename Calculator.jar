import javax.swing.JOptionPane;
import javax.swing.UIManager;

import javax.swing.plaf.ColorUIResource;

public class Calculator {
     public static void main(String args[]) {

            UIManager uim=new UIManager();
            UIManager.put("Panel.background",new ColorUIResource(128,128,128));
               
		String choice;               
                while (true){
		choice = JOptionPane.showInputDialog("""
                                                   Please Select an Operator (1-5):
                                                    1. Addidtion 
                                                    2. Subtraction 
                                                    3. Multiplication 
                                                    4. Division 
                                                    5. Exit
                                                     """);
                     
                switch (choice) {
                        case "1":
                              String no1_add = 
                              JOptionPane.showInputDialog("Enter the first value");
                              String no2_add =
                              JOptionPane.showInputDialog("Enter the second value");

                              double add1 = Double.parseDouble(no1_add); 
                              double add2 = Double.parseDouble(no2_add);
                              double sum = add1 + add2;

                              JOptionPane.showMessageDialog(null, "= " + sum, 
                         "Addition", JOptionPane.PLAIN_MESSAGE);
                                break;
                                
                        case "2":
                              String no1_minus = 
                              JOptionPane.showInputDialog("Enter the first value");
                              String no2_minus =
                              JOptionPane.showInputDialog("Enter the second value");

                              double minus1 = Double.parseDouble(no1_minus);
                              double minus2 = Double.parseDouble(no2_minus);
                              double minuend = minus1 - minus2;

                              JOptionPane.showMessageDialog(null, "= " + minuend,
                         "Subtraction", JOptionPane.PLAIN_MESSAGE);
                              break;
                             
                        case "3":
                              String no1_times =
                              JOptionPane.showInputDialog("Enter the first value");
                              String no2_times =
                              JOptionPane.showInputDialog("Enter the second value");

                              double times1 = Double.parseDouble(no1_times);
                              double times2 = Double.parseDouble(no2_times);
                              double product = times1 * times2;

                              JOptionPane.showMessageDialog(null, "= " + product,
                         "Multiplication", JOptionPane.PLAIN_MESSAGE);
                              break;
                             
                         case "4":
                              String no1_divide =
                              JOptionPane.showInputDialog("Enter the first value");
                              String no2_divide =
                              JOptionPane.showInputDialog("Enter the second value");

                              double divide1 = Double.parseDouble(no1_divide);
                              double divide2 = Double.parseDouble(no2_divide);
                              double quotient = divide1 / divide2;
                              JOptionPane.showMessageDialog(null, "= " + quotient,
                         "Division", JOptionPane.PLAIN_MESSAGE);         
                              break;

                         case "5":
                                JOptionPane.showMessageDialog(null,"Thank you, goodbye.");
                                System.exit(0);
                                break;
                        default:
                           JOptionPane.showMessageDialog(null,"Invalid, please try again.");
                           break;
                    }
       
}
        
}
}