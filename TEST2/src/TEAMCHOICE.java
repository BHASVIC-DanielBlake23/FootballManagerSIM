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
        public class brentfordClass {
                public static void main(String[] args) {
                        //CALL METHOD FROM OTHER GUI
                        BrentfordMenu();
                }

                public static void BrentfordMenu() {

                        BrentfordMenu brenmenu = new BrentfordMenu();
                }

        }
        public class bournemouthClass {
                public static void main(String[] args) {
                        //CALL METHOD FROM OTHER GUI
                        BournemouthMenu();
                }

                public static void BournemouthMenu() {

                        BournemouthMenu bournemouthMenu = new BournemouthMenu();
                }

        }

        public class villaClass {
                public static void main(String[] args) {
                        //CALL METHOD FROM OTHER GUI
                        VillaMenu();
                }

                public static void VillaMenu() {

                        VillaMenu villaMenu = new VillaMenu();
                }

        }

    public TEAMCHOICE() {
            setTitle("Team Choice");
            setContentPane(FlowLayout);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(4000, 3000);
            setVisible(true);
            ARSENALButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                            secondClass.MainMenuGUI();



                    }
            });




            AFCBOURNEMOUTHButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                            bournemouthClass.BournemouthMenu();
                    }
            });
            ASTONVILLAButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                            villaClass.VillaMenu();
                    }
            });
            BRENTFORDButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                            brentfordClass.BrentfordMenu();
                    }
            });
    }






    }
