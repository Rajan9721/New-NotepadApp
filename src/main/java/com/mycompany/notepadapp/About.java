
package com.mycompany.notepadapp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author rajan
 */
public class About extends JFrame{
    About(){
        setBounds(100,100,500,400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        ImageIcon icon = new ImageIcon(getClass().getResource("notepad_icon.png"));
//        setIconImage(icon.getImage());
        
        setLayout(null);
        
        // following are used for icon \|/
        
//        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("notepad_icon.png")));
//        iconLabel.setBounds(100,50,80,80);
//        add(iconLabel);

        JLabel textLabel = new JLabel("<html>Welcome to Notepad<br>Notepad is a simple text editor for microsoft window and basic text editor. Its Created by Rajan Rajbhar <br>MCA III Semester<br>Makhanlala Chaturvedi National University<br> Mobile No: +916386000183 Email: rn638600@gmail.com</html>");
        textLabel.setBounds(80,50,400,300);
        add(textLabel);
        
    }
    
    public static void main(String[] args){
        new About().setVisible(true);
    }

    void setVariable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
