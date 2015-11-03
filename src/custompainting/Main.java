/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custompainting;

import javax.swing.JFrame;

/**
 *
 * @author zeus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame win = new JFrame();
        win.setBounds(50, 50, 500, 300);
        
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CustomPanel cp = new CustomPanel();
        
        win.add(cp);
        win.setVisible(true);
        
        
        
    }
    
}
