
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminstratorDemoButtonAction extends AdminstratorDemo{
    
    AdminstratorDemoButtonAction(){
        homebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home admin =new Home();
        }
        
        });
        
        addfacultybtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==addfacultybtn){
                 
                    frame.dispose();
                    AddfacultyMember addmember = new AddfacultyMember();
                    
                }
        }
        
        });
        
        addstubtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==addstubtn){
                 
                    frame.dispose();
                    AddStudentMember addmember = new AddStudentMember();
                    
                }
        }
        
        });
        
        updatebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==updatebtn){
                 
                    frame.dispose();
                    try {
                        UpdateStudentInformation up = new UpdateStudentInformation();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
        
        });
        
       updatefacbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==updatefacbtn){
                 
                    frame.dispose();
                    try {
                        UpdateFacultyInformation up = new UpdateFacultyInformation();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
        
        });
        
        deletestubtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==deletestubtn){
                 
                    frame.dispose();
                    try {
                        DeleteStudent deletestu = new DeleteStudent();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    
                    
                }
        }
        
        });
        
         deletetfacbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()== deletetfacbtn){
                 
                    frame.dispose();
                    try {
                        DeleteFaculty delete = new DeleteFaculty();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    
                    
                }
        }
        
        });
         routinebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()== routinebtn){
                 
                    frame.dispose();
                    try {
                        UpdateRoutine updateRoutine = new UpdateRoutine();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    
                    
                }
        }
        
        });
         addroutine.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()== addroutine){
                 
                    frame.dispose();
                    AddRoutine updateRoutine = new AddRoutine();
                   
                    
                    
                }
        }
        
        });
    }
    
}
