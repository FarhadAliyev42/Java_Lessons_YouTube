import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordField {
    public static void main(String[] args) {
        JFrame f = new JFrame("PasswordField Example"); 
        JPasswordField p = new JPasswordField(); 
        p.setBounds(20,50,100,30); 
        JLabel l1 = new JLabel("Password: "); 
        l1.setBounds(20,20,600,30); 
        JButton btn = new JButton("Send"); 
        btn.setBounds(20,80,100,30); 
        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) { 
                String password = new String(p.getPassword());
                l1.setText(l1.getText() + password); 
            }
        });
        f.add(btn);
        f.add(l1);
        f.add(p); 
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true); 
    }
}
