package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dumas
 */
public class PrinttoHTMLAListener  implements ActionListener  {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Selected: " + e.getActionCommand());
    }
}