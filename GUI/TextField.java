import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextField {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextArea Example"); 
        JLabel l1, l2; 
        JLabel l3;  
        JTextField tf = new JTextField(); 
        JTextField tf2, tf3; 
        JButton btn1; 
        l1 = new JLabel("First Number"); 
        l1.setBounds(50,10,100,30 ); 
        tf.setBounds(50,30,200,30); 


        l2 = new JLabel("Second Number"); 
        l2.setBounds(50, 60, 100,30); 
        tf2 = new JTextField(); 
        tf2.setBounds(50, 80, 200, 30); 

        btn1 = new JButton("Add"); 
        btn1.setBounds(50, 120, 100, 30); 

        l3 = new JLabel("Sum"); 
        l3.setBounds(50, 150, 100, 30); 
        tf3 = new JTextField(); 
        tf3.setBounds(50, 170, 100, 30); 
        tf3.setEditable(false); 
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                int a = Integer.parseInt(tf.getText()); 
                int b = Integer.parseInt(tf2.getText()); 
                int c = a+b; 
                String s = String.valueOf(c); 
                tf3.setText(s);
            }
            
        });  
        f.add(l3); 
        f.add(tf3);  
        f.add(btn1); 
        f.add(tf2); 
        f.add(l1); 
        f.add(l2); 
        f.add(tf); 
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true); 
    }
}
