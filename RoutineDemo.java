
package projectsms;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class RoutineDemo extends JFrame{
    
    public Container c;
    public JTable table;
    public JLabel label;
    public JTextField tf;
    public JScrollPane scroll;
     Font f;   
    public JButton back,home;
     String cols[]={"Days","09.00am-10.00am","10.00am-11.00am","11.00am-12.00pm","01.00pm-02.00pm","02.00pm-03.00pm","3.00pm-4.00pm"};
     //String rows[][] = new String[7][7] ;
     DefaultTableModel model;
     JFrame frame;
    RoutineDemo()throws FileNotFoundException
    {
        c=this.getContentPane();
        c.setBackground(new java.awt.Color(0, 230, 230));
        c.setLayout(null);
        
        f=new Font("Arial",Font.BOLD,18);
       
      
        Font hf=new Font("Arial",Font.BOLD,16);
        
        table =new JTable();
        table.setSelectionBackground(Color.GREEN);
        table.setRowHeight(60); 
        
        model=new DefaultTableModel();
        model.setColumnIdentifiers(cols);
        table.setModel(model);
        table.setFont(hf);
        table.setBackground(Color.WHITE);
        
   
        
        
    
        scroll=new JScrollPane(table);
        scroll.setBounds(5,90,1350,450);
        c.add(scroll);
        
      
        
        File file  = new File("routine.txt");
         
      try{
           FileReader  fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr); 
           
           Object[] lines = br.lines().toArray();
           
           for(int i=0;i<lines.length;i++)
           {
              String[] row = lines[i].toString().split("#");
               
              model.addRow(row);
           }
           
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        
        
        
        home=new JButton("Home");
        home.setBounds(520,570,150,50);
        home.setFont(f);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        c.add(home);
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Routine");
        frame.setVisible(true);
        frame.add(c);
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==home)
            {
                frame.dispose();
                Home home=new Home();  
            }
            }
        
        });
           
    }
    
    
    public static void main(String[] args) throws FileNotFoundException {
        RoutineDemo f= new RoutineDemo();
        
        
        
    }
}

