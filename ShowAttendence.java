
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ShowAttendence extends JFrame{
    
    
     Container c;
     JFrame frame;
     String filename1;
     JFileChooser jc;
     JTable table;
     DefaultTableModel model;
      JScrollPane scroll;
      String[] coloum = {"Course Name","Course Code","Class Held","Class Attendence","Course Percentage"};
    
     JLabel l1,l2,l3,total,label;
      Font f;
      JTextField tf1,tf2,tf3;
      JButton b1,show,home;
      JComboBox cb1,cb2;
    
    
    ShowAttendence(){
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        f = new Font("Arial",Font.BOLD,18);
        
        l1 = new JLabel("ID NO: ");
        l1.setBounds(10,10,80,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(f);
        c.add(l1);
        
        l2 = new JLabel("Semester  ");
        l2.setBounds(260,10,120,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(f);
        c.add(l2);
        
        l3 = new JLabel("Session  ");
        l3.setBounds(600,10,120,50);
        l3.setForeground(Color.BLACK);
        l3.setFont(f);
        c.add(l3);
        
        tf1= new JTextField();
        tf1.setBounds(90,10,150,50);
        tf1.setBackground(Color.WHITE);
        c.add(tf1);
        
         tf2= new JTextField();
        tf2.setBounds(380,10,200,50);
        tf2.setBackground(Color.WHITE);
        c.add(tf2);
        
        tf3= new JTextField();
        tf3.setBounds(725,10,200,50);
        tf3.setBackground(Color.WHITE);
        c.add(tf3);
        
        show=new JButton("Show");
        show.setBounds(1000,10,150,50);
        show.setFont(f);
        show.setBackground(Color.BLACK);
        show.setForeground(Color.WHITE);
        c.add(show);
        
        total = new JLabel("Total Frequency :");
        total.setBounds(40,640,200,50);
        total.setForeground(Color.BLACK);
        total.setFont(f);
        c.add(total);
        
        label = new JLabel(".........................");
        label.setBounds(250,640,200,50);
        label.setForeground(Color.BLACK);
        label.setFont(f);
        c.add(label);
        
        home=new JButton("Home");
        home.setBounds(700,640,100,50);
        home.setFont(f);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Show Attendence");
        frame.setVisible(true);
        frame.add(c);
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==home)
            {
                dispose();
                Home home=new Home();
            }
            }
        
        });
    }
    public static void main(String[] args) {
        ShowAttendence showAttendence = new ShowAttendence();
    }
    
}
