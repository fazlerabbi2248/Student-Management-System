
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class AddRoutineButtonAction extends AddRoutine{
    
    
    AddRoutineButtonAction(){
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
            frame.dispose();
            AdminstratorDemo a = new AdminstratorDemo();
            }
             });
        
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

        
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource()==add){
         String sntf=daytf.getText();
         String mntf=firsttf.getText();
         String fntf=secondtf.getText();
         String httf=thirdtf.getText();
         String etf=fourthtf.getText();
         String ctf=fifthtf.getText();
         String btf=sixthtf.getText();
         
             JOptionPane.showMessageDialog(null,"Added successfully");
              filewriter(sntf,mntf,fntf,httf,etf,ctf,btf); 
                }
             }
             });
               
        
        
    }
    
        public void filewriter(String sntf,String mntf,String fntf,String httf,String etf,String ctf,String btf)
        {
        try{
            FileWriter fn=new FileWriter("routine.txt",true);
            fn.write(sntf+" "+"#");
            fn.write(mntf+" "+"#");
            fn.write(fntf+" "+"#");
            fn.write(httf+" "+"#");
            fn.write(etf+" "+"#");
            fn.write(ctf+" "+"#");
            fn.write(btf+" "+"#");
            fn.write(System.getProperty("line.separator"));

           fn.close();   
         }
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }
}
