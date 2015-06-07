/*
            GROUP MEMBERS: 
             SECTION 'C'

SYED MUHAMMAD ALI KAMAL   | K12-2017
UZAIR KHAN                | K12-2011
SUNNY KUMAR               | K12-2213
SHAYAN SAGHIR             | K12-2086

INSTRUCTOR: MISS AISHA UROOJ
*/
package tomasolo;
import javax.swing.JOptionPane;

public class ErrInfo {
      public static void ErrMsg(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Error: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
