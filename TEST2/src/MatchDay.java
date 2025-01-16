import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class MatchDay extends JFrame {


    private JPanel panel1;
    private JTextField textField1;
    private JTextField eventlog;
    private JButton StartButton;
    private JLabel fixturesq;
    private JLabel scoreboard;
    private JLabel timerLabel;
    private JButton Attacking;


    public MatchDay(){
        setTitle("Match Day");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(4000, 3000);
        setVisible(true);
        Timer matchTimer = new Timer(1000, null); // turns timer into seconds
        int[] time = {90};
        Random random = new Random();
        String[] fixtures = new String[19];
        int[] teamScores = {0, 0};

        fixtures[0] = Arsenal.getTeam();
        fixtures[1] = CrystalPalace.getTeam();


        StartButton.addActionListener(e -> {
            eventlog.setText("Kicked Off");
            teamScores[0] = 0;
            teamScores[1] = 0;
            time[0] = 90;
            fixturesq.setText(fixtures[0] + fixtures[1]);
            scoreboard.setText("0 - 0");
            matchTimer.start();










        });
        int goalscorer = random.nextInt(Arsenal.arsenalPlayers.length);
        String scorer = Arsenal.arsenalPlayers[goalscorer]; // retrieve player names from the Arsenal Team Class
        int goalscorer1 = random.nextInt(CrystalPalace.palacePlayers.length);
        String scorer1 = CrystalPalace.palacePlayers[goalscorer]; // retrieve player names from the Arsenal Team Class

        matchTimer.addActionListener(e -> {
            if (time[0] > 0) {
                time[0]--;
                timerLabel.setText("" + time[0]);

                Attacking.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int pressed = 0;
                        int x = 0;
                        pressed = pressed + 1;
                        if ( pressed == 1) {
                            x = (int) (Arsenal.getAttackLevel() *1.5);
                            eventlog.setText("Arsenal Set to Attacking" + x);
                    }
                    else {
                        x = (int) Arsenal.getAttackLevel();}
                    }
                });


                if (random.nextInt(100) < 50) { // percent chance that there will be a goal for either team
                    int x = getX();
                    int nextgoal = Math.random() * 100 < 100? 1 : 0 * x; // chance of home team scoring multiplied by their attack level
                    nextgoal = Math.random() * 100 < 50 ? 0 : (int) (1 * (int) (1 / Arsenal.getDefenseLevel()) * CrystalPalace.getAttackLevel());
                    teamScores[nextgoal]++;
                    scoreboard.setText(teamScores[1] + " - " + teamScores[0]);
                    if (nextgoal == 0) {
                        eventlog.setText("GOAL! Palace by " + scorer1);
                    } else if (nextgoal == 1) {
                        eventlog.setText("GOAL! ARSENAL by " + scorer);
                    }
                } else if (random.nextInt(100) < 30) {
                    String[] corner = {"yellow card", "Foul", "corner", "free kick"}; // array of different possible events with a 30% chance of occurrence
                    String[] teams = {"Home Team", "Away Team"};
                    String chance = corner[random.nextInt(corner.length)]; // selects randomly the list of possible events and chooses one to occur
                    eventlog.setText( chance +" for " + teams[random.nextInt(teams.length)]); // outputs what team the event occurs for
                }
            } else {
                matchTimer.stop();
                eventlog.setText("Final Whistle, game over! " + teamScores[0] + " - " + teamScores[1]);
            }

        });

    }













    }
    class Arsenal {

        public static String[] arsenalPlayers = {"Saka", "Odegaard", "Havertz"};

        public static String getTeam() {
            return "Arsenal";
        }
        public static double getAttackLevel() {
            return 1.5;
        }
        public static double getDefenseLevel() {
            return 1.25;
        }}

    class CrystalPalace {
        public static String[] palacePlayers = {"Mateta", "Lerma", "Guehi"};
        public static String getTeam() {
            return "Crystal Palace";
        }
        public static double getAttackLevel() {
            return 1.2;
        }
        public static double getDefenseLevel() {
            return 1.1;
        }

    }







