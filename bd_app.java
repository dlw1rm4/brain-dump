import javax.swing.*;

public class bd_app 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Brain Dump");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JTextArea textArea = new JTextArea();

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}