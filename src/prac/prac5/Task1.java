package prac.prac5;

import javax.swing.*;
import java.awt.*;

public class Task1 {
    public JFrame frame = new JFrame("Task1");
    public JPanel panel = new JPanel();
    public JButton ACMilanButton = new JButton("AC Milan");
    public JButton RealMadridButton = new JButton("Real Madrid");
    public JLabel lastScoreLabel = new JLabel();
    public JLabel resLabel = new JLabel();
    public JLabel winLabel = new JLabel();
    public int mil = 0;
    public int rea = 0;

    public Task1(){
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize( new Dimension(700, 400));
        panel.add(ACMilanButton);
        panel.add(RealMadridButton);
        panel.add(lastScoreLabel);
        panel.add(resLabel);
        panel.add(winLabel);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        ACMilanButton.addActionListener(e->{
            mil++;
            update("AC Milan");
        });
        RealMadridButton.addActionListener(e->{
            rea++;
            update("Real Marid");
        });
    }
    public void update(String last) {
        lastScoreLabel.setText("Last Score: " + last);
        resLabel.setText("Result: " + mil + " X " + rea);
        String winner = "DRAW";
        if (mil > rea) {
            winner = "AC Milan";
        }
        else if (rea > mil) {
            winner = "Real Madrid";
        }
        winLabel.setText("Winner: " + winner);
    }
    public static void main(String[] args) {
        new Task1();
    }
}
