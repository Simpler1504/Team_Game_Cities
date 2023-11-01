import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WelcomeWindow extends JFrame {
    private JLabel label = new JLabel("Вітаємо вас у грі, під назвою \"Міста\"!");
    private JButton button = new JButton("Почати");
    private  JFrame jFrame = new JFrame("Вітаємо!");
    public WelcomeWindow() {
        Image image = Toolkit.getDefaultToolkit().getImage("images\\icon.png");
        jFrame.setSize(400,100);
        jFrame.setLocationRelativeTo(null);
        label.setBounds(20,20,250,30);
        button.setBounds(250,20,100,30);
        jFrame.setIconImage(image);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.add(button);
        jFrame.add(label);

        jFrame.setDefaultCloseOperation(3);

        button.addActionListener(new WelcomeWindow.ButtonEventListener());
    }

    class ButtonEventListener implements ActionListener {
        // Button click
        public void actionPerformed(ActionEvent e){
            jFrame.setVisible(false);
            try {
                GameGui gameGui = new GameGui();
                CheckWord checkWord = new CheckWord();
                ButtonAction buttonAction = new ButtonAction(new JTextField(),new JLabel());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
