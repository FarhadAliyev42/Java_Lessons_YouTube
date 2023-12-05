import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
    public static void main(String[] args){
        JFrame f = new JFrame("Label Example"); 
        JLabel l1 = new JLabel("Text Section"); 
        l1.setBounds(100,50,300,30);

        JButton btn = new JButton("Change"); 
        btn.setBounds(100,80,300,30);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) { 
                int i = 1; 
                l1.setText("Clicked Button: " + i++ + " Times");
            }
            
        });

        f.add(btn);
        f.add(l1);
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true); 
    }
}
