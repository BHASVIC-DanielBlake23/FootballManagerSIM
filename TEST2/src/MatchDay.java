import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MatchDay extends JFrame {

    private JPanel panel1;
    private JTextField textField1;
    private JTextField eventlog;
    private JButton StartButton;

    public MatchDay(){
        setTitle("Match Day");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(4000, 3000);
        setVisible(true);
        Timer matchTimer = new Timer(1000, null); //
        int[] time = {90};
        String[] fixtures = new String[19];
        int[] teamScores = {0, 0};
        Random random = new Random();
         fixtures[0] = Arsenal.getTeamName();
         fixtures[1] = CrystalPalace.getTeamName();
        StartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eventlog.setText("Kicked Off");
                time[0] = 90;
                matchTimer.start();



            }
        });


    }






}
 class Arsenal {
    public static void main(String[] args) {
        String[] arsenalPlayers=new String[10];
        arsenalPlayers[0]= " David Raya ";
        arsenalPlayers[1] = "Oleksandr Zinchenko ";
        arsenalPlayers[2] = " William Saliba ";
        arsenalPlayers[3] = " Gabriel ";
        arsenalPlayers[4] = " Ben White ";
        arsenalPlayers[5] = "Thomas Partey";
        arsenalPlayers[6] = "Declan Rice";
        arsenalPlayers[7] = "Martin Odegaard";
        arsenalPlayers[8] = "Gabriel Martinelli";
        arsenalPlayers[9] = "Bukayo Saka";
        arsenalPlayers[10] = "Kai Havertz";
        double attackLevel = 1.25;
        double defenseLevel =  1.25;

    }
    public static String getTeamName() {
        return "Arsenal";}
}
class CrystalPalace {
    public static void main(String[] args) {
        String[] palacePlayers=new String[10];
        palacePlayers[0] = "Dean Henderson";
        palacePlayers[1] = " Tyrick Mitchell";
        palacePlayers[2] = " Maxence Lacroix";
        palacePlayers[3] = " Marc Guehi";
        palacePlayers[4] = " Daniel Munoz ";
        palacePlayers[5] = " Jefferson Lerma ";
        palacePlayers[6] = " Adam Wharton ";
        palacePlayers[7] = " Daichi Kamada ";
        palacePlayers[8] = " Eberechi Eze ";
        palacePlayers[9] = " Ismaila Sarr";
        palacePlayers[10] = " Eddie Nketiah ";



    }
    public static String getTeamName() {
        return "Crystal Palace";}
}



