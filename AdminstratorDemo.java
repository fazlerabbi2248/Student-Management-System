
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class AdminstratorDemo extends JFrame{
    
    Container c;
    JLabel adminlabel,label1,label2,label3,label4,label5,label6,label7,label8;
    JButton homebtn,addfacultybtn,addstubtn,updatebtn,deletestubtn,updatefacbtn,deletetfacbtn,routinebtn,addroutine;
    final Font f;
    final Font hf;
    final Cursor cursor;
    JFrame frame;
    
    AdminstratorDemo(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new java.awt.Color(0, 230, 230));
        
        
        hf=new Font("Arial",Font.BOLD,28);
        f=new Font("Arial",Font.BOLD,24);
        cursor =new Cursor(Cursor.HAND_CURSOR);
        
        adminlabel=new JLabel("Administrator");
        adminlabel.setFont(hf);
        adminlabel.setBounds(380,60,200,70);
        c.add(adminlabel);
        
        label1=new JLabel("1.");
        label1.setFont(f);
        label1.setBounds(180,140,20,50);
        c.add(label1);
        
        updatebtn=new JButton("Update Student Information");
        updatebtn.setBounds(200,140,370,50);
        updatebtn.setFont(f);
        updatebtn.setCursor(cursor);
        updatebtn.setBackground(new java.awt.Color(0,230,230));
        c.add(updatebtn);
        
        label2=new JLabel("2.");
        label2.setFont(f);
        label2.setBounds(180,200,20,50);
        c.add(label2);
        
        addstubtn=new JButton("Add Student");
        addstubtn.setBounds(200,200,190,50);
        addstubtn.setFont(f);
        addstubtn.setCursor(cursor);
        addstubtn.setBackground(new java.awt.Color(0,230,230));
        c.add(addstubtn);
        
        label3=new JLabel("3.");
        label3.setFont(f);
        label3.setBounds(180,260,20,50);
        c.add(label3);
        
        deletestubtn=new JButton("Delete Student");
        deletestubtn.setBounds(200,260,210,50);
        deletestubtn.setFont(f);
        deletestubtn.setCursor(cursor);
        deletestubtn.setBackground(new java.awt.Color(0,230,230));
        c.add(deletestubtn);
        
        label4=new JLabel("4.");
        label4.setFont(f);
        label4.setBounds(180,320,20,50);
        c.add(label4);
        
        addfacultybtn=new JButton("Add a Faculty member");
        addfacultybtn.setBounds(200,320,300,50);
        addfacultybtn.setFont(f);
        addfacultybtn.setCursor(cursor);
        addfacultybtn.setBackground(new java.awt.Color(0,230,230));
        c.add(addfacultybtn);
        
        label5=new JLabel("5.");
        label5.setFont(f);
        label5.setBounds(180,380,20,50);
        c.add(label5);
        
        updatefacbtn=new JButton("Update Faculty member Information");
        updatefacbtn.setBounds(200,380,450,50);
        updatefacbtn.setFont(f);
        updatefacbtn.setCursor(cursor);
        updatefacbtn.setBackground(new java.awt.Color(0,230,230));
        c.add(updatefacbtn);
        
        label6=new JLabel("6.");
        label6.setFont(f);
        label6.setBounds(180,440,20,50);
        c.add(label6);
        
        deletetfacbtn=new JButton("Delete a Faculty member");
        deletetfacbtn.setBounds(200,440,330,50);
        deletetfacbtn.setFont(f);
        deletetfacbtn.setCursor(cursor);
        deletetfacbtn.setBackground(new java.awt.Color(0,230,230));
        c.add(deletetfacbtn);
        
        label7=new JLabel("7.");
        label7.setFont(f);
        label7.setBounds(180,500,20,50);
        c.add(label7);
        
        routinebtn=new JButton("Update Routine");
        routinebtn.setBounds(200,500,220,50);
        routinebtn.setFont(f);
        routinebtn.setCursor(cursor);
        routinebtn.setBackground(new java.awt.Color(0,230,230));
        c.add(routinebtn);
        
        label8=new JLabel("8.");
        label8.setFont(f);
        label8.setBounds(180,560,20,50);
        c.add(label8);
        
        addroutine=new JButton("Add Routine");
        addroutine.setBounds(200,560,220,50);
        addroutine.setFont(f);
        addroutine.setCursor(cursor);
        addroutine.setBackground(new java.awt.Color(0,230,230));
        c.add(addroutine);
        
        
        homebtn=new JButton("Home");
        homebtn.setBounds(300,620,150,50);
        homebtn.setFont(f);
        homebtn.setBackground(Color.BLACK);
        homebtn.setForeground(Color.WHITE);
        homebtn.setCursor(cursor);
        c.add(homebtn);
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        addstubtn.setBorder(emptyBorder);
        updatebtn.setBorder(emptyBorder);
       deletestubtn.setBorder(emptyBorder);
        addfacultybtn.setBorder(emptyBorder);
        updatefacbtn.setBorder(emptyBorder);
        deletetfacbtn.setBorder(emptyBorder);
        routinebtn.setBorder(emptyBorder);
        addroutine.setBorder(emptyBorder);
        
        frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Administrator");
        frame.setVisible(true);
        frame.add(c);   
        
        
                 
    }
    public static void main(String[] args) {
       AdminstratorDemo adminDemo = new AdminstratorDemo();
    }
}
