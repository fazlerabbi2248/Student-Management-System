
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AddCourses extends JFrame{
    
     Container c;
     JLabel CourseNamelabel,CourseCodelabel,CourseDescriptionlabel;
     JTextField CourseName,CourseCode,CourseDescription;
     // JTextArea desArea;
      JButton back,Add,home;
      Font F;
      JScrollPane DescriptionAreaScroll;
      JFrame frame;
    
    
    AddCourses(){
        initComponents();
        
    }
    public void initComponents(){
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(0, 230, 230));
        
        F = new Font("Arial",Font.BOLD,30);
        
        CourseNamelabel = new JLabel("Course Name          :");
        CourseNamelabel.setBounds(220, 50, 300,60);
        CourseNamelabel.setFont(F);
        c.add(CourseNamelabel);
        
        CourseName = new JTextField();
        CourseName.setBounds(520, 50, 400,60);
        CourseName.setFont(F);
        c.add(CourseName);
        
        CourseCodelabel = new JLabel("Course Code           :");
        CourseCodelabel.setBounds(220, 130, 300,60);
        CourseCodelabel.setFont(F);
        c.add(CourseCode);
        
       
        CourseCode = new JTextField();
        CourseCode.setBounds(520, 130, 400,60);
        CourseCode.setFont(F);
        c.add(CourseCode);
        
        
        CourseDescriptionlabel = new JLabel("Course Description:");
        CourseDescriptionlabel.setBounds(220, 200, 320,60);
        CourseDescriptionlabel.setFont(F);
        c.add(CourseDescriptionlabel);
        
        CourseDescription = new JTextField();
        CourseDescription.setBounds(520, 200, 400, 60);
        CourseDescription.setFont(F);
        c.add(CourseDescription);
         
        
       
         
         
        Add = new JButton("Add");
        Add.setBounds(780,500,130,50);
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.setFont(F);
        c.add(Add);
        
        
        
        
        home = new JButton("Home");
        home.setBounds(780, 560, 130, 50);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        home.setFont(F);
        c.add(home);
        
        
         frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Add Course");
        frame.setVisible(true);
        frame.add(c);
        
        
        
    }
    
    
    
}
