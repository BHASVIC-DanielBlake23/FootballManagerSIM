import com.sun.tools.javac.Main;

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
    public class FiveClass {

        public static void main(String[] args) {
            //CALL METHOD FROM OTHER GUI
            MatchDay();
        }

        public static void MatchDay() {

            MatchDay MatchDay = new MatchDay();
        }
    }

    public MainMenuGUI() {
        setTitle("FootballManager sim");
        setContentPane(mmenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(4000, 3000);
        setVisible(true);
        //Icon icon =
        final double[] Attacklevel = {1.25};
        final double[] DefenseLevel = {1.25};



        ATTACKINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double teamAttackLevel = 1.25;
            }
        });




        a433Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Attacklevel[0] = Attacklevel[0] * 1.25;
                DefenseLevel[0] = DefenseLevel[0] * 0.75;
            }
        });

        a532Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Attacklevel[0] = Attacklevel[0] * 0.9;
                DefenseLevel[0] = DefenseLevel[0] * 1.25;
            }
        });
        ATTACKINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Attacklevel[0] = Attacklevel[0] * 1.25;
                DefenseLevel[0] = DefenseLevel[0] * 0.75;
            }
        });
        DEFENSIVEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Attacklevel[0] = Attacklevel[0] * 0.75;
                DefenseLevel[0] = DefenseLevel[0] * 1.25;
                System.out.println(Attacklevel);
            }
        });
        PLAYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FiveClass.MatchDay();
            }
        });
    }

}
