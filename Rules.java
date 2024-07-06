package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Approach each question with focus and clarity. Provide precise answers." + "<br><br>" +
                "2. Maintain a serious demeanor to respect the concentration of others around you." + "<br><br>" +
                "3. All questions must be attempted. No question is optional." + "<br><br>" +
                "4. While expressing frustration is natural, please do so quietly to avoid disturbing others." + "<br><br>" +
                "5. Seek knowledge through inquiry and respond wisely. Aim to be insightful in your answers." + "<br><br>" +
                "6. Do not feel disheartened if others seem to answer more quickly. Trust your own process." + "<br><br>" +
                "7. This quiz is designed to be challenging. Stay calm and collected." + "<br><br>" +
                "8. Strive to exceed expectations and best of luck in demonstrating your knowledge!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
