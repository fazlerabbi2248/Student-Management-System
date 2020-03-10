
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;


public class Studentfile extends AddStudentMember{
    
    Studentfile(){
        
        add.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            String sname =name.getText();
            String sroll =roll.getText();
            String  ssession = session.getText();
            String  shometown = hometown.getText();
            String  semail =eemail.getText();
            String scontact = contact.getText();
            String sblood = blood.getText();
            
            if(e.getSource()==add)
            {
                filewriter(sname,sroll,ssession,shometown,semail,scontact,sblood);
            }
  
        }

            private void filewriter(String sname, String sroll, String ssession, String shometown, String semail, String scontact, String sblood) {
                
                try{
                    FileWriter wr = new FileWriter("student.txt",true);
                    wr.write(sname+" "+" ");
                    wr.write(sroll+" "+" ");
                    wr.write(ssession+" "+" ");
                    wr.write(shometown+" "+" ");
                    wr.write(semail+" "+" ");
                    wr.write(scontact+" "+" ");
                    wr.write(sblood+" "+" ");
                    
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        
        });
    }
}
