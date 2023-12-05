import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton; 
public class Button { 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example"); 

        JButton btn = new JButton("Send"); 
        btn.setBounds(100,100,100,30); 
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){ 
                System.out.println("Clicked!"); 
            } 
        }); 
        frame.add(btn); 

        frame.setSize(400,400); 
        frame.setLayout(null); 
        frame.setVisible(true); 
    }
}
