
package projectsms;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;


public class Routine extends JFrame{
    
    private Container c;
    private Font F,oF;
    private JLabel instituteName,universityName,programName,routineLabel,session,year,term;
    private JTable routine;
    private JList teacherName;
    Routine(){
        
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        F=new Font("Arial",Font.BOLD,20);
        
        instituteName = new JLabel("Institute oF InFormation Technology(IIT)");
        instituteName.setBounds(280, 30, 550,60);
        instituteName.setFont(F);
        c.add(instituteName);
        
        universityName = new JLabel("Noakhli Science and Technology University");
        universityName.setBounds(250, 70, 600,60);
        universityName.setFont(F);
        c.add(universityName);
        
        oF = new Font("Arial",Font.BOLD,18);
        
        routineLabel = new JLabel("Class routine");
        routineLabel.setFont(oF);
        routineLabel.setBounds(400, 95, 250, 60);
        c.add(routineLabel);
        
        session = new JLabel("session :2017-2018");
        session.setFont(oF);
        session.setBounds(260, 120, 250, 60);
        c.add(session);
        
        year = new JLabel("year-2,term-1");
        year.setFont(oF);
        year.setBounds(450,120, 400, 60);
        c.add(year);
      
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setFont(F);
        frame.setTitle("Class routine ");
        frame.setVisible(true);
        frame.add(c);
    }
    
    public static void main(String[] args) {
        
        Routine routine = new Routine();
    }
    
}
