
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class AddCoursePresentAction  extends AddCoursePresent{
    
     private static DecimalFormat df2 = new DecimalFormat("#.##");

    AddCoursePresentAction(){
        add.addActionListener(new ActionListener(){
        
  
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==add){
                String StudentRoll =name.getText();
                String Semister = roll.getText();
                String Session = ct1.getText();
                String CourseName = ct2.getText();
                String CourseCode =assign.getText();
                String ClassHeld = attendence.getText();
                String ClassPresent = present.getText();
                
                String file = StudentRoll+Semister;
              
                
                 if(StudentRoll.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert roll");
                }
                 else if(Semister.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Semister");
                }
                 else if(Session.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Session");
                }
                 else if(CourseName.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Course name");
                }
                else if(CourseCode.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Course Code");
                }
                else if(ClassHeld.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Class held No");
                }
                 else if(ClassPresent.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Class Present No");
                }
                 else{
                     
                     double cheld1 =Double.parseDouble(ClassHeld);
                     double cpresent1 =Double.parseDouble(ClassPresent);
                     double parcent1 =(cpresent1/cheld1)*100;
                     String parcent = df2.format(parcent1);
                     
                     String parcent2 =new Double(parcent).toString();
                     filewriter(file,CourseName,CourseCode,ClassHeld,ClassPresent,parcent2);
                     JOptionPane.showMessageDialog(null, "Added Successfully");
                     name.setText("");
                     roll.setText("");
                     ct1.setText("");
                     ct2.setText("");
                     assign.setText("");
                     attendence.setText("");
                     present.setText("");
                     
                 }
                  
                           

                }
        }
        private void filewriter(String file, String CourseName, String CourseCode, String ClassHeld,String ClassPresent,String Parc) {
                try{
                    FileWriter wr = new FileWriter(file,true);
                   // wr.write(sroll+" "+"#");
                    //wr.write(semister+" "+"#");
                    //wr.write(session+" "+"#");
                    wr.write(CourseName+" "+"#");
                    wr.write(CourseCode+" "+"#");
                    wr.write(ClassHeld+" "+"#");
                    wr.write(ClassPresent+" "+"#");
                    wr.write(Parc+" "+"#");
                    
                    
                    
                       
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        
        });
        home.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==home)
               {
                  frame.dispose();
                  Home menuFile = new Home();
                  
               }
            }
            
        });
    }

    
}
