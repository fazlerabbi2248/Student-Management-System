
 
package projectsms;

import java.awt.Container;
import javax.swing.JFrame;


public class Frame extends JFrame{
     Container c;
    Frame(String cn){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle(cn);
        frame.setVisible(true);
        frame.add(c);  
    }
    
}
