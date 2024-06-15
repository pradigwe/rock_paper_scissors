import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rock Paper Scissors");
        // sets gui size
        frame.setSize(420,420);
        // quits java program once window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setLayout - no layout manager being used, so do and code everything manually
        frame.setLayout(null);
        // can't resize frame
        frame.setResizable(false);
        // allows gui to be visible

        // creates label frame
        JLabel label = new JLabel("Welcome to Rock Paper Scissors!");
        // where label starts and how large text box is - longer message = longer width
        label.setBounds(60, 15, 400, 100);
        // allows label to be visible
        frame.add(label);
        label.setFont(new Font("Verdana", Font.BOLD, 15));

        JButton button = new JButton("Click to Start");
        button.setBounds(120,150,150,30);
        frame.add(button);
        button.setFont(new Font("Verdana", Font.BOLD, 15));

        frame.setVisible(true);

        // when button clicked code in actionPerformed will run
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.remove(button);
                // refreshes gui after button is removed
                frame.revalidate();
                frame.repaint();

                // starts new game
                Game play = new Game();

                label.setBounds(115, 15, 200, 100);
                label.setText("You: " + play.getUser() + " Computer: " + play.getBot());

                // creates rock button
                JButton rock = new JButton("Rock");
                rock.setBounds(100, 120, 200, 50);
                frame.add(rock);                
                rock.setFont(new Font("Verdana2", Font.BOLD, 20));

                // creates paper button
                JButton paper = new JButton("Paper");
                paper.setBounds(100, 200, 200, 50);
                frame.add(paper);                
                paper.setFont(new Font("Verdana2", Font.BOLD, 20));

                // creates scissors button
                JButton scissors = new JButton("Scissors");
                scissors.setBounds(100, 280, 200, 50);
                frame.add(scissors);                
                scissors.setFont(new Font("Verdana2", Font.BOLD, 20));

                // activates rock button
                rock.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        play.play("rock");
                        label.setText("You: " + play.getUser() + " Computer: " + play.getBot());
                    }
                });

                paper.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        play.play("paper");
                        label.setText("You: " + play.getUser() + " Computer: " + play.getBot());
                    }
                });

                scissors.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        play.play("scissors");
                        label.setText("You: " + play.getUser() + " Computer: " + play.getBot());
                    }
                });
            }
        });

        
    }
}
