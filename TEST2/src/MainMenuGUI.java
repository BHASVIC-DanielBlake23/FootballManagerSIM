import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuGUI extends JFrame{
    private JPanel mmenu;
    private JButton PLAYButton;
    private JButton ATTACKINGButton;
    private JButton BALANCEDButton;
    private JButton a433Button;
    private JButton a442Button;
    private JButton a532Button;
    private JLabel picture;
    private JButton DEFENSIVEButton;
    //private Icon football = new imageIcon

    public MainMenuGUI() {
        setTitle("FootballManager sim");
        setContentPane(mmenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(4000, 3000);
        setVisible(true);
        //Icon icon =



        ATTACKINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double teamAttackLevel = 1.25;
            }
        });

    }

}
