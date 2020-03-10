
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Teachers extends JFrame{
    
    Container c;
     JButton back;
    
    Teachers(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        back=new JButton("Back");
        back.setBounds(180,570,150,50);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        c.add(back);
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Teacher");
        frame.setVisible(true);
        frame.add(c);
        
        
        back.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                AddMember login = new AddMember();           
        }
        
        });
        back.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
               if(e.getSource()==back){
                 
                    dispose();
                    AdminstratorDemo admin = new AdminstratorDemo();
                    
                }
        }
   
        
        });
    }
    
    
    
}
