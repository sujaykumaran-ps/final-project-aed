/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.MemberRole.MemberHomeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class MemberRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new MemberHomeJPanel(userProcessContainer, account, business);
    }
    
    
}
