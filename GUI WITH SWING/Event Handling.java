import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EventDemo {
    JLabel jlab;
    EventDemo(){
        JFrame jfrm=new JFrame("Event Handling");
        jfrm.setLayout(new FlowLayout());   //specify layout flow
        jfrm.setSize(220,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnAlpha= new JButton("Alpha");
        JButton jbtnBeta= new JButton("Beta");
        jbtnAlpha.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Alpha is pressed");
            }
        });
        jbtnBeta.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Beta is pressed");
            }
        });

        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);

        jlab= new JLabel("Press the button");

        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] arg){
        SwingUtilities.invokeLater(EventDemo::new);
    }
}
