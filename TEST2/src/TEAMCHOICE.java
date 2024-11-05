import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TEAMCHOICE extends JFrame {
        private JButton ARSENALButton;
        private JButton ASTONVILLAButton;
        private JButton AFCBOURNEMOUTHButton;
        private JButton BRIGHTONButton;
        private JButton BRENTFORDButton;
        private JButton CHELSEAButton;
        private JButton CRYSTALPALACEButton;
        private JButton EVERTONButton;
        private JButton FULHAMButton;
        private JButton IPSWICHTOWNButton;
        private JButton LIVERPOOLButton;
        private JButton MANCITYButton;
        private JButton MANUNITEDButton;
        private JButton NEWCASTLEUNITEDButton;
        private JButton NOTTINGHAMFORESTButton;
        private JButton SOUTHAMPTONButton;
        private JButton WESTHAMButton;
        private JButton WOLVESButton;
        private JButton TOTTENHAMButton;
        private JPanel FlowLayout;

        public class secondClass {
                public static void main(String[] args) {
                        //CALL METHOD FROM OTHER GUI
                        MainMenuGUI();
                }

                public static void MainMenuGUI() {

                        MainMenuGUI mainmenu = new MainMenuGUI();
                }

        }

    public TEAMCHOICE() {
            setTitle("Team Choice");
            setContentPane(FlowLayout);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 300);
            setVisible(true);
            ARSENALButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                            secondClass.MainMenuGUI();

                    }
            });





    }






    }
