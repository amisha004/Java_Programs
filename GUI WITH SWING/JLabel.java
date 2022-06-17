import javax.swing.*;
import java.awt.*;

public class JLabelDemo {
    public JLabelDemo(){
        JFrame jfrm=new JFrame("JLabel Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(260,210);

        ImageIcon ii= new ImageIcon("hourglass.png");
        JLabel jl=new JLabel("Hourglass", ii, JLabel.CENTER);
        jfrm.add(jl);
        jfrm.setVisible(true);
    }

    public static void main(String[] arg){
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new JLabelDemo();
                    }
                }
        );
    }
}
