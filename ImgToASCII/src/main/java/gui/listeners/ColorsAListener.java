/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dumas
 */
public class ColorsAListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Selected: " + e.getActionCommand());
    }
}
