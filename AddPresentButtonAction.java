
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class AddPresentButtonAction extends AddPresent{
    
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
   AddPresentButtonAction(){
        
       add.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==add)
            {
                
                String sname =name.getText();
                String sroll = roll.getText();
                String sheld = held.getText();
                String spresent = present.getText();
                
                if(sname.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert name");
                }
                else if(sroll.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert roll");
                }
                else if(sheld.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Held classes(H)");
                }
                
                else{
                    
                    double intheld =Double.parseDouble(sheld);
                     double intpresent =Double.parseDouble(spresent);
                     double percent = (intpresent/intheld)/100;
                     String percent1 = df2.format(percent);
                     
                  
                     String parcent2 =new Double(percent1).toString();
                     filewriter(sname,sroll,sheld,spresent,parcent2);
                     JOptionPane.showMessageDialog(null, "Added Successfully");
                     SetEmpty(); 
                    
                } 
                
                
            }
            
            }
        private void filewriter(String sname, String sroll, String sheld, String spresent, String spercent) {
                try{
                    FileWriter wr = new FileWriter(filename,true);
                    wr.write(sname+" "+"#");
                    wr.write(sroll+" "+"#");
                    wr.write(sheld+" "+"#");
                    wr.write(spresent+" "+"#");
                    wr.write(spercent+" "+"#");
                    
                    
                    
                    
                       
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        /* private String CalculationPercent(){
             
                     double intheld =Double.parseDouble(sheld);
                     double intpresent =Double.parseDouble(spresent);
                     double percent = (intpresent/intheld)/100;
                     String percent1 = df2.format(percent);
                     return  percent1;
        }   
        */
         
         private void SetEmpty(){
                     name.setText("");
                     roll.setText("");
                     held.setText("");
                     present.setText("");
             
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
