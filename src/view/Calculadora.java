
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends javax.swing.JFrame {
    
    private Container container;
    
    private final String[] BUTTON_NAMES = {
        "1", "2", "3", "4", "5", "6", "7",
        "8", "9", "*", "0", "#", "send", "end"
    };
    private JButton button;
    private JLabel result;
    private JPanel jpNumber;
    private JPanel jpSendEndButton;
    
    public Calculadora() {
        super("L1");
        
        container = getContentPane();
        
        result = new JLabel("5122299");
        
        jpNumber = new JPanel();
        jpNumber.setLayout(new GridLayout(4,3));
        
        for(int i = 0; i < 12; i++) {
            button = new JButton(BUTTON_NAMES[i]);
            jpNumber.add(button);
        }
        
        jpSendEndButton = new JPanel();
        jpSendEndButton.add(new JButton(BUTTON_NAMES[12]));
        jpSendEndButton.add(new JButton(BUTTON_NAMES[13]));
                            
        container.add(result, BorderLayout.NORTH);
        container.add(jpNumber, BorderLayout.CENTER);
        container.add(jpSendEndButton, BorderLayout.SOUTH);
                                           
        setSize(200, 200);
        setLocationRelativeTo(null);
        setResizable(false); 
        setVisible(true);
        
    }
}
