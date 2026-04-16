import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class bd_app 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Brain Dump");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel("Unload your thoughts here", SwingConstants.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}