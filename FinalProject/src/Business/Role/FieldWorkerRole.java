/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
<<<<<<< HEAD:FinalProject/src/Business/Role/FieldWorker.java
import userinterface.FieldWorkerRole.FieldWorkerAreaJPanel;
=======
import userinterface.FieldWorkerRole.FieldWorkRequestJPanel;
>>>>>>> f2016159eece1990e9cafff73b9243bfdfc306fd:FinalProject/src/Business/Role/FieldWorkerRole.java

/**
 *
 * @author harold
 */
public class FieldWorkerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
<<<<<<< HEAD:FinalProject/src/Business/Role/FieldWorker.java
        return new FieldWorkerAreaJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
=======
        return new FieldWorkRequestJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
>>>>>>> f2016159eece1990e9cafff73b9243bfdfc306fd:FinalProject/src/Business/Role/FieldWorkerRole.java
    }
    
}
