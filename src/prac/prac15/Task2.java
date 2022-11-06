package prac.prac15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Task2 {
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("Countries");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,150);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GRAY);
        jPanel.setPreferredSize(new Dimension(300,300));

        String[] items = {
                "Россия",
                "Америка",
                "Китай"
        };

        JLabel jLabel = new JLabel(items[0], JLabel.CENTER);
        jPanel.add(jLabel);

        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                jLabel.setText((String) comboBox.getSelectedItem());
            }
        });
        jPanel.add(comboBox);
        jFrame.getContentPane().add(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}