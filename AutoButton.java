
package projectsms;

import javax.swing.JButton;


public class AutoButton extends Frame {
    
    JButton J[] = new JButton[5];

    
     
   
    public void  GeneratedButton(int x,int y){
         
         int i=0;
         J[i] = new JButton();
         J[i].setBounds(x,y, 100,50);
         c.add(J[i]);
         
         x++;
         y++;
         i++;
        
    }
    AutoButton(String cn) {
        super(cn);
        
        
    }

    
}
