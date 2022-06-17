import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JTextFieldDemo {
    public JTextFieldDemo(){
        JFrame jfrm= new JFrame("JText File Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(260,120);

        JTextField jtf=new JTextField(20);
        jfrm.add(jtf);

        JLabel jlab= new JLabel();
        jfrm.add(jlab);

        jtf.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText(jtf.getText());
            }
        });

        jfrm.setVisible(true);
    }

    public static void main(String[] arg){
        SwingUtilities.invokeLater(
                JTextFieldDemo::new
        );
    }
}
