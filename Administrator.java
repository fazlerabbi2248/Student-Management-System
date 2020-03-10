
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Administrator extends JFrame{
    private Container c;
    private JButton addbtn,updatebtn,deletebtn,addmember,rotinebtn,coursebtn,attendencebtn,resultbtn,
            memberbtn,backbtn,homebtn;
    private JPanel panel1,panel2;
    private JLabel studentlabel,facultylabel,mainlabel,addlabel,
            updatelabel,deletelabel,rotinelabel,courselabel,attendencelabel,resultlabel,memberlabel;
    private Font f;
    
    Administrator()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        f=new Font("Arial",Font.BOLD,18);
        
        panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(40,80,320,410);
        c.add(panel1);
        
        panel2=new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(450,80,320,410);
        c.add(panel2);
        
        mainlabel =new JLabel("Administrator");
        mainlabel.setBounds(320,10,200,50);
        mainlabel.setFont(f);
        c.add(mainlabel);
        
        studentlabel =new JLabel("Student Panel");
        studentlabel.setBounds(70,10,200,50);
        studentlabel.setFont(f);
        panel1.add(studentlabel);
        
        addbtn=new JButton();
        addbtn.setBounds(10,65,30,30);
        panel1.add(addbtn);
        
        addlabel=new JLabel("Add Student");
        addlabel.setBounds(50,55,200,50);
        addlabel.setFont(f);
        panel1.add(addlabel);
        
        updatebtn=new JButton();
        updatebtn.setBounds(10,105,30,30);
        panel1.add(updatebtn);
        
        updatelabel=new JLabel("Update Student Information");
        updatelabel.setBounds(50,100,250,50);
        updatelabel.setFont(f);
        panel1.add(updatelabel);
        
        deletebtn=new JButton();
        deletebtn.setBounds(10,150,30,30);
        panel1.add(deletebtn);
        
        deletelabel=new JLabel("Delete Student");
        deletelabel.setBounds(50,140,250,50);
        deletelabel.setFont(f);
        panel1.add(deletelabel);
        
        rotinebtn=new JButton();
        rotinebtn.setBounds(10,195,30,30);
        panel1.add(rotinebtn);
        
        rotinelabel=new JLabel("Routine");
        rotinelabel.setBounds(50,185,250,50);
        rotinelabel.setFont(f);
        panel1.add(rotinelabel);
        
        coursebtn=new JButton();
        coursebtn.setBounds(10,235,30,30);
        panel1.add(coursebtn);
        
        courselabel=new JLabel("Update Course ");
        courselabel.setBounds(50,230,250,50);
        courselabel.setFont(f);
        panel1.add(courselabel);
        
        attendencebtn=new JButton();
        attendencebtn.setBounds(10,275,30,30);
        panel1.add(attendencebtn);
        
        attendencelabel=new JLabel("Update Attendence ");
        attendencelabel.setBounds(50,265,250,50);
        attendencelabel.setFont(f);
        panel1.add(attendencelabel);
        
        resultbtn=new JButton();
        resultbtn.setBounds(10,310,30,30);
        panel1.add(resultbtn);
        
        resultlabel=new JLabel("Update Result ");
        resultlabel.setBounds(50,300,250,50);
        resultlabel.setFont(f);
        panel1.add(resultlabel);
        
        facultylabel =new JLabel("Faculty Panel");
        facultylabel.setBounds(70,10,200,50);
        facultylabel.setFont(f);
        panel2.add(facultylabel);
      
        memberbtn=new JButton();
        memberbtn.setBounds(10,70,30,30);
        panel2.add(memberbtn);
        
        memberlabel=new JLabel("Add Faculty Member");
        memberlabel.setBounds(50,60,250,50);
        memberlabel.setFont(f);
        panel2.add(memberlabel);
        
        backbtn=new JButton("Back");
        backbtn.setBounds(40,500,100,50);
        backbtn.setFont(f);
        c.add(backbtn);
        
        homebtn=new JButton("Home");
        homebtn.setBounds(660,500,100,50);
        homebtn.setFont(f);
        c.add(homebtn);
       
        JFrame frame = new  JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Home ");
        frame.setVisible(true);
        frame.add(c);  
        
        
    }
}

