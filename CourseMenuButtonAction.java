
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class CourseMenuButtonAction extends CourseMenu{
    
    CourseMenuButtonAction(){
        
        
       home.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home hm = new Home();           
        }
        
        });
    }
    
    public static void main(String[] args) {
        CourseMenuButtonAction nm = new CourseMenuButtonAction();
    }
    
}
