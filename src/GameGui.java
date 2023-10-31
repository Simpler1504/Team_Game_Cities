import java.awt.*;
import javax.swing.*;

public class GameGui extends JFrame {
    private JFrame jFrame = new JFrame("гра Міста");
    private JLabel computerCity = new JLabel();

    public GameGui() throws Exception{
        Image image = Toolkit.getDefaultToolkit().getImage("images\\icon.png");
        jFrame.setSize(500,170);
        jFrame.setLocationRelativeTo(null);
        jFrame.setIconImage(image);
        jFrame.setLayout(null);

        JLabel jLabel = new JLabel("Твій варіант:");
        jLabel.setBounds(20,30,100,30);
        jFrame.add(jLabel);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(100,30,200,30);
        jFrame.add(jTextField);

        JButton jButton = new JButton("Моя відповідь");
        jButton.setBounds(300,30,120,30);
        jFrame.add(jButton);
        jButton.addActionListener(new ButtonAction(jTextField, computerCity));

        computerCity.setBounds(120,20,300,150);
        computerCity.setFont(new Font("Verdana", Font.PLAIN, 18));
        jFrame.add(computerCity);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
        jFrame.revalidate();
    }

//    public static void main(String[] args) throws Exception {
//         new GameGui();
//    }
}