import javax.swing.*;
import java.awt.*;

public class GameGui extends JFrame  {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    static JLabel computerCity = new JLabel();
    public String str = "Відповідь ПК";

    public void setStr(String str) {
        this.str = str;
    }

    public GameGui(){

        GridBagConstraints const1 = new GridBagConstraints();
        const1.gridx = 0;
        const1.gridy = 2;
        const1.gridheight = 1;
        const1.gridwidth = 1;
        jPanel.add(new JLabel("Твій варіант:"), const1);

        GridBagConstraints const2 = new GridBagConstraints();
        const2.gridx = 2;
        const2.gridy = 2;
        const2.gridheight = 2;
        const2.gridwidth = 1;
//        JTextArea jTextArea = new JTextArea(1,20);
        //      jPanel.add(jTextArea, const2);
        JTextField jTextField = new JTextField();
        jPanel.add(jTextField, const2);

        GridBagConstraints const3 = new GridBagConstraints();
        const3.gridx = 3;
        const3.gridy = 2;
        const3.gridheight = 1;
        const3.gridwidth = 1;
        JButton jButton = new JButton("Моя відповідь");
        jPanel.add(jButton, const3);
        jButton.addActionListener(new ButtonAction(jTextField, computerCity));

        GridBagConstraints const4 = new GridBagConstraints();
        const4.gridx = 1;
        const4.gridy = 1;
        const4.gridheight = 1;
        const4.gridwidth = 1;
        jPanel.add(new JLabel("   "), const4);

        GridBagConstraints const5 = new GridBagConstraints();
        const5.gridx = 1;
        const5.gridy = 0;
        const5.gridheight = 1;
        const5.gridwidth =2;
        //JLabel computerCity = new JLabel(str);
        computerCity.setFont(new Font("Verdana", Font.PLAIN, 18));
        jPanel.add(computerCity, const5);

        jPanel.revalidate();
    }

    public static JFrame getFrame(){
        JFrame frame = new JFrame("гра Міста");
        frame.setVisible(true);
        frame.setBounds(250,250,500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}