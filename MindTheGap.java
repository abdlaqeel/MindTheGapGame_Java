import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
/*
 *  Complete program for the MindTheGap game including the GUI and logic part both
 *  @author aaqeel: Abdullah Aqeel
 */

public class MindTheGap implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JButton[] buttons = new JButton[16];
    JButton NewGame = new JButton("New Game");
    Random random = new Random();
    JLabel label = new JLabel("Don't select neighbor squares! Click to begin>> ");
    boolean turn_1 = true;
    boolean gameStarted = false;

    MindTheGap(){
        MakeGUI();
    }


    /*
     *  Makes a frame, adds button and sets the GUI for the whole program
     */
    public void MakeGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 400);
        frame.setPreferredSize(new Dimension(600,550));
        panel.setLayout(new GridLayout(4, 4,7,7));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel1.setLayout(new FlowLayout());
        panel1.add(label);
        panel1.add(NewGame);
        NewGame.addActionListener(e-> turn1());

        for(int i = 0; i<16; i++){
            buttons[i] = new JButton();
            panel.add(buttons[i]);
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setOpaque(true);
            buttons[i].setBorderPainted(false);
            buttons[i].addActionListener(this);
            buttons[i].setEnabled(false);
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.pack();
    }

    /*
     *  Implements the new game function and randomly generates whose turn it is
     */
    public void turn1() {
        gameStarted = true;
        for(int i = 0; i<16; i++) {
            buttons[i].setText("");
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setEnabled(true);
        }
        if(random.nextInt(2)==0){
            turn_1= true;
            label.setText("Player 1's turn...");
        }
        else {
            turn_1= false;
            label.setText("Player 2's turn...");
        }
    }

    /*
     *  Main logic for the code to deciding who will win and to determine if the neighbour square is selected
     */
    public void validate() {
        //wrote code using if statements and checking variable will be the colour of a button to decide a winner
        //cases for player 1 winning

        if((buttons[0].getBackground()==Color.RED) && buttons[1].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[0].getBackground()==Color.RED) && buttons[4].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[0].getBackground()==Color.RED) && buttons[5].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[1].getBackground()==Color.RED) && buttons[2].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[1].getBackground()==Color.RED) && buttons[5].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[1].getBackground()==Color.RED) && buttons[6].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[1].getBackground()==Color.RED) && buttons[4].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[2].getBackground()==Color.RED) && buttons[3].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[2].getBackground()==Color.RED) && buttons[6].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[2].getBackground()==Color.RED) && buttons[7].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[2].getBackground()==Color.RED) && buttons[5].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[3].getBackground()==Color.RED) && buttons[7].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[3].getBackground()==Color.RED) && buttons[6].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[4].getBackground()==Color.RED) && buttons[5].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[4].getBackground()==Color.RED) && buttons[8].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[4].getBackground()==Color.RED) && buttons[9].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[5].getBackground()==Color.RED) && buttons[6].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[5].getBackground()==Color.RED) && buttons[9].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[5].getBackground()==Color.RED) && buttons[10].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[5].getBackground()==Color.RED) && buttons[8].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[6].getBackground()==Color.RED) && buttons[10].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[6].getBackground()==Color.RED) && buttons[7].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[6].getBackground()==Color.RED) && buttons[11].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[6].getBackground()==Color.RED) && buttons[9].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[7].getBackground()==Color.RED) && buttons[11].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[7].getBackground()==Color.RED) && buttons[10].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[8].getBackground()==Color.RED) && buttons[9].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[8].getBackground()==Color.RED) && buttons[12].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[8].getBackground()==Color.RED) && buttons[13].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[9].getBackground()==Color.RED) && buttons[10].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[9].getBackground()==Color.RED) && buttons[13].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[9].getBackground()==Color.RED) && buttons[14].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[9].getBackground()==Color.RED) && buttons[12].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[10].getBackground()==Color.RED) && buttons[14].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[10].getBackground()==Color.RED) && buttons[11].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[10].getBackground()==Color.RED) && buttons[13].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[10].getBackground()==Color.RED) && buttons[15].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[11].getBackground()==Color.RED) && buttons[14].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[11].getBackground()==Color.RED) && buttons[15].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[12].getBackground()==Color.RED) && buttons[13].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[13].getBackground()==Color.RED) && buttons[14].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[14].getBackground()==Color.RED) && buttons[15].getBackground()==Color.RED){
            label.setText("Player 2 Wins! Click to play again>>");
            gameStarted=false;
        }


        //Cases for player 2 winning

        if((buttons[0].getBackground()==Color.BLUE) && buttons[1].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[0].getBackground()==Color.BLUE) && buttons[4].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[0].getBackground()==Color.BLUE) && buttons[5].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[1].getBackground()==Color.BLUE) && buttons[2].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[1].getBackground()==Color.BLUE) && buttons[5].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[1].getBackground()==Color.BLUE) && buttons[6].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[1].getBackground()==Color.BLUE) && buttons[4].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[2].getBackground()==Color.BLUE) && buttons[3].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[2].getBackground()==Color.BLUE) && buttons[6].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[2].getBackground()==Color.BLUE) && buttons[7].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[2].getBackground()==Color.BLUE) && buttons[5].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[3].getBackground()==Color.BLUE) && buttons[7].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[3].getBackground()==Color.BLUE) && buttons[6].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[4].getBackground()==Color.BLUE) && buttons[5].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[4].getBackground()==Color.BLUE) && buttons[8].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[4].getBackground()==Color.BLUE) && buttons[9].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[5].getBackground()==Color.BLUE) && buttons[6].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[5].getBackground()==Color.BLUE) && buttons[9].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[5].getBackground()==Color.BLUE) && buttons[10].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[5].getBackground()==Color.BLUE) && buttons[8].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[6].getBackground()==Color.BLUE) && buttons[10].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[6].getBackground()==Color.BLUE) && buttons[7].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[6].getBackground()==Color.BLUE) && buttons[11].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[6].getBackground()==Color.BLUE) && buttons[9].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[7].getBackground()==Color.BLUE) && buttons[11].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[7].getBackground()==Color.BLUE) && buttons[10].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[8].getBackground()==Color.BLUE) && buttons[9].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[8].getBackground()==Color.BLUE) && buttons[12].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[8].getBackground()==Color.BLUE) && buttons[13].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[9].getBackground()==Color.BLUE) && buttons[10].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[9].getBackground()==Color.BLUE) && buttons[13].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[9].getBackground()==Color.BLUE) && buttons[14].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[9].getBackground()==Color.BLUE) && buttons[12].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[10].getBackground()==Color.BLUE) && buttons[14].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[10].getBackground()==Color.BLUE) && buttons[11].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[10].getBackground()==Color.BLUE) && buttons[13].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[10].getBackground()==Color.BLUE) && buttons[15].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[11].getBackground()==Color.BLUE) && buttons[14].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[11].getBackground()==Color.BLUE) && buttons[15].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[12].getBackground()==Color.BLUE) && buttons[13].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[13].getBackground()==Color.BLUE) && buttons[14].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
        if((buttons[14].getBackground()==Color.BLUE) && buttons[15].getBackground()==Color.BLUE){
            label.setText("Player 1 Wins! Click to play again>>");
            gameStarted=false;
        }
    }


    public void actionPerformed(ActionEvent e) {
        if(gameStarted) {//true
            for(int i = 0; i<16; i++){
                if(e.getSource()== buttons[i])
                    if(turn_1) {//true
                        if(buttons[i].getBackground()==Color.WHITE) {
                            buttons[i].setBackground(Color.RED);
                            turn_1= false;
                            label.setText("Player 2's turn...");
                            validate();
                        }
                    }
                    else {
                        if(buttons[i].getBackground()==Color.WHITE) {
                            buttons[i].setBackground(Color.BLUE);
                            turn_1= true;
                            label.setText("Player 1's turn...");
                            validate();
                        }
                    }

            }

        }

    }
}
