
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class AdministratorLoginButtonAction extends AdministratorLogin{
    
    
    AdministratorLoginButtonAction(){
        
        submit.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
 
            String name=usernameField.getText();
            String pass= passField.getText();
 
                if(name.equals("Admin") && pass.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Welcome");
                    frame.dispose();
                    AdminstratorDemo admin = new AdminstratorDemo();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Password");
                    usernameField.setText("");
                    passField.setText("");
                }
        }
        
        });
    }
}
