
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class STARTSCREEN extends JFrame {
    private JPanel mainPanel;
    private JButton NEWGAME;
    private JButton QUITGAMEButton;
    private JTextField txtName;



    public static void main(String[] args) {
        STARTSCREEN h= new STARTSCREEN();
        h.setContentPane(h.mainPanel);
        h.setTitle("Football manager SIM");
        h.setSize(600,1800);
        h.setDefaultCloseOperation(EXIT_ON_CLOSE);
        h.setVisible(true);

    }
    public class MainClass {
        public static void main(String[] args) {
            //CALL METHOD FROM OTHER GUI
            TeamChoice();
        }

        public static void TeamChoice() {

            TEAMCHOICE teamchoice = new TEAMCHOICE();
        }
    }

    public STARTSCREEN(){
        NEWGAME.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainClass.TeamChoice();

            }


        })
    ;}



    }


