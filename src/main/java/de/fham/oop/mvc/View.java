package de.fham.oop.mvc;

import de.fham.oop.swing.SwingBasicsFrame;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JPanel {

    Model model;
    JButton jButton;
    JLabel jLabel;
    JFrame jFrame;

    public View(Model model, Controller controller){
        this.model = model;

        jFrame = new JFrame("MVC");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 200);

        jButton = new JButton("Hit me");
        jButton.addActionListener(controller);
        jFrame.add(jButton);

        jLabel = new JLabel();
        jFrame.add(jLabel);

    }

    public void update(){
        jLabel.setText(model.getText());
    }

}
